/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_sobrecarga;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA3_13_SOBRECARGA {

    public static void main(String[] args) {
        String resu;
        resu = capturar("Introduce el nombre del cliente:");
        System.out.println(resu);
    }
    public static String capturar (String mensaje){
      Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        return captu.nextLine();        
    }
}
