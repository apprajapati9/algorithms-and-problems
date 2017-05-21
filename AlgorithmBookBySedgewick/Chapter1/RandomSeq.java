/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmBookBySedgewick.Chapter1;


/**
 *
 * @author apprajapati
 */
public class RandomSeq {
    
    public static void main(String[] args){
        int N = StdIn.readInt();
        double low = StdIn.readDouble();
        double high = StdIn.readDouble();
        for(int i = 0 ; i< N ; i++){
            double x = StdRandom.uniform(low, high);
            StdOut.printf("%.2f\n", x);
        }
        
    }
    
}
