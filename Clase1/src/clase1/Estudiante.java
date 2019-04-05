/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author USRSIG
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    final int cedula;

    public Estudiante() {
        super();
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.cedula = 0;
    }

    public Estudiante(String nombre, String apellido, int edad, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + 
                "\nApellido: " + this.apellido +
                "\nEdad: " + this.edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
}
