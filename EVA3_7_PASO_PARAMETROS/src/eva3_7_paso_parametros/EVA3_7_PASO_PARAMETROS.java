/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_paso_parametros;

/**
 *
 * @author zarat
 */
public class EVA3_7_PASO_PARAMETROS {

    public static void main(String[] args) {
     int nume = 5;
        System.out.println("original = "+ nume);
          incrementar(nume);//SE MANDA UNA COPIA DEL VALOR ALMACENADO
          System.out.println("Despues de incrementar = " + nume);
    }
    //INCREMENTA UN ENTERO EN 1
    public static void incrementar(int valor){
       valor = valor + 1;    
    }
}
