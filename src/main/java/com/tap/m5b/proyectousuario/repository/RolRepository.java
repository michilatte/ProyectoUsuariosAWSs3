/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tap.m5b.proyectousuario.repository;

import com.tap.m5b.proyectousuario.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author USUARIO
 */
public interface RolRepository extends JpaRepository<Rol, Integer>{
        @Query(value = "Select * from rol r where r.tipo = :tipo", nativeQuery = true)
    public Rol buscarRol(String tipo);
}
