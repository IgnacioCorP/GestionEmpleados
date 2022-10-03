/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import gestionempleados.GestionEmpleados;

/**
 *
 * @author Alumno Mañana
 */
public class Persona {
    public String nombre, apellido;
    int a = GestionEmpleados.cont;

    
    public Persona() {
        GestionEmpleados.cont++;
    }
   
    public Persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void imprimir(){
        System.out.println("IMPRIMIENDO DESDE LA CLASE PADRE");
    }
    
    @Override
    
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", apellido: " + apellido + ", Persona número: " + a + '}';
    }

   
   
    
    
}
