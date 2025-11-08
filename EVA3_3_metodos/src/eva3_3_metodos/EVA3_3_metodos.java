/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_metodos;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA3_3_metodos {
    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        do{
          imprimirMenu();
          valor = captu.nextInt();
          //manejo de opciones --> switch
          switch(valor){
              case 1:
                  System.out.println("****Sumar dos numeros****");
                  realizarSuma();
                  break;
              case 2:
                  System.out.println("****Calcular potencia****");
                  realizarPotencia();
                  break;
              case 3:
                  break;
          }
        }while(valor !=4);       
    }
    //IMPRIMIR UN MENU:
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Elige la opcion que necesitas");
        System.out.println("1. calcular una suma ");
        System.out.println("2. calcular una potencia ");
        System.out.println("3. imprimir un mensaje ");
        System.out.println("4. terminar ");
    
    }
    //
    public static void realizarSuma(){
         Scanner captu = new Scanner(System.in);
         int val1, val2;
         System.out.println("Valor 1:");
         val1= captu.nextInt();
         System.out.println("Valor 2:");
         val2= captu.nextInt();
         int resu = sumar(val1, val2);
         System.out.println("La suma es" + resu);
    }
    public static int sumar(int num1, int num2){
      return num1 + num2;
    }
    public static void realizarPotencia(){
    Scanner captu = new Scanner(System.in);
         int val1, val2;
         System.out.println("Base:");
         val1= captu.nextInt();
         System.out.println("Exponente:");
         val2= captu.nextInt();
         
    }
    public static int calcularPotencia(int base, int expo){
      //ciclo --> for
      //acumulador --> multiplicacion
      int potencia = 1;
      for (int i = 1; i <= expo; i++){
         potencia = potencia * base; 
         System.out.println("La potencia es");
      }
      return potencia;
    }
}
