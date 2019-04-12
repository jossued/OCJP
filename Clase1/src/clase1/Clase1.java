/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import javax.swing.JOptionPane;

/**
 *
 * @author USRSIG
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Estudiante est = new Estudiante();
        String nom, ape;
        int ed;
        
        nom = JOptionPane.showInputDialog("Ingrese un nombre");
        ape = JOptionPane.showInputDialog("Ingrese un apellido");
        ed = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        
        
        est.setNombre(nom);
        est.setApellido(ape);
        est.setEdad(ed);
        
        
        //Estudiante est2 = new Estudiante(nom, ape, ed, 0);
        
        JOptionPane.showConfirmDialog(null, est2.toString());
        //JOptionPane.showConfirmDialog(null, est.toString());
        */
        
        /*
        Dias d = Dias.Lunes;
        JOptionPane.showMessageDialog(null, d);
        
        
        Equipo eq = Equipo.Barcelona;
        JOptionPane.showMessageDialog(null, eq.getNombreClub());
        */
        
        /*
        String placaAux, marcaAux, colorAux;
        placaAux = JOptionPane.showInputDialog("Ingrese la placa");
        marcaAux = JOptionPane.showInputDialog("Ingrese la marca");
        colorAux = JOptionPane.showInputDialog("Ingrese el color");
        
        Auto autoAux = new Auto();
        autoAux.setColor(colorAux);
        autoAux.setMarca(marcaAux);
        autoAux.setPlaca(placaAux);
        
        JOptionPane.showMessageDialog(null, autoAux.toString());
        
        String companiaAux, tipoAux;
        companiaAux = JOptionPane.showInputDialog("Ingrese la compañia del taxi");
        tipoAux = JOptionPane.showInputDialog("Ingrese el tipo de taxi");
        
        Taxi taxi = new Taxi(companiaAux, tipoAux, placaAux, colorAux, marcaAux);
        
        JOptionPane.showMessageDialog(null, taxi.toString());
        */
        
        String marcaComp, modeloComp, marcaPantalla, resolucionPantalla;
        
        marcaComp = JOptionPane.showInputDialog("Ingrese la marca del computador");
        modeloComp = JOptionPane.showInputDialog("Ingrese el modelo del computador");
        marcaPantalla = JOptionPane.showInputDialog("Ingrese la marca de la pantalla");
        resolucionPantalla = JOptionPane.showInputDialog("Ingrese la resolucion de la pantalla");
        
        Pantalla pan = new Pantalla(marcaPantalla, resolucionPantalla);
        Computador computador = new Computador(marcaComp, modeloComp, pan);
        
        JOptionPane.showMessageDialog(null, computador.toString());
        
    }
    
}
