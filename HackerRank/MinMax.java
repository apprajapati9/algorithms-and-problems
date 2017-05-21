/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author apprajapati
 * 
 * 
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range .
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
 */
public class MinMax {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        
    long[] array  = {a, b , c , d , e};
    long sum = 0;
    long tempSum = 0;
    long[] sumArray = new long[5];
    for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++){
           sum += array[j];
        }
        sum  = sum - array[i];
        sumArray[i] = sum;
        sum = 0;
    }
    
    Arrays.sort(sumArray);
    System.out.println(sumArray[0] + " " + sumArray[4]);
    

    }
}
