/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;


import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
     private String nombre;
    private int numeroCamas;
    private double presupuesto;
    private String idHospital;
    
    public Hospital(String n, int m, double b, String i){
        nombre = n;
        numeroCamas = m;
        presupuesto = b;
        idHospital = i;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumeroCamas(int n){
        numeroCamas = n;
    }
    
    public void establecerPresupuesto(double n){
        presupuesto = n;
    }
    
    public void establecerIdHospital (String n){
        idHospital = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
    public String obtenerIdHospital(){
        return idHospital;
    }
    
    @Override
    public String toString() {
        
        
          String cadena = String.format("%s (Con %d camas y $%.2f de presupuesto; ID:%s)\n",
                    obtenerNombre(),
                    obtenerNumeroCamas(),
                    obtenerPresupuesto(),
                    obtenerIdHospital());
        
        return cadena;
    }
        

}

/* 
    Agregar valor de objetos de tipo Hospital a un archivo
    Y leer el archivo
*/
