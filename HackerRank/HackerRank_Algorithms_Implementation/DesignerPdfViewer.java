/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.HackerRank_Algorithms_Warmup.HackerRank_Algorithms_Implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author apprajapati
 * 
 * input of 1 to 26 number as a height of each char
 * 
 * if input abc then a = 1, b = 2, c = 3
 * 
 * pick the number with that position with entered number to calculate area.
 * 
 * tallest * word.size = area; 
 * mm2
 * 
 * Sample Input

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc
Sample Output

9
 * 
 */
public class DesignerPdfViewer {
    
     public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
    
//        String[] wordArray = word.split("");
//        
//        System.out.println(Arrays.toString(wordArray));
        word.toLowerCase();
        if(word.length()>10){
             word.substring(0, 9);     
        }
       
        int position = 0;
        int[] height = new int[word.length()];
        for(int i = 0 ; i < word.length(); i++){
            position = word.charAt(i)-'a'+1; // z = 122 - 97 + 1 // any ASCII value of word - a/A +1 would give you correct position of word
            //System.out.println(position+ "<--");
            height[i] = h[position-1];
        }
        Arrays.sort(height);
        //System.out.println(Arrays.toString(height)+ "<--, and tallest is:" + (height.length-1));
        int tallest = height[height.length - 1];
        int area = tallest * ((int) word.length());
        System.out.println(area);
    }
}
