/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Samuel
 */
public class Libros implements Comparable {
    String titulo;
    String autor;
    String ISBN;
    int prezo;
    int unidades;

    public Libros(String titulo, String autor, String ISBN,int unidades, int prezo) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
      @Override
      public int compareTo(Object t) {  //Para que funcione hay que implementarlo arriba
       Libros a=(Libros) t;
      if(this.titulo.compareToIgnoreCase(a.titulo)>0) 
           return 1;
           else if(this.titulo.compareToIgnoreCase(a.titulo)<0)
               return -1;
      else
               return 0;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + " autor=" + autor + " ISBN=" + ISBN + " prezo=" + prezo + " unidades=" + unidades;
    }
      
      
    
}
