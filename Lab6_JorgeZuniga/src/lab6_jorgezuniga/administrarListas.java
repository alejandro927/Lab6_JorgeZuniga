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
public class administrarListas {
        private ArrayList<ListaDeClau> listasLista = new ArrayList();
    private File archivo = null;

    public administrarListas(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<ListaDeClau> getListalista() {
        return listasLista;
    }

    public void setListaProgramas(ArrayList<ListaDeClau> listasLista) {
        this.listasLista = listasLista;
    }

    @Override
    public String toString() {
        return "ListaDeLista=" + listasLista;
    }

    //extra mutador
    public void setListaClau(ListaDeClau p) {
        this.listasLista.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (ListaDeClau t : listasLista) {
                bw.write(t.getNombre() + "/");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listasLista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    listasLista.add( new ListaDeClau(sc.next()) );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
