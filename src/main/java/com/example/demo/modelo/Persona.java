package com.example.demo.modelo;

import javax.persistence.*;

@Entity
@Table(name = "datos_api")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String dni;
    private String nacimiento;

    public Persona(){

    }

    public Persona(int id, String nombre, String dni, String nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.nacimiento = nacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
}
