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
public class Factors {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number ");
        int n = scan.nextInt();

        for(int i=2; i<=n; i++){
            while(n%i==0){
                System.out.println(i + "| " + n);
                System.out.println(" -----");
                n = n/i;
            }
        }
    }
}
