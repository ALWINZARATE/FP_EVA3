/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_sobrecarga_de_metodo;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA3_14_Sobrecarga_de_metodo {
    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
    int opcion;
    do {
        System.out.println("====MENU DE AREAS====");
        System.out.println("1. Calcula el area del circulo");
        System.out.println("2.Calcular area del rectengulo ");
        System.out.println("3. Calcular area del trapecio");
        System.out.println("3. Calcular area del trapecio");
        System.out.println("4. Salir");
        System.out.println("Elije una opcion: ");
        opcion = captu.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Ingresa el radio del rectangulo:");
                double radio = captu.nextDouble();
                System.out.println("El area del circulo es: " + calcularArea(radio));
                break;
                
            case 2:
                System.out.println("Ingresa la base del rectangulo: ");
                double base = captu.nextDouble();
                System.out.println("Ingresa la altura del rectangulo: ");
                double altura = captu.nextDouble();                            
                System.out.println("El area del rectangulo es: " + circuloArea(base, altura));
                break;
                
            case 3:
                System.out.println("Ingresa la base mayor del trapecio: ");
                double baseMayor = captu.nextDouble();
                System.out.println("Ingresa la base menor del trapecio: ");
                double baseMenor = captu.nextDouble();       
                System.out.println("Ingresa la altura del trapecio: ");
                double h = captu.nextDouble();                       
                System.out.println("El area del trapecio es: " + calcularArea(baseMayor));
                break;
                
            case 4:
                System.out.println("Saliendo...");
                break;
                
            default:
                System.out.println("Opcion invalida. intente de nuevo.");               
        }       
     } while (opcion != 4);
    
    }
    //Area del circulo
    public static double circularArea(double radio){
      return Math.PI * radio * radio;   
      
    }
    
    //Area del rectangulo
    public static double circularArea(double base, double altura){
       return base * altura;   
    }
    
    //Area del trapecio 
    public static double circularArea(double baseMayor, double baseMenor, double altura){
    
        return 0;
    
    }

    private static String calcularArea(double radio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static String circuloArea(double base, double altura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
