/*
GestionPersonas
clse persona con atributo final 
clase hija empleado con numss
 */
package gestionempleados;

import dominio.Persona;


public class GestionEmpleados {
     public static int cont = 1;
    public static void main(String[] args) {
       
        Persona p1 = new Persona("Elver","Gomez Torba");
        Persona p2 = new Persona("Rosa","Melano");      
        Persona p3 = new Persona("Max","Mestriner");      
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
    
}
