/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.HackerRank_Algorithms_Implementation;

import java.util.Scanner;

/**
 *
 * @author apprajapati999
 */
public class BetweenTwoSets {


    static int getTotalX(int[] a, int[] b){
        
        long lcmA = a[0] , gcdB = 0;
        
        
        for ( int i = 0 ; i < a.length; i++){
            int j = i;
            lcmA = getLCM(lcmA, a[j++]);
        }
        
        for( int i = 0 ; i < b.length; i++){
            
            gcdB = getGCD(b[i], gcdB);
        }
        
        int counter = 0;
       
         for(long i = lcmA, k = 2; i <= gcdB; i=lcmA*k, k++){
            if(gcdB % i == 0){
                counter++;
            }
        }
        
        return counter;
    }
    
    public static long getLCM(long a, long b){
        
        return a * ( b / getGCD(a, b));
        
    }
    
    public static long getGCD(long a , long b){
        
        if(a == 0 || b == 0 ){
            return a +b;
        }
        
        return getGCD(b, a % b);
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int[] a = new int[n];
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
//        int[] b = new int[m];
//        for(int b_i=0; b_i < m; b_i++){
//            b[b_i] = in.nextInt();
//        }
         int[] a = {2,3,6} ;
        int[] b = {42,84};
        int total = getTotalX(a, b);
        System.out.println(total);

    }
}
