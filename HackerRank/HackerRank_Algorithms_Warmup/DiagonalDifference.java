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
 * 
 * 
 * Given a square matrix of size n x n, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, n . The next N lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is: 
11
      5
            -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
            4
      5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15
 */
public class DiagonalDifference{
    
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num");
        int n = scan.nextInt();
        
        for(int i = 0 ; i < n; i++){
            
            for(int j = 0 ;j < n ; j++){
                
               
                
            }
            
        }
        
    }
    
  
    
}
