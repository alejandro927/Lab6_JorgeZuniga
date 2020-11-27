/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_jorgezuniga;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class AdministrarProgramas {
        private ArrayList<Programas> listaProgramas = new ArrayList();
    private File archivo = null;

    public AdministrarProgramas(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Programas> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programas> listaPersonas) {
        this.listaProgramas = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaProgramas;
    }

    //extra mutador
    public void setPrograma(Programas p) {
        this.listaProgramas.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Programas t : listaProgramas) {
                bw.write(t.getNombre() + "/");
                bw.write(t.getPuntuacion()+ "/");
                bw.write(t.getAnoLanzamiento()+ "/");
                bw.write(t.getTipo()+ "/");
                bw.write(t.getGenero()+ "/");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaProgramas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    listaProgramas.add( new Programas( sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next() ) );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
