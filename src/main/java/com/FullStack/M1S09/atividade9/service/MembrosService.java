package com.FullStack.M1S09.atividade9.service;

import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.entities.MembrosEntity;
import com.FullStack.M1S09.atividade9.repository.LivroRepository;
import com.FullStack.M1S09.atividade9.repository.MembrosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembrosService {

    private final MembrosRepository membrosRepository;

    public List<MembrosEntity> listarMembros() {
        return membrosRepository.findAll();
    }

    public MembrosEntity salvaMembros(MembrosEntity membrosEntity) {
        return membrosRepository.save(membrosEntity);
    }
}
