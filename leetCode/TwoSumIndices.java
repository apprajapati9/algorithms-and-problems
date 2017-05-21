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
        
        int[] array = {2, 4, 6, 6, 2, 9, 0};
        int target = 9;
        
        int[] answer = twoSum(array, target);
        
        System.out.println("Answer:"+Arrays.toString(answer));
        
        
    }
    
    public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            
            int anotherNum = target - nums[i];
            
            if(hashMap.containsKey(anotherNum)){
                return new int[] {hashMap.get(anotherNum), i };
            }
            hashMap.put(nums[i],i);
        }
        
        
        return null;
    }
    
}
