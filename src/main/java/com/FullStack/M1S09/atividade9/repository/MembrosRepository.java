package com.FullStack.M1S09.atividade9.repository;

import com.FullStack.M1S09.atividade9.entities.LivroEntity;
import com.FullStack.M1S09.atividade9.entities.MembrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembrosRepository extends JpaRepository<MembrosEntity, Long> {
}
