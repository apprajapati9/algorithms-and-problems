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
public class Kangaroo {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        if(v1 > v2 && ((x2-x1)%(v1-v2) == 0)){
            System.out.println("YES");
        } 
        else
            System.out.printf("NO");
        
        
    }
    
}
/*
// given that x2 > x1, if v1 > v2 its a NO because kangaroo2 is already behind and cannot catchup by going slower than kangaroo1
// x2-x1 % v1-v2 this basically checks if the diff in the inital lead (x2-x1) can be made up by going faster
*/

/*
If the two kangaroos met, then there woulde be an integer n such that 
x1 + n * v1 = x2 + n * v2. 
Subtracting x1 from both sides, 
we get that n * v1 = x2 - x1 + n * v2. 
Then we subtract n * v2 from both sides and we get n * v1 - n * v2 = x2 - x1.
Factoring out n from the left side of the equation, n * (v1 - v2) = (x2 - x1). 
We can the divide both sides by (v1 - v2) and we get (x2 - x1) / (v1 - v2).
If this is an integer, then (x2 - x1) % (v1 - v2) has to equal 0.
*/