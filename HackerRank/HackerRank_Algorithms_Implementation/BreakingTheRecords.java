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
 * for problem question look at breaking-best-and-worst-records-English.pdf in pdf folder
 */
public class BreakingTheRecords {

    static int[] getRecord(int[] s) {

        int highFound = s[0];
        int highCounter = 0;
        int lowFound = s[0];
        int lowCounter = 0;

        for (int i = 0; i < s.length - 1; i++) {

            int v1 = s[i];
            int v2 = s[i + 1];

            System.out.println("v1=" + v1 + " v2=" + v2);
            if (v2 < v1) {

                if (v2 < lowFound) {
                    lowFound = v2;
                    lowCounter += 1;
                }

            }

            if (v2 > v1) {
                if (highFound < v2) {
                    highFound = v2;
                    highCounter += 1;
                }
            }
            System.out.println("highFound=" + highFound + " lowFound" + lowFound);

        }

        int[] array = {highCounter, lowCounter};

        return array;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }

}
