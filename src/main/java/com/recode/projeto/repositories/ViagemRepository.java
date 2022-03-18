package com.recode.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recode.projeto.entities.Viagem;


@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {

}
