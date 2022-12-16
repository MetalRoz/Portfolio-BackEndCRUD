package com.portfolio.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String urlimagen;
    private String nombre;
    private String urlproyecto;

    public Proyectos() {
    }

    public Proyectos(String urlimagen, String nombre, String urlproyecto) {
        this.urlimagen = urlimagen;
        this.nombre = nombre;
        this.urlproyecto = urlproyecto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrlimagen() {
        return urlimagen;
    }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlproyecto() {
        return urlproyecto;
    }

    public void setUrlproyecto(String urlproyecto) {
        this.urlproyecto = urlproyecto;
    }

}
