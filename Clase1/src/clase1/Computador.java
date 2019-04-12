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
public class Computador {
    private String marca; 
    private String modelo; 
    private Pantalla pantalla;

    public Computador() {
        this.marca = "";
        this.modelo = "";
        this.pantalla = null;
    }

    public Computador(String marca, String modelo, Pantalla pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }
    
    @Override
    public String toString() {
        return "Modelo: "+this.modelo
                +"\nMarca: "+this.marca
                +"\nPantalla: "+this.pantalla.toString();
    }
    
}
