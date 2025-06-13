/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobiblioteca;

/**
 *
 * @author LENOVO
 */
public class libro {
    
    String titulos;
    String autor;
    boolean disponible;
    String categoria;
    
    public libro(String titulos, String autor, boolean disponible, String categoria) {
        this.titulos = titulos;
        this.autor = autor;
        this.disponible = disponible;
        this.categoria = categoria;
        
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
