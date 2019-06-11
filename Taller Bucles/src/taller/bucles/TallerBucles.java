/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author USRSIG
 */
public class TallerBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TallerBucles bucles = new TallerBucles();
        //bucles.sumarParesImparesTeclado();
        //bucles.solicitarPosNegParImpar();
        bucles.compararDosNumeros();
    }

    private void sumarParesImparesTeclado() {
        int numero;
        int pares = 0;
        int impares = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta que número"));

        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) {
                pares += i;
            } else {
                impares += i;
            }
        }

        JOptionPane.showMessageDialog(null, "Suma de pares:\t" + pares
                + "\nSuma de impares:\t" + impares);
    }

    private void solicitarPosNegParImpar() {
        int numero;
        boolean positivo;
        boolean par;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        if (numero >= 0) {
            positivo = true;
        } else {
            positivo = false;
        }

        if (numero % 2 == 0) {
            par = true;
        } else {
            par = false;
        }

        String mensaje = "El número es:\t" + (positivo ? "positivo" : "negativo")
                + "\nY es:\t" + (par ? "par" : "impar");
        JOptionPane.showMessageDialog(null, mensaje);

    }

    private void compararDosNumeros() {
        int n1;
        int n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 2"));

        if (n1 == n2) {
            JOptionPane.showMessageDialog(null, "Los números " + n1 + " " + n2 + " son iguales");
        } else if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "El número 1 -> " + n1 + " es mayor al número 2 -> " + n2);
        } else {
            JOptionPane.showMessageDialog(null, "El número 2 -> " + n2 + " es mayor al número 1 -> " + n1);
        }

    }

    private void comprobarPrimoR() {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));

        
    }

}
