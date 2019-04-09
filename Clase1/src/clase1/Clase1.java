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
        
        Dias d = Dias.Lunes;
        JOptionPane.showMessageDialog(null, d);
        
        
        Equipo eq = Equipo.Barcelona;
        JOptionPane.showMessageDialog(null, eq.getNombreClub());
        
    }
    
}
