/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @ss
 */
public class Ejecutor {
    public static void main(String[] args) {
    String nombreArchivo = "hospital.txt";
        
        Hospital h1 = new Hospital("Hospital María Santa", 500, 1350.10);
        Hospital h2 = new Hospital("Hospital Cruz Roja", 450, 1500.22);
        Hospital h3 = new Hospital("Hospital Isidro Ayora", 340, 1300.33);
        Hospital h4 = new Hospital("Hospital San Agustín", 280, 2100.90);
        
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        
        Hospital[] lista = {h1, h2, h3, h4};

        for (int i = 0; i <= lista.length-1; i++) {
            archivo.establecerRegistro(lista[i]);
            archivo.establecerSalida();
        }
       
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        lectura.cerrarArchivo();
}
}



