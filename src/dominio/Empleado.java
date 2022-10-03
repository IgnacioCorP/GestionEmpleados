/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alumno Mañana
 */
 public class Empleado extends Persona{
    public int numss;

    public Empleado(int numss) {
        this.numss = numss;
    }

    public Empleado(int numss, String nombre, String apellido) {
        super(nombre, apellido);
        this.numss = numss;
    }

    
    
    public int getNumss() {
        return numss;
    }

    public void setNumss(int numss) {
        this.numss = numss;
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

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    
    @Override
    public void imprimir(){
        System.out.println("Desde el empleado");
    }

    
    @Override
    public String toString() {
        return "Empleado{" + "numss=" + numss + '}';
    }
    
    
}
