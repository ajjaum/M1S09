package com.FullStack.M1S09.atividade9.controller;

import com.FullStack.M1S09.atividade9.entities.EmprestimosEntity;
import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.request.EmprestimosRequest;
import com.FullStack.M1S09.atividade9.service.EmprestimosService;
import com.FullStack.M1S09.atividade9.service.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
@RequiredArgsConstructor
public class EmprestimosController {

    private final EmprestimosService emprestimosService;

    @GetMapping
    public List<EmprestimosEntity> retornarEmprestimos() {
        return emprestimosService.listarEmprestimos();
    }

     @PostMapping //mapeia o método POST do REST, esse adiciona dados
    public EmprestimosEntity salvarEmprestimos(@RequestBody EmprestimosRequest emprestimosEntity) {
        return emprestimosService.salvarEmprestimos(
                new EmprestimosEntity(
                        emprestimosEntity.getId(),
                        emprestimosEntity.getLivro(),
                        emprestimosEntity.getMembro(),
                        emprestimosEntity.getDataEmprestimo(),
                        emprestimosEntity.getDataDevolucao()
                ));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarEmprestimos(@PathVariable("id") Long id) {
        return emprestimosService.deletarEmprestimos(id);
    }
}
