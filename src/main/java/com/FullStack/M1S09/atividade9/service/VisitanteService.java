package com.FullStack.M1S09.atividade9.service;

import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.entities.VisitanteEntity;
import com.FullStack.M1S09.atividade9.repository.LivroRepository;
import com.FullStack.M1S09.atividade9.repository.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitanteService {
    private final VisitanteRepository visitanteRepository;

    public List<VisitanteEntity> listarVisitantes() {
        return visitanteRepository.findAll();
    }

    public VisitanteEntity salvaVisitante(VisitanteEntity visitanteEntity) {
        return visitanteRepository.save(visitanteEntity);
    }
}
