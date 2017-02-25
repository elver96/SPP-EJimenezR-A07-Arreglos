/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.a07;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPPEJimenezRA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        long[] agenda=new long[10];
        for(int i = 0; i<agenda.length;i++){
            System.out.println("Introduce un número telefónico para guardarlo en la casilla "+i);
            agenda[i]=kb.nextLong();
        }
        System.out.println("Introduzca la casilla del numero que desee solicitar");
        int i=kb.nextInt();
        if(i>10){
            System.out.println("Fuera de rango");
        }else{
            System.out.println("El numero de la persona "+i+" es "+agenda[i]);
        }
    }
}