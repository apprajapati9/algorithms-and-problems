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
 */
public class BirthdayChocolate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        //System.out.println(Arrays.toString(array));
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (!Arrays.toString(array).contains(String.valueOf(m))) {
            System.out.println(0);
        } else {

            for (int i = 0; i < array.length; i++) {
                if (array[i] == m) {
                    int back = array[i--];
                    int front = array[i++];
                    if(m+back == d && m+front == d){
                      
                    }
                }
            }
        }

    }

}
