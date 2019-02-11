/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author Samuel
 */
public class Metodos {

    public void crearLibro(ArrayList<Libros> lista) {
        String titulo;
        String autor;
        String ISBN;
        int prezo;
        int unidades;

        titulo = PedirDatos.lerString("titulo: ");
        autor = PedirDatos.lerString("autor: ");
        ISBN = PedirDatos.lerString("ISBN: ");
        unidades = PedirDatos.enteiro("unidades: ");
        prezo = PedirDatos.enteiro("prezo: ");

        Libros al = new Libros(titulo, autor, ISBN, unidades, prezo);
        lista.add(al);
    }

    public void darBaja(String ISBN, ArrayList<Libros> lista) {
        if(lista.isEmpty()==true)
            JOptionPane.showMessageDialog(null, "Introudzca primero un libro");
        else{
        for (Libros al : lista) {
            if (ISBN.equalsIgnoreCase(al.getISBN())) { //ignora si la letra que ponemos es mayuscula o miniscula. Si el DNI añadido es igual al qu hay en la lista(lo compara con el get) se borra ese elemento
                lista.remove(al);
                break;
            }
        }
    }
    }

    public void amosarLibros(ArrayList<Libros> lista) {
        if(lista.isEmpty()==true)
            JOptionPane.showMessageDialog(null, "Introudzca primero un libro");
        else{
        for (Libros al : lista) {
            System.out.println(al);
        }
        }
    }

    public void buscarElemento(String titulo, ArrayList<Libros> lista) {
        if(lista.isEmpty()==true)
            JOptionPane.showMessageDialog(null, "Introudzca primero un libro");
        else{
        for (Libros al : lista) {
            if (titulo.equalsIgnoreCase(al.getTitulo())) { //ignora si la letra que ponemos es mayuscula o miniscula. Si el DNI añadido es igual al qu hay en la lista(lo compara con el get) se borra ese elemento
                JOptionPane.showMessageDialog(null, al);
                break;
            }
        }
        }
    }

    public void venderLibro(ArrayList<Libros> lista) {
        if(lista.isEmpty()==true)
            JOptionPane.showMessageDialog(null, "Introudzca primero un libro");
        else{
        for (Libros al : lista) {
            if (al.getUnidades() <= 0) {
                lista.remove(al);
            } else
                al.unidades --;
            }
        }
    }
    }
