package com.FullStack.M1S09.atividade9.request;

import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.entities.MembrosEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class EmprestimosRequest {

    private Long id;

    private LivroEntity livro;
    private MembrosEntity membro;
    private Date dataEmprestimo;
    private Date dataDevolucao;
}
