/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_paso_referencial;

/**
 *
 * @author zarat
 */
public class EVA3_8_PASO_REFERENCIAL {

    public static void main(String[] args) {
       int[] datos = new int[1];
       datos[0] = 5;
        System.out.println(datos);
        System.out.println("original = " + datos[0]);
        incrementar(datos);
        System.out.println("Despues de incrementar = " + datos[0]);
       
    }
    public static void incrementar(int[] arreglo){
        System.out.println(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] + 1;
        }
 
    }
}
