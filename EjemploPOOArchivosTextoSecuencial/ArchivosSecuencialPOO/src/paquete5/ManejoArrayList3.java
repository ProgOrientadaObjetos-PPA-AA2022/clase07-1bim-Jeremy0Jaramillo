/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;
import paquete1.Calificacion;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        Calificacion c1 = new Calificacion(10, "Ciencias");
        Calificacion c2 = new Calificacion(7.8, "Matemáticas");
        Calificacion c3 = new Calificacion(6.6, "Lenguaje");
        
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Profesor prof3 = new Profesor("Melissa Gilbert", "contratado");

        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        c3.establecerProfesor(prof3);

        
       /* 
        // Arreglo
        Profesor [] profesores = new Profesor[3];
        profesores[0] = prof1;
        profesores[1] = prof2;
        profesores[2] = prof3;
        
        
        for (int i = 0; i < profesores.length; i++) {
            System.out.printf("%s - %s\n", profesores[i].obtenerNombre(),
                    profesores[i].obtenerTipo());
        }
        */
       
        System.out.println("-----------------------------");
        
        // ArrayList
        ArrayList <Calificacion> calificaciones2 = new ArrayList<>();
        calificaciones2.add(c1);
        calificaciones2.add(c2);
        calificaciones2.add(c3);
        
        
        for (int i = 0; i < calificaciones2.size(); i++) {
            System.out.printf("%s | %s - %.2f\n",
                    calificaciones2.get(i).obtenerProfesor().obtenerNombre(),
                    calificaciones2.get(i).obtenerNombreMateria(),
                    calificaciones2.get(i).obtenerNota());
        }
        
        System.out.println("-----------------------------");
       /* 
        Profesor prof3 = new Profesor("Melissa Gilbert", "contratado");
        c3.establecerProfesor(prof3);
        for (int i = 0; i < calificaciones2.size(); i++) {
            System.out.printf("%s - %s\n", calificaciones2.get(i).obtenerNombreMateria(),
                    calificaciones2.get(i).obtenerNota(),
                    calificaciones2.get(i).obtenerProfesor());
        }
*/
    }

}
