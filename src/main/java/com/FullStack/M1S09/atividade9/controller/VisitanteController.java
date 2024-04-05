package com.FullStack.M1S09.atividade9.controller;

import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.entities.VisitanteEntity;
import com.FullStack.M1S09.atividade9.service.LivroService;
import com.FullStack.M1S09.atividade9.service.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitante")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteService visitanteService;

    @GetMapping
    public List<VisitanteEntity> retornarVisitante() {
        return visitanteService.listarVisitantes();
    }

    @PostMapping
    public VisitanteEntity salvarVisitantes(@RequestBody VisitanteEntity visitanteEntity) {
        return visitanteService.salvaVisitante(visitanteEntity);
    }

    @DeleteMapping
    public String deletarVisitantes(@RequestParam("id") Long id) {
        return "Visitante excluído do cadastro.";
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarVisitante(@PathVariable("id") Long id) {
        return visitanteService.deletarVisitante(id);
    }
}
