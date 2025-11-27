/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_tempe;
import java.util.Scanner;

public class EVA3_4_Tempe {

    public static void main(String[] args) {
Scanner captu = new Scanner(System.in);
        int opcion;
        double valor, resultado;

        do {
            System.out.println("===== MENÚ DE CONVERSIONES =====");
            System.out.println("1. Convertir Fahrenheit a Celsius");
            System.out.println("2. Convertir Celsius a Kelvin");
            System.out.println("3. Convertir Kelvin a Celsius");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = captu.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa grados Fahrenheit: ");
                    valor = captu.nextDouble();
                    resultado = convertirFarCelcius(valor);
                    System.out.printf("%.2f °F = %.2f °C%n%n", valor, resultado);
                    break;

                case 2:
                    System.out.print("Ingresa grados Celsius: ");
                    valor = captu.nextDouble();
                    resultado = convertirCelsKelvin(valor);
                    System.out.printf("%.2f °C = %.2f K%n%n", valor, resultado);
                    break;

                case 3:
                    System.out.print("Ingresa grados Kelvin: ");
                    valor = captu.nextDouble();
                    resultado = convertirKelvCelsius(valor);
                    System.out.printf("%.2f K = %.2f °C%n%n", valor, resultado);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.\n");
            }
        } while (opcion != 4);

        captu.close();
    }

    // Fahrenheit a Celsius
    public static double convertirFarCelcius(double far) {
        return (far - 32) * 5.0 / 9.0;  // Mejor precisión con 5/9 en lugar de /1.8
    }

    // Celsius a Kelvin
    public static double convertirCelsKelvin(double cels) {
        return cels + 273.15;
    }

    // Kelvin a Celsius
    public static double convertirKelvCelsius(double kelv) {
        return kelv - 273.15;
    }
}
    
