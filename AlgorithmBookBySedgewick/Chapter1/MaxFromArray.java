/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmBookBySedgewick.Chapter1;

import java.util.Scanner;

/**
 *
 * @author apprajapati
 */
public class MaxFromArray {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        
        int n1 = scan.nextInt();
        int[] array = new int[n1];
        
        for(int i = 0 ; i < n1; i++){
           array[i] = scan.nextInt();
        }
        
        //Find the max value from Array
       // System.out.println("MaxValue from array"  + maxValue(array));
       // System.out.println("Average: " + avgValueFromArray(array));
        //double[] copied = copyOfArray(array);
        //System.out.println(copied);
        
        int[] reversed = new int[array.length];
        reversed = reverseArray(array);
        for(int i = 0 ; i < reversed.length; i++){
            System.out.println(reversed[i]);
        }
        
    }
    
    public static int maxValue(int[] a){
        
        int max = a[0];
        
        for(int i = 1 ; i < a.length; i++){
            if(a[i] > max) 
                max = a[i];
        }
        
        return max;
    }

    private static double avgValueFromArray(int[] array) {
        
        double sum = 0;
        int len = array.length;
        double avg;
        
        for(int i = 0; i < array.length ; i++){
            
            sum += array[i]; 
        }
        
        avg = (sum / len);
    
        return avg;
    }

    private static double[] copyOfArray(int[] array) {

        int len = array.length;
        double[] cp = new double[len];
        for(int i = 0 ; i < len; i++){
            cp[i] = array[i];
            System.out.println("Copied Array:" + cp[i]);
        }
       

        return cp;
    }
    
    private static int[] reverseArray(int[] array){
        
        int len = array.length;
       // double[] reverseAr = new double[len];
        
        for(int i= 0 ; i < len/2; i++)
        {
            double temp = array[i]; // saving the temporary variable  of a[i] - right position side
            array[i] = array[len-1-i]; // now saving array[5-1-i] would give us 4, 3, 2 , 1 position so putting 0 , 1 2 3 4 position into 4 3 2 1
            array[len-i-1] = (int) temp; // now 5-i-1 - 4, 3 , 2 1 = temp 
             
        }        
        return array;
    }
}
