/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.HackerRank_Algorithms_Warmup;

import java.util.Scanner;

/**
 *
 * @author apprajapati
 */
public class Factors {
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int f = factors(n);
       
        if(f == 2){
            System.out.println("prime");
        }
        
        printPrimes(n);
        
       
    }
    
    public static int factors(int n){
        int j = 0;
         for(int i = 1 ; i <= n; i++){
            if(n%i == 0){
                System.out.println(i);
                j++;
            }
        } 
        return j;
    }

    private static void printPrimes(int n) {
        
        if(n < 2) 
            System.out.println("Not Primes");
//        for(int i = 2; i*i <= n;i++){
//         
//            if(n%i==0){
//                System.out.println("Prime :" + i);
//            }
//        }
       
        
    }
}
