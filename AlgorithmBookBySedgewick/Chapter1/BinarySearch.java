/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmBookBySedgewick.Chapter1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author apprajapati
 */

/*
Given an array A of n elements with values or records A0 ... An−1, sorted such that A0 ≤ ... ≤ An−1, 
and target value T, the following subroutine uses binary search to find the index of T in A.[6]

Set L to 0 and R to n − 1.
If L > R, the search terminates as unsuccessful.
Set m (the position of the middle element) to the floor of (L + R) / 2.
If Am < T, set L to m + 1 and go to step 2.
If Am > T, set R to m – 1 and go to step 2.
Now Am = T, the search is done; return m.
*/
public class BinarySearch {
    
    
    public static int indexOf(int target, int[] a){
        int low = 0 ;
        int high = a.length - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target < a[mid]){
                high = mid -1;
               
            }else if(target>a[mid]) {
                low = mid + 1;
            }else 
                return mid;
        }
        return -1;
    }
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] array = new int[number];
        
        for(int i = 0 ; i < number; i++){
            array[i] = scan.nextInt();
        }
        
        Arrays.sort(array);
        

       for(int i = 0 ; i< array.length; i++){
           if(BinarySearch.indexOf(number, array) == -1){
            System.out.println(number);
             }else{
               System.out.println(".");
           }
       }

        
    }
    
}
