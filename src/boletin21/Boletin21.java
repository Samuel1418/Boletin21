/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import paquete2.Metodos;
import paquete2.Libros;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author Samuel
 */
public class Boletin21 {
    public static void main(String[] args){
    ArrayList<Libros> lista= new ArrayList<Libros>();
    String op;
    String titulo;
    Metodos obx=new Metodos();
    do{
    op = PedirDatos.lerString("***Menu***\n1ºEngdir\n2ºVender\n3ºAmosar\n4ºBaixa\n5ºConsulta\n6ºSi quire sair escriba: Salir");
        switch(op){
            case "Engadir": obx.crearLibro(lista);
            break;
            case "vender": obx.venderLibro(lista);
            break;
            case "Amosar":  Collections.sort(lista);
            obx.amosarLibros(lista);
            break;
            case "Baixa": obx.darBaja(titulo=JOptionPane.showInputDialog("Introduzca ISBN del libro que desea dar de baja"), lista);
            break;
            case "Consulta": obx.buscarElemento(titulo=JOptionPane.showInputDialog("Introduzca Titulo que desea buscar, por favor"), lista);
            break;
            case "Salir": System.exit(0);    
            break;
    }
 }while(op!="Salir");
}
}