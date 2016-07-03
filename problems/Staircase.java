

import java.util.Scanner;

/*
 
 Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?

Input 
You are given an integer NN depicting the height of the staircase.

Output 
Print a staircase of height NN that consists of # symbols and spaces. For example for N=6N=6, here's a staircase of that height:

     #
    ##
   ###
  ####
 #####
######
Note: The last line has 0 spaces before it.

 
 */

public class Staircase {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		

		System.out.println("--------ReverseStaircase-----------"+ number);
		reverseStaircase(number);
		System.out.println("--------ProgressStaircase-----------"+ number);
		progressStaircase(number);
		System.out.println("-------upsideDown------------"+ number);
		upsideDownStaircase(number);
		System.out.println("--------upsideDownTwo-----------"+ number);
		upsideDownStaircaseTwo(number);
	}
		
		private static void upsideDownStaircaseTwo(int number) {
			
			for (int i =0 ; i < number; i++){
				for ( int j =0 ; j < number; j++){
					
					if (i+j <= number - 1){
						System.out.print("#");
					}
					else
						System.out.print(" ");
					
				}
				System.out.println();
			}
		
	}

		private static void upsideDownStaircase(int number) {
		
		for ( int i = 0 ; i < number ; i++){
			
			for ( int j = 0 ; j < number; j++){
				
				if(i<=j){
					System.out.print("#");
				}
				else 
					System.out.print(" ");
				
			}
			System.out.println();
			
		}
		
	}

	private static void progressStaircase(int number) {
		
		
		for ( int i = 0 ; i < number ; i++){
			
			for ( int j = 0 ; j < number ; j++){
					
				 if ( i >= j)
					System.out.print("#");	
				 else
					 System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}

	private static void reverseStaircase(int number) {
		
		for ( int i = 0 ; i < number ; i++){	
			for( int j = 0 ; j < number; j++){
				 
				if(i + j >= number - 1){
	                    System.out.print("#");
	            
				}else {
	            
					System.out.print(" ");
	                }
			}
			System.out.println();
				
		}
	}
	

}
