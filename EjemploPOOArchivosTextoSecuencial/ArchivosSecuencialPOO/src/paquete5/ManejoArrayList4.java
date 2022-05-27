/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;
import paquete1.Calificacion;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {
        

        Empresa empre1 = new Empresa("CocaCola", "Loja");
        Empresa empre2 = new Empresa("Rumiñahui", "Latacunga");
        Empresa empre3 = new Empresa("McDonalds", "Quito");
        Empresa empre4 = new Empresa("Hon Kong Tea", "Cuenca");

        
        
        
       
        System.out.println("-----------------------------");

        // ArrayList
        ArrayList<Empresa> empresas = new ArrayList<>();
        empresas.add(empre1);
        empresas.add(empre2);
        empresas.add(empre3);
        empresas.add(empre4);
        

        for (int i = 0; i < empresas.size(); i++) {
            System.out.printf("%s | %s \n",
                    empresas.get(i).obtenerNombre(),
                    empresas.get(i).obtenerCiudad());
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
