package com.FullStack.M1S09.atividade9.service;

import com.FullStack.M1S09.atividade9.entities.EmprestimosEntity;
import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.repository.EmprestimosRepository;
import com.FullStack.M1S09.atividade9.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimosService {

    private final EmprestimosRepository emprestimosRepository;

    public List<EmprestimosEntity> listarEmprestimos() {
        return emprestimosRepository.findAll();
    }

    public EmprestimosEntity salvarEmprestimos(EmprestimosEntity emprestimosEntity) {
        return emprestimosRepository.save(emprestimosEntity);
    }

    public ResponseEntity<String> deletarEmprestimos(Long id) {
        if(!emprestimosRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O empréstimo " + id + " não existe.");
        }
        emprestimosRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("O empréstimo " + id + " foi excluído da base de dados.");
    }
}
