
package javaapplication30;

import java.util.Scanner;

public class JavaApplication30 {
    
  static int calculateSum(int n) 
    { 
        if (n <= 0) 
           return 0; 
       
        int fibo[]=new int[n+1]; 
        fibo[0] = 0; fibo[1] = 1; 
       
        // Initialize result 
        int sum = fibo[0] + fibo[1]; 
       
        // Add remaining terms 
        for (int i=2; i<=n; i++) 
        { 
            fibo[i] = fibo[i-1]+fibo[i-2]; 
            sum += fibo[i]; 
        } 
       
        return sum; 
    } 
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
          int n = 0; 
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        n = scan.nextInt();
        
        System.out.println(" ");
        
        System.out.print("Output: "+ calculateSum(n)); 
        System.out.println("");
    }
    
}
