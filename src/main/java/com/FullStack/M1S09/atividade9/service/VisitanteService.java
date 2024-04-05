package com.FullStack.M1S09.atividade9.service;

import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.entities.VisitanteEntity;
import com.FullStack.M1S09.atividade9.repository.LivroRepository;
import com.FullStack.M1S09.atividade9.repository.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitanteService {
    private final VisitanteRepository visitanteRepository;

    public List<VisitanteEntity> listarVisitantes() {
        return visitanteRepository.findAll();
    }

    public VisitanteEntity salvaVisitante(VisitanteEntity visitanteEntity) {
        return visitanteRepository.save(visitanteEntity);
    }

    public void deletaVisitante(Long id) {
        visitanteRepository.deleteById(id);
    }
    public ResponseEntity<String> deletarVisitante(Long id) {
        if(!visitanteRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O visitante " + id + " não existe.");
        }
        visitanteRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("O visitante " + id + " foi excluído do cadastro.");
    }
}
