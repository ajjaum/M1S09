package com.FullStack.M1S09.atividade9.service;

import com.FullStack.M1S09.atividade9.entities.BibliotecarioEntity;
import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.repository.BibliotecarioRepository;
import com.FullStack.M1S09.atividade9.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public List<BibliotecarioEntity> listarBibliotecarios() {
        return bibliotecarioRepository.findAll();
    }

    public BibliotecarioEntity salvaBibliotecario(BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioRepository.save(bibliotecarioEntity);
    }
}
