/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
       
  Scanner in = new Scanner (System.in); 
     int bilangan;
      System.out.print("Masukan Data : " );
     bilangan = in.nextInt();
     fibbonacci (bilangan);
       
    }
    
   public static void fibbonacci (int bilangan) {
       int total = 0;
        int jumlah = 0;
       if (bilangan == 0){
           System.out.print("0");
       } else if (bilangan == 1){
           System.out.print("0 1");
       }else { 
           System.out.print("0 1 ");
           int a = 0;
           int b = 1;
           for (int i = 1; i < bilangan; i++) {
               int number = a + b;
               System.out.print(number + " ");
               a= b ;
               b = number;
               total += jumlah;
               
           }
       }
        System.out.println("\nJumlah = " + total);
    }
    
}
