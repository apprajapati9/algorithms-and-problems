/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HackerRank.HackerRank_Algorithms_Implementation;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author apprajapati
 * For problem question please look at grading-English.pdf
 */
public class GradingStudents {
    
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            int temp = grade;
            for(int i = temp ; i%5!=0 && i>=38;i++){
                temp+=1;                      
            }
            if(temp - grade < 3){
                grade = temp;
                grades[a0] = grade;        
            }else{
                grades[a0] = grade;
            }
        }
        for( int i = 0; i < grades.length; i++){
            System.out.println(grades[i]);
        }
   
    }
}