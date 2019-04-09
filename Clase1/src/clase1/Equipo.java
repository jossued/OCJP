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
public enum Equipo {
    Madrid("Madrid",1), Barcelona("FC Barcelona", 2), 
    Porto("Porto FC", 3), Sevilla("Sevilla FC", 4);
    
    private String nombreClub;
    private int puesto;

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    private Equipo() {
    }

    private Equipo(String nombreClub, int puesto) {
        this.nombreClub = nombreClub;
        this.puesto = puesto;
    }
    
}
