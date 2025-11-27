/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_captura_clientes;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA3_11_CAPTURA_CLIENTES {
  
    public static void main(String[] args) {
String[] clientes = new String[5];
        double[] credito = new double[5];

        capturarClientes(clientes, credito);  // Pasamos ambos arreglos
        System.out.println("\n=== CLIENTES REGISTRADOS ===");
        imprimir(clientes);
        System.out.println("\n=== LÍMITES DE CRÉDITO ===");
        imprimir(credito);
        System.out.println("\n=== INFORMACIÓN COMPLETA ===");
        imprimir(clientes, credito);
    }

    // Método corregido: recibe ambos arreglos
    public static void capturarClientes(String[] clientes, double[] credito) {
        Scanner captu = new Scanner(System.in);
        System.out.println("=== CAPTURA DE CLIENTES ===");
        for (int i = 0; i < clientes.length; i++) {
            System.out.print("Nombre del cliente " + (i + 1) + ": ");
            clientes[i] = captu.nextLine();

            System.out.print("Límite de crédito del cliente " + (i + 1) + ": ");
            credito[i] = captu.nextDouble();
            captu.nextLine(); // ¡Importante! Limpia el salto de línea pendiente
        }
        captu.close();
    }

    // Imprimir solo nombres
    public static void imprimir(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + ". " + arreglo[i]);
        }
    }

    // Imprimir solo créditos
    public static void imprimir(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + ". $" + String.format("%.2f", arreglo[i]));
        }
    }

    // Imprimir ambos: nombre y crédito
    public static void imprimir(String[] clientes, double[] credito) {
        System.out.println("No.  Nombre cliente          Límite de crédito");
        System.out.println("---- ------------------------ ------------------");
        for (int i = 0; i < clientes.length; i++) {
            System.out.printf("%2d.  %-23s $%,.2f%n", (i + 1), clientes[i], credito[i]);
        }
    }
}