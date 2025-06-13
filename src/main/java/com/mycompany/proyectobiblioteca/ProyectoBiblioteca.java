/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectobiblioteca;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ProyectoBiblioteca {

  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option = 0;
        int opt2 = 0;
        int opt3 = 0;
        int salirLibros = 0;
        int favoritosSalir = 0;
        Scanner entrada = new Scanner(System.in);
        
        libro libros[] = {
            new libro ("el señor de los anillos", "J. R. R. Tolkien", true, "Novela"),
            new libro ("Cien años de soledad", "Gabriel Garcia Marquez", true, "Novela"),
            new libro ("Aprende a programar en Java: de cero al infinito", "Osvaldo Cairó", true, "Tecnologia"),
            new libro ("Introducción a la Psicología", "Paul Kleinman", true, "Psicología"),
            new libro ("Tulio en su salsa: recetas, historias y recomendaciones", "Tulio Zuloaga", true, "Cocina"),
        };

        Scanner selection = new Scanner(System.in);
        
        do {
            System.out.println("Menu de tu biblioteca online");
            System.out.println("Ingrese el numero de opcion de su eleccion: ");
            System.out.println("1. Libros");
            System.out.println("2. Libros Favoritos");
            System.out.println("0. Salir");
            
            option = selection.nextInt();
            
            switch(option){
                case 1: 
                    do {
                       System.out.println("Menu Libros");
                       System.out.println("Ingrese el numero de opcion de su eleccion: ");
                       System.out.println("1. Todos los libros");
                       System.out.println("2. Libros disponibles");
                       System.out.println("3. Agregar Libro");
                       System.out.println("4. Categorias");
                       System.out.println("0. Salir");
                       
                       opt2 = selection.nextInt();
                       
                       do {
                            switch(opt2){
                           case 1: 
                               System.out.println("Todos nuestros libros: ");
                               for (int i = 0; i<libros.length; i++) {
                                   String disponible = libros[i].disponible ? "Disponible" : "No Disponible";
                                   System.out.println(String.format("* Libro: %s - Autor: %s - %s", libros[i].titulos, libros[i].autor, libros[0].disponible));
                               }
                               break;
                           case 2: 
                               System.out.println("Libros Disponibles: ");
                               for(int i=0; i<libros.length; i++) {
                                               if(libros[i].disponible){
                                                    System.out.println(String.format("* Libro: %s - Autor: %s - %s", libros[i].titulos, libros[i].autor, libros[0].disponible));
                                                }  
                                           } 
                               break;
                           case 3: 
                               
                               break;
                           case 4:
                               do {
                                   System.out.println("Categorias: ");
                                   System.out.println("1. Novela");
                                   System.out.println("2. Tecnologia");
                                   System.out.println("3. Cocina");
                                   System.out.println("4. Psicologia");
                                   System.out.println("5. otra");
                                   System.out.println("0. Salir");
                               
                                   
                                   opt3 = selection.nextInt();
                                   
                                   switch (opt3) {
                                       case 1:
                                           System.out.println("Libros de categoria Novelas: ");
                                           for(int i=0; i<libros.length; i++) {
                                               if(libros[i].categoria == "Novela"){
                                               System.out.println(String.format("* Libro: %s - Autor: %s - %s", libros[i].titulos, libros[i].autor, libros[0].disponible));
                                                }  
                                           } 
                                          break;
                                       case 2:
                                           System.out.println("Libros de categoria Tecnologia: ");
                                            for(int i=0; i<libros.length; i++) {
                                               if(libros[i].categoria == "Tencologia"){
                                               System.out.println(String.format("* Libro: %s - Autor: %s - %s", libros[i].titulos, libros[i].autor, libros[0].disponible));
                                                }  
                                           } 
                                           break;
                                       case 3:
                                           System.out.println("Libros de categoria Cocina: ");
                                            for(int i=0; i<libros.length; i++) {
                                               if(libros[i].categoria == "Cocina"){
                                                    System.out.println(String.format("* Libro: %s - Autor: %s - %s", libros[i].titulos, libros[i].autor, libros[0].disponible));
                                                }  
                                           } 
                                           break;
                                       case 4:
                                           System.out.println("Libros de categoria Psicologia: ");
                                            for(int i=0; i<libros.length; i++) {
                                               if(libros[i].categoria == "Psicologia"){
                                               System.out.println(String.format("* Libro: %s - Autor: %s - %s", libros[i].titulos, libros[i].autor, libros[0].disponible));
                                                }  
                                           } 
                                           break;
                                       case 5:
                                           System.out.println("Libros de categoria Otra: ");
                                            for(int i=0; i<libros.length; i++) {
                                               if(libros[i].categoria != "Psicologia" && libros[i].categoria != "Cocina" &&  libros[i].categoria != "Tencologia" && libros[i].categoria != "Novela"){
                                               System.out.println(String.format("* Libro: %s - Autor: %s - %s", libros[i].titulos, libros[i].autor, libros[0].disponible));
                                                }  
                                           } 
                                       default:
                                           break;
                                   }
                               } while(opt3 != 0);
                           default:
                               break;  
                       }  

                        System.out.println("");
                        System.out.println("0. atras");

                       } while(salirLibros != 0);
                       
                    } while(opt2 != 0);
                    break;
                case 2:
                    
                    libro librosFavoritos[] = {
                        new libro ("el señor de los anillos", "J. R. R. Tolkien", true, "Novela"),
                        new libro ("Tulio en su salsa: recetas, historias y recomendaciones", "Tulio Zuloaga", true, "Cocina")
                    };

                    do {

                         for(int i=0; i<librosFavoritos.length; i++) {
                                System.out.println(String.format("* Libro: %s - Autor: %s - %s", librosFavoritos[i].titulos, librosFavoritos[i].autor, librosFavoritos[0].disponible));
                         }
                        System.out.println("");
                        System.out.println("0. Atras");

                    } while(favoritosSalir != 0);

                    break;
                
                default:
                    break;
            }
        }
        while(option!=0);
    }
 
}
