/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetCode;

import java.util.Arrays;

/**
 *
 * @author apprajapati
 */
public class PrimeNumbers {
    
    private static boolean[] primes=new boolean[1000000];
    
    public static void main(String[] args){
    

        
        fillSieve();
        if(isPrimeFillSieve(757)){
            System.out.println("True");
        }else{
            System.out.println("Flase");
        }
      
    }
    
    public static boolean isPrime(int n){
        
        if(n%2 == 0){
            return false;
        }
        
        for( int i = 3 ; i*i <= n ; i+=2){     
            System.out.println(i);

            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
 
    
    /*
    Let's say you write a program where you're asked to check whether many numbers are prime; 
    not just once. Even though our program above is highly optimized for that algorithm,
    there exists another way specifically suited for this situation: The Prime Sieve.

    Here's the basic idea:

    Assume every integer greater than or equal to 2 is prime.
    Start at the beginning of the list, if the number is prime, 
    cross out every multiple of that number off the list. They are not prime.
    Go to the next number, if it is crossed out, skip it - it is not prime. 
    If it is not crossed out, it must be prime, cross out it's multiples.Repeat
    Let's see what this means. Consider the list:

    2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ...
    2 is prime... cross out it's multiples. Our list now looks like:
    2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ...

    You can see why 2 is the only prime. By now doing it with 3, we cross out 6 (already crossed out), 9, 12(already crossed out), 15, etc. Eventually, your list will look like this:
    2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ...

    And our primes are the ones left over: (2,3,5,7,11,13,17,19,23,29,...). In code, you might want to keep track of this list as an array. Meaning you'll go through n numbers to set up this "sieve", but you'll make up for it when repeatedly calling the function, since it will return an instantaneous value whether a number is prime or not. Here's what it will look like. Of course, you can edit this yourself to suit your needs:
    */
    
    public static void fillSieve(){
        // will contain true or false values for the first 10,000 integers
        
        Arrays.fill(primes, true); //Assuming all integers are prime
        primes[0]=primes[1]=false; //we know 0 and 1 aren't prime
        
        for(int i =2 ; i < primes.length; i++){
             //if the number is prime,
            //then go through all its multiples and make their values false.
           
            if(primes[i]){
                for(int j=2; i*j<primes.length; j++){
                    primes[i*j] = false;
                }
            }
        }
    }
    
    public static boolean isPrimeFillSieve(int n){
        return primes[n];
    }
}
