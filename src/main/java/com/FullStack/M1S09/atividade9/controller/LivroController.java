package com.FullStack.M1S09.atividade9.controller;

import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.service.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;

    @GetMapping
    public List<LivroEntity> retornarLivros() {
        return livroService.listarLivros();
    }

    @PostMapping
    public LivroEntity salvarLivros(@RequestBody LivroEntity livroEntity) {
        return livroService.salvaLivro(livroEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarLivro(@PathVariable("id") Long id) {
        return livroService.deletarLivro(id);
    }
}
