/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.HackerRank_Algorithms_Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author apprajapati
 */
public class LCMAndGCMFinder {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
//        
//        System.out.println("Enter two values");
//        int one = scan.nextInt();
//        int two = scan.nextInt();
        
        
        int[] arraya = {2,3,6} ;
        int[] arrayb = {42,84};
        
       // leastCommonMultiple(array);
      // System.out.println(getGCD(array[0], array[1]));
     //  System.out.println("Using While: "+getGCDUsingWhile(array[0], array[1]));
        //System.out.println(leastCommonMultiple(array));
        
                

        long lcmA = LCMOfArray(arraya);
        long gcdB = getGCDOnArray(arrayb);
        
        int j= 0;

//        for(long i = 1; i <= gcdB; i++){
//            
//            System.out.println("multiple: "+lcmA*i );
//            System.out.println("isDivide? "+ lcmA*i % gcdB);
//            if(lcmA*i % gcdB == 0){
//                j++;
//            }
//        }

          for(long i = lcmA, k= 2; i <= gcdB; i=lcmA*k, k++){
              if(gcdB%i==0){
                  j++;
              }
          }

//        for(long i = lcmA, k = 2; i <= gcdB; i=lcmA*k, k++){
//            System.out.println("k="+ k + "i="+i);
//            if(gcdB % i == 0){
//                j++;
//            }
//        }
//        
        
        System.out.println("LCM arraya" + lcmA);
        System.out.println("GCD arrayb" + gcdB);
        System.out.println("j = " + j);

    }
    
    public static long LCMOfArray(int[] array){
        
        long lcm = array[0] ;
        for(int i = 0 ; i < array.length; i++){
           
            int j = i;
          //  System.out.println("lcm loop="+leastCommonMultiple(lcm, array[i++]) + " array i++" +array[j++] );
            lcm = leastCommonMultiple(lcm, array[j++]);
        }
        
        return lcm;
    }
    
    public static long leastCommonMultiple(long a , long b){
       
       
       // System.out.println("LCM" + one*(two/getGCD(one,two)));
        return a*(b / getGCD(a, b));
        
//        List<Integer> multipleOfOne = new ArrayList<>();
//        int mulOne = 0;
//        for(int i = 1; i < one ; i++ ){
//           if(one % i == 0){
//               multipleOfOne.add(i);
//           }
//        }
//        
//        
//        
//        List<Integer> multipleOfTwo = new ArrayList<>();
//        for(int i = 1 ;i < two; i++){
//            if(two % i == 0){
//              multipleOfTwo.add(i);  
//            }
//        }
//        
//        for(int n : multipleOfOne){
//            System.out.print(n+",");
//        }
//        System.out.println();
//        System.out.println("------");
//         for(int n : multipleOfTwo){
//            System.out.print(n+",");
//        }

    }

    private static long getGCD(long a , long b) {    
        if(a == 0 || b == 0) 
            return a+b;
        else {
            
            //System.out.println("Remeinder" + a%b + " and b" + b);
            return getGCD(b, a % b);
        }
            
        
    }
    
    public static int getGCDUsingWhile(int a, int b){
        
        while(a!=0 && b !=0){
            int c = b;
            b = a % b;
            a = c;
        }
        return a+b;
    }

    private static long getGCDOnArray(int[] array) {
       
        long gcd = 0;
        for(int i = 0 ; i< array.length; i++ ){
            
                 gcd = getGCD(array[i],gcd);
                 //System.out.println("array[i]" + array[i] + "Gcd local "+ gcd);  
        }
       
        return gcd;
    }
}


/*

LCM equation : a * ( b / gcd(a, b))

GCD equation : gcd ( b, a % b)

*/
