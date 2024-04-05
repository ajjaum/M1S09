package com.FullStack.M1S09.atividade9.controller;

import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.entities.MembrosEntity;
import com.FullStack.M1S09.atividade9.service.LivroService;
import com.FullStack.M1S09.atividade9.service.MembrosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membros")
@RequiredArgsConstructor
public class MembrosController {

    private final MembrosService membrosService;

    @GetMapping
    public List<MembrosEntity> retornarMembros() {
        return membrosService.listarMembros();
    }

    @PostMapping
    public MembrosEntity salvarMembros(@RequestBody MembrosEntity membrosEntity ) {
        return membrosService.salvaMembros(membrosEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarMembros(@PathVariable("id") Long id) {
        return membrosService.deletarMembros(id);
    }
}
