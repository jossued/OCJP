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
public class Pantalla {
    private String marca;
    private String resolucion;

    public Pantalla() {
        this.marca = "";
        this.resolucion = "";
    }

    public Pantalla(String marca, String resolucion) {
        this.marca = marca;
        this.resolucion = resolucion;
    }

    public String getMarca() {
        return marca;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    
   @Override
    public String toString() {
        return "\nResolucion: "+this.resolucion
                +"\nMarca: "+this.marca;
    } 
   
}
