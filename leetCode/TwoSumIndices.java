/*


Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].



 */
package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author apprajapati
 */
public class TwoSumIndices {
    
    public static void main(String[] args){
        
        int[] array = {2, 4, 6, 3, 2, 9, 0};
        int target = 9;
        
        int[] answer = twoSum(array, target);
        
        System.out.println("Answer:"+Arrays.toString(answer));
       
    }
    
    public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            
            int anotherNum = target - nums[i];
            System.out.println("----------Loop-----------");
            System.out.println("Another Number:" + anotherNum);
            System.out.println("--HashMap Printing");
            printHashMap(hashMap);
                      

            if(hashMap.containsKey(anotherNum)){
                System.out.println("--HashMap Printing");
                printHashMap(hashMap);
              
                System.out.println("----------Loop Ends Inner-----------");
                return new int[] {hashMap.get(anotherNum), i };
            }
            hashMap.put(nums[i],i);
            System.out.println("----------Loop Ends Outer-----------");
        }
        
        
        return null;
    }
    
    /*
     printing the hashmap. 
    */
    public static void printHashMap(Map<Integer, Integer> map){
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + "," + entry.getValue());
       }
    }
    
}
