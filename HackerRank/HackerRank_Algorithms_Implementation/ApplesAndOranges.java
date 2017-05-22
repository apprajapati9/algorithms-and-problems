/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.HackerRank_Algorithms_Implementation;

import java.util.Scanner;

/**
 *
 * @author apprajapati
 */
public class ApplesAndOranges {
    
    public static  void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(); // Start of house
        int t = in.nextInt(); //end of house 
        int a = in.nextInt(); //apple
        int b = in.nextInt(); //orange
        int m = in.nextInt(); //how many apples?
        int n = in.nextInt(); //how many organges? 
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
       
        int apples = 0;
        for(int i = 0; i <  m ; i++){
            int sum = apple[i] + a;
            if(sum >= s && sum <= t){
                apples++;
            }
        }
        
        int oranges = 0;
        for(int i = 0; i < n; i++){
            int sum = orange[i] + b;
            if(sum >= s && sum <= t){
                oranges++;
            }
        }
        
        System.out.println(apples);
        System.out.println(oranges);
        
    }
}
