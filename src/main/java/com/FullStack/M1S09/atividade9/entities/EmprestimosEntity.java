package com.FullStack.M1S09.atividade9.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "emprestimos")
@Entity
@Data
@NoArgsConstructor
public class EmprestimosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_livro")
    private LivroEntity livro;

    @ManyToOne
    @JoinColumn(name = "id_membro")
    private MembrosEntity membro;

    private Date dataEmprestimo;
    private Date dataDevolucao;

    public EmprestimosEntity(LivroEntity livro, MembrosEntity membro, Date dataEmprestimo, Date dataDevolucao) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public EmprestimosEntity(Long id, LivroEntity livro, MembrosEntity membro, Date dataEmprestimo, Date dataDevolucao) {
        this.id = id;
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }



}
