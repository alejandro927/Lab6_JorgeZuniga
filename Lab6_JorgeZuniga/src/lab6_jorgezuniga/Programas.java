/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_jorgezuniga;

import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class Programas {
    private String nombre;
    private int puntuacion;
    private Date anoLanzamiento;
    private String Tipo;
    private String Genero;

    public Programas() {
    }

    public Programas(String nombre, int puntuacion, Date anoLanzamiento, String Tipo, String Genero) {
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

    public Date getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(Date anoLanzamiento) {
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
