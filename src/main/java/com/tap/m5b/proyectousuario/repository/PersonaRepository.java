/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tap.m5b.proyectousuario.repository;

import com.tap.m5b.proyectousuario.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author USUARIO
 */
public interface PersonaRepository extends JpaRepository<Persona, Integer>{
        @Query(value = "Select * from persona p where p.cedula = :cedula", nativeQuery = true)
    public Persona buscarPersona(String cedula);
}
