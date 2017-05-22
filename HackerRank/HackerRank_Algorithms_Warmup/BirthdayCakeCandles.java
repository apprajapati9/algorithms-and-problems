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
public class BirthdayCakeCandles {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        int biggest = 0;
        int counter = 0; 
        for(int i = 0 ; i < height.length; i++){
            if(height[i] > biggest){
                biggest = height[i];
              System.out.println("Biggest Changed" + biggest);
                counter = 0;
                System.out.println("Counter Changed " +counter);
            }
            if(height[i] == biggest){
                counter++;
                System.out.println("How many? =" + counter);
            }
        }
        
        System.out.println(counter);
    }
}
