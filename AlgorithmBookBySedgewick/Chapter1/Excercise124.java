/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmBookBySedgewick.Chapter1;

//What does the following program prints? 

/**
 *
 * @author apprajapati
 */
public class Excercise124 {
    
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = str1;
        str1 = "world";
        System.out.println(str1); //world
        System.out.println(str2); //hello
        
        //Excercies 1.2.5
        String s = "hello world";
        String newS = s.toUpperCase();
        s.substring(6, 11);
        System.out.println(s);
        System.out.println(newS);
        //Answer :  "Hello World". String objects are immutable—string methods 
        //return a new String object with the appropriate value 
        //(but they do not change the value of the object that was used to invoke them). 
        //This code ignores the objects returned and just prints the original string. 
        //To print "WORLD", use s = s.toUpperCase() and s = s.substring(6, 11).
        //You can see in the statement with newS variable, just because we are storing in separate value
        //it would cause it to print new variable.
        //But whenever you invoke the method on string variable or any immutable variable, it won't change the
        //orignal, to separate the result you have to store in another object/variable.
        
        
    }   
}
