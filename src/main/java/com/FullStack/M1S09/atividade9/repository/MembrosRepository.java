package com.FullStack.M1S09.atividade9.repository;

import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.entities.MembrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MembrosRepository extends JpaRepository<MembrosEntity, Long> {
    @Query(name = "Update MembroEntity m " +
            " Set m.nome = :nome, " +
            " m.endereco = :endereco, " +
            " m.telefone = :telefone " +
            " where m.id = :id")
    MembrosEntity update(@Param("id") Long id,
                        @Param("nome") String nome,
                        @Param("endereco") String endereco,
                        @Param("telefone") String telefone);
}
