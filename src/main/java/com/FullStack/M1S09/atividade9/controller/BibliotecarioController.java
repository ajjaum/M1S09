package com.FullStack.M1S09.atividade9.controller;

import com.FullStack.M1S09.atividade9.entities.BibliotecarioEntity;
import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.service.BibliotecarioService;
import com.FullStack.M1S09.atividade9.service.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecario")
@RequiredArgsConstructor
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;

    @GetMapping
    public List<BibliotecarioEntity> retornarBibliotecarios() {
        return bibliotecarioService.listarBibliotecarios();
    }

    @PostMapping
    public BibliotecarioEntity salvarBibliotecario(@RequestBody BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioService.salvaBibliotecario(bibliotecarioEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarBibliotecario(@PathVariable("id") Long id) {
        return bibliotecarioService.deletarBibliotecario(id);
    }
}
