/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tap.m5b.proyectousuario.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 *
 * @author USUARIO
 */
@Data
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int id_persona;

    @NotBlank(message = "Llene el campo nombre")
    @Column(name = "nombre")
    private String nombre;

    @NotBlank(message = "Llene el campo apellido")
    @Column(name = "apellido")
    private String apellido;

    @NotBlank(message = "Llene el campo cedula")
    @Column(name = "cedula")
    private String cedula;

    @Email(message = "Ingrese un correo válido")
    @Column(name = "correo")
    private String correo;

    @Size(min = 7, max = 10, message = "El telefono debe tener entre 7 y 10 digitos")
    @NotBlank(message = "Llene el campo telefono")
    @Column(name = "telefono")
    private String telefono;

    @NotBlank(message = "Llene el campo direccion")
    @Column(name = "direccion")
    private String direccion;

    @NotBlank(message = "Llene el campo fecha de nacimiento")
    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;

    @NotBlank(message = "Llene el campo de instruccion")
    @Column(name = "instruccion")
    private String instruccion;
    
    @JsonIgnore //si no sale los datos en swagger es por la falta de este json
    @OneToMany(mappedBy = "persona")
    private List<Usuario> listaUsuarios;
    
}
