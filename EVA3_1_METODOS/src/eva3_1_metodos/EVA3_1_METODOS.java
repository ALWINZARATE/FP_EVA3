/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author zarat
 */
public class EVA3_1_METODOS {
     //
    public static void main(String[] args) {
       //INVOCAR EL METODO
       //LLAMADADA A PROCEDIMIENTO O FUNCION 
       //1. si queremos recuperar el valor
       
       //1. guarda el valor 
       int resu = calcularCuadrado(4);
        System.out.println("El cuadrado de 4 es " + resu);
        //2.USAR EL VALOR SIN GUARDARLO
        System.out.println("El cuadrado de 4 es " + calcularCuadrado(4));
        //3. no me intersea el resultado 
        calcularCuadrado(4);
    }
    //MODIFICADORES
    //MODIFICADOR DE ACCESO: public, private, protrcted, default
    //static --> se nesesita para usar nuestros metodos en el manin 
    //public static
                    //VALOR DE RETORNO(tipo de dato)
                     //NOMBRE DE METODO (USAR VERBO)
                            //(LISTA DE PARAMETROS)
                           //CERO O N CANTIDADES 
   public static int calcularCuadrado(int num){ //ENCABEZADO (
         //{} -->IMPLEMENTACION DEL METODO (CUERPO DEL METODO) 
         int cuadrado = num * num;
         return cuadrado; // regresamos el resultado
         //ya no se puede poner codigo aqui 
         //System.out.println(""); //error, no se puede poner codigo 
           
   }           
}
