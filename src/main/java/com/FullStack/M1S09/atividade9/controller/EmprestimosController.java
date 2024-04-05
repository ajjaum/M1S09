package com.FullStack.M1S09.atividade9.controller;

import com.FullStack.M1S09.atividade9.entities.EmprestimosEntity;
import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.service.EmprestimosService;
import com.FullStack.M1S09.atividade9.service.LivroService;
import lombok.RequiredArgsConstructor;
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

    @PostMapping
    public EmprestimosEntity salvarEmprestimos(@RequestBody EmprestimosEntity emprestimosEntity) {
        return emprestimosService.salvaEmprestimos(emprestimosEntity);
    }
}
