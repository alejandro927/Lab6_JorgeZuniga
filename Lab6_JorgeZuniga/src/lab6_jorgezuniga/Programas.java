/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_jorgezuniga;

import java.awt.Component;

/**
 *
 * @author Alejandro
 */
public class Programas {

    static void show(Component component, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String nombre;
    private int puntuacion;
    private int anoLanzamiento;
    private String Tipo;
    private String Genero;

    public Programas() {
    }

    public Programas(String nombre, int puntuacion, int anoLanzamiento, String Tipo, String Genero) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.anoLanzamiento = anoLanzamiento;
        this.Tipo = Tipo;
        this.Genero = Genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Puntuacion=" + puntuacion + ", F. Lanzamiento=" + anoLanzamiento + ", Tipo=" + Tipo + ", Genero=" + Genero;
    }
    
    
    
}
