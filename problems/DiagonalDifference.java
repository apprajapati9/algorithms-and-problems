package warmup_hackerrank;

import java.util.Scanner;

/*
Class created By : Ajay
*/


public class DiagonalDifference {
	
/*
	 
 Given a square matrix of size N×NN×N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, NN. The next NN lines denote the matrix's rows, with each line containing NN space-separated integers describing the columns.

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
	
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int value = in.nextInt();
	
		withoutArray(value);
		withArray(value);
			
		}

	private static void withArray(int value) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[][] twoDimArray = new int[value][value];
		
		for ( int i = 0; i < value; i++){
			for(int j=0; j < value; j++){
				
				twoDimArray[i][j] = in.nextInt();
				
			}
			
		}
		int sum1 = 0;
		int sum2 = 0;
		
		for ( int i= 0 , j = twoDimArray.length - 1 ; i < twoDimArray.length; i++, j--){
			
			sum1 = sum1 + twoDimArray[i][i];
			sum2 = sum2 + twoDimArray[i][j];
			
		}
		//System.out.println(sum1+ "here" + sum2);
		
		int difference = Math.abs(sum1 - sum2); // absolute value
		System.out.println(difference);
		
	}

	private static void withoutArray(int value) {
		// TODO Auto-generated method stub
		int currentInput;
		Scanner sc = new Scanner(System.in);
		
		int sum1 = 0 ;
		int sum2 = 0 ;
		for(int j = 0; j < value; j++){
		    for(int k = 0; k < value; k++){
		        currentInput = sc.nextInt() ;
		        if(j == k){
		            sum1 += currentInput;
		        }
		        if(j+k == (value-1)){
		            sum2 += currentInput;
		        }
		    }
		}
		System.out.println(Math.abs(sum1- sum2));
	}
}
