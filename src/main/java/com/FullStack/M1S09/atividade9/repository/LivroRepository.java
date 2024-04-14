package com.FullStack.M1S09.atividade9.repository;

import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    @Query(name = "Update LivroEntity l" +
            " l.titulo = :titulo, " +
            " l.anoPublicacao = :ano_publicacao" +
            " where l.id = :id")
    LivroEntity update(@Param("id") Long id,
                       @Param("titulo") String titulo,
                       @Param("ano_publicacao") Long anoPublicacao);
}
