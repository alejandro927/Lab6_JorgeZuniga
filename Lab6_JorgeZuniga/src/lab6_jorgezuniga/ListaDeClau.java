/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_jorgezuniga;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ListaDeClau {
    private String nombre;
    private ArrayList<Programas> listaclau = new ArrayList();

    public ListaDeClau() {
    }

    public ListaDeClau(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programas> getListaclau() {
        return listaclau;
    }

    public void setListaclau(ArrayList<Programas> listaclau) {
        this.listaclau = listaclau;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }
    
}
