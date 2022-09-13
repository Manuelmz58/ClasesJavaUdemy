/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author soporte
 */
public class Pruebaaritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 4;
        aritmetica1.sumar();
        
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado de la prueba = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(8, 9);
        System.out.println("resultado con argumentos  = " + resultado);
    }
    
}
