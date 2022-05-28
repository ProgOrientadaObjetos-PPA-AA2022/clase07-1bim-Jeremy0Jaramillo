/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;




public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "data/hospitales.data";

        Hospital h1 = new Hospital("Hospital San Juan", 570, 1300.50, "01101");
        Hospital h2 = new Hospital("Hospital Solca", 600, 2000.50, "110011");
        Hospital h3 = new Hospital("Hospital UTPL", 320, 300.50,"1001101");
        
        

        Hospital[] lista = {h1, h2, h3};

        EscrituraArchivoSecuencial archivo = new
         EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospitales();
        System.out.println(lectura);
    }
}
