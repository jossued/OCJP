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
public class Taxi extends Auto{
    private String compania;
    private String tipo;

    public Taxi() {
        super();
        this.compania = "";
        this.tipo = "";
    }

    public Taxi(String compania, String tipo, String placa, String color, String marca) {
        super(placa, color, marca);
        this.compania = compania;
        this.tipo = tipo;
    }

    public String getCompania() {
        return compania;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCompañia: "+this.compania
                +"\nTipo: "+this.tipo;
    }
}
