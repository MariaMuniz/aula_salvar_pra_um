package com.salvar_pra_um.salvar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salvar_pra_um.salvar.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
