package javaapplication28;

import java.util.Scanner;

public class JavaApplication28 {


  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int angka;
      System.out.println("Masuk angka : ");
      angka = in.nextInt();
    if(angka == 4){
         for (int i=1;i<=4;i++){
             for(int j=4;j>=i;j--){
                 System.out.print(" ");
             }
             for(int k=1;k<=i;k++){
                 System.out.print("*");
             }
             for (int l=1;l<=i-1;l++){
                 System.out.print("*");
             }
             System.out.println();
         }
   for (int i=1;i<=5;i++){
             for(int j=1;j<=i-1;j++){
                 System.out.print(" ");
             }
             for(int z=5;z>=i;z--){
              System.out.print("*");
              }
             for(int k=4;k>=i;k--){
               System.out.print("*");
               }
             System.out.println("");
         }
    }else if(angka == 8){
   
 
        for (int i = 0; i < (2 * angka) + 1; i++) { 
 
            for (int j = 0; j < (2 * angka) + 1; j++) { 
 
                if (i < angka) { 
                    if ((j > angka - i) && (j < angka + i)) { 
                        System.out.print("*"); 
                    } else { 
                        System.out.print("0"); 
                    } 
                } else { 
 
                    if ((j > i - angka) && (j < 3*angka-i)) { 
                        System.out.print("*"); 
                    } else { 
                        System.out.print("0"); 
                    } 
 
                } 
            } 
            System.out.println(); 
 
        } 

  }
  }
} 