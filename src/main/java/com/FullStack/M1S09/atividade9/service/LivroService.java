package com.FullStack.M1S09.atividade9.service;

import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;

    public List<LivroEntity> listarLivros() {
        return livroRepository.findAll();
    }

    public LivroEntity salvaLivro(LivroEntity livroEntity) {
        return livroRepository.save(livroEntity);
    }

    public ResponseEntity<String> deletarLivro(Long id) {
        if(!livroRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O livro de ID " + id + " não existe.");
        }
        livroRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Livro " + id + " excluído da base de dados.");
    }
}
