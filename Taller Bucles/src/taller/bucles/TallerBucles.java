/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.bucles;

import static java.lang.Math.*;
import java.util.StringTokenizer;
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
        //bucles.compararDosNumeros();
        //bucles.comprobarPrimoR();
        //bucles.calculadora();
        //bucles.numDigitos();
        //bucles.piramideNumeros();
        //bucles.piramideAsteriscos();
        bucles.paralelogrameAsteriscos();
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
        boolean mas = false;
        boolean esPrimo;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
            esPrimo = esPrimo(n);
            if (esPrimo) {
                JOptionPane.showMessageDialog(null, "\nEl número " + n + " es primo");
            } else {
                JOptionPane.showMessageDialog(null, "\nEl número " + n + " no es primo");
            }
            int opc = JOptionPane.showConfirmDialog(null, "Quiere introducir otro número?");
            System.out.println(opc);
            if (opc == 0) {
                mas = true;
            }
        } while (mas == true);

    }

    public static Boolean esPrimo(int numero) {
        Boolean esPrimoActual = true;
        if (numero < 2) {
            esPrimoActual = false;
        } else {
            for (int x = 2; x * x <= numero; x++) {
                if (numero % x == 0) {
                    esPrimoActual = false;
                    break;
                }
            }
        }
        return esPrimoActual;
    }

    public void calculadora() {
        String Datos = JOptionPane.showInputDialog("Ingrese dos números separados por ,");
        StringTokenizer tokens = new StringTokenizer(Datos, ",");
        float a = Float.parseFloat(tokens.nextToken());
        float b = Float.parseFloat(tokens.nextToken());

        JOptionPane.showMessageDialog(null, "Suma= " + (a + b) + "\nResta= " + (a - b) + "\nMultiplicación= " + (a * b) + "\nDivisión= " + (a / b)
                + "\nPotencia= " + pow(a, b) + "\nRaiz Cuadrada de " + a + "= " + sqrt(a) + "\nRaiz Cuadrada de " + b + "= " + sqrt(b)
                + "\n" + b + "raiz de " + a + " =" + pow(a, 1 / b));

    }

    private void numDigitos() {
        int a = 0, aux = 0;
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entre 0 y 999"
                    + "\nIngrese 0 para salir"));
            if (a / 10 >= 1) {
                if (a / 100 >= 1) {
                    if (a / 1000 >= 1) {

                    } else {
                        aux = 3;
                    }
                } else {
                    aux = 2;
                }
            } else {
                aux = 1;
            }
            JOptionPane.showMessageDialog(null, "El número " + a + " tiene " + aux + " cifras");

        } while (a != 0);
    }

    private void piramideNumeros() {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número no negativo"));

        String cadena = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                cadena += j;
            }
            cadena += "\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }

    private void piramideAsteriscos() {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el alto del triangulo"));
        String cadena = "";
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                cadena = cadena + "*";
            }
            cadena = cadena + "\n";

        }
        JOptionPane.showMessageDialog(null, cadena);
    }

    private void paralelogrameAsteriscos() {
        String Datos = JOptionPane.showInputDialog("Ingrese el alto y el ancho del paralelogramo separados por ,");
        StringTokenizer tokens = new StringTokenizer(Datos, ",");
        int a = Integer.parseInt(tokens.nextToken());
        int b = Integer.parseInt(tokens.nextToken());
        String cadena = "";

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                cadena = cadena + "*";
            }
            cadena = cadena + "\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}
