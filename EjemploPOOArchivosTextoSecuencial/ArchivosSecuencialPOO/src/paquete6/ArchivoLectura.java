/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class ArchivoLectura {

    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Hospital> lista;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s",
                nombreArchivo);

        File f = new File(rutaArchivo);
        if (f.exists()) {
            try {
                entrada = new Scanner(new File(rutaArchivo));
                
            } 
            catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);

            } 
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public void establecerLista() {
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split(";")));
                
                String nombre = linea_partes.get(0);
                
                int numCama = Integer.parseInt(linea_partes.get(1));
                
                Double presup = Double.parseDouble(linea_partes.get(2));
                
                Hospital p = new Hospital(nombre, numCama, presup);
                lista.add(p);

            }
        }
    }

    public ArrayList<Hospital> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString() {
        String cadena = "Lista Hospitales\n";
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%s(%d) %s %d %.2f\n", cadena,
                    i + 1,
                    obtenerLista().get(i).obtenerNombre(),
                    obtenerLista().get(i).obtenerNumeroCamas(),
                    obtenerLista().get(i).obtenerPresupuesto());
        }
        return cadena;
    }
}
