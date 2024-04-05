package com.FullStack.M1S09.atividade9.service;

import com.FullStack.M1S09.atividade9.entities.BibliotecarioEntity;
import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.repository.BibliotecarioRepository;
import com.FullStack.M1S09.atividade9.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity<String> deletarBibliotecario(Long id) {
        if(!bibliotecarioRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O Bibliotecario de número " + id + " não existe.");
        }
        bibliotecarioRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Bibliotecário " + id + " removido com sucesso.");
    }
}
