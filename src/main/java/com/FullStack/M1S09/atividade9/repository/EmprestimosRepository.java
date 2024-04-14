package com.FullStack.M1S09.atividade9.repository;

import com.FullStack.M1S09.atividade9.entities.EmprestimosEntity;
import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.entities.MembrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface EmprestimosRepository extends JpaRepository<EmprestimosEntity, Long> {
    @Query(
            name = "Update EmprestimosEntity e " +
                    " SET" +
                    " e.livro = :livro ," +
                    " e.membro = :membro ," +
                    " e.data_emprestimo = :data_emprestimo ," +
                    " e.data_devolucao = :data_devolucao " +
                    " where e.id = :id "
    )
    EmprestimosEntity update(@Param("id") Long id,
                             @Param("livro") LivroEntity livro,
                             @Param("membro") MembrosEntity membro,
                             @Param("data_emprestimo") LocalDate dataEmprestimo,
                             @Param("data_devolucao") LocalDate dataDevolucao);
}
