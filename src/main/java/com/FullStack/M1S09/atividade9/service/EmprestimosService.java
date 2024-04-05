package com.FullStack.M1S09.atividade9.service;

import com.FullStack.M1S09.atividade9.entities.EmprestimosEntity;
import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.repository.EmprestimosRepository;
import com.FullStack.M1S09.atividade9.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimosService {

    private final EmprestimosRepository emprestimosRepository;

    public List<EmprestimosEntity> listarEmprestimos() {
        return emprestimosRepository.findAll();
    }

    public EmprestimosEntity salvaEmprestimos(EmprestimosEntity emprestimosEntity) {
        return emprestimosRepository.save(emprestimosEntity);
    }
}
