/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_arreglos_mrtodos;

/**
 *
 * @author zarat
 */
public class EVA3_6_ARREGLOS_MRTODOS {
    static String[] menu = {"Productos","Ventas","Clientes","Salir"};
   static String[] productos = {"Tacos","Tortas","Tamales","Hamburgesas"};
    public static void main(String[] args) {
        // TODO code application logic here
       imprimirArreglo(menu);
        imprimirArreglo(productos);
    }
    //IMPRIMIR UN ARREGLO
      public static void imprimirArreglo(String[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + ". " +arreglo [i]);
        }
        System.out.println("");
      }}