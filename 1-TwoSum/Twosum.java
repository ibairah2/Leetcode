import java.util.Arrays;

/*
 1. Two Sum
Given an array of integers, return indices of the two numbers such that they add
 up to a specific target.

You may assume that each input would have exactly one solution, and you may not
 use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/


public class Lc1_TwoSum {	
	public static void main(String[] args){		
		Solution sl = new Solution();
		int[] test = {2,7,11,15};
		int target = 18;
		// test 2
		int[] test2 = {3,2,4};
		int target2 = 6;
		
	//	sl.twoSum(test, target);
		sl.twoSum(test2, target2);
	}
}


//Tc : O(n^2)
//Sc : O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int[] res= {0,0};
    	for(int i =0; i< nums.length-1; i++){
			for(int j = i+1; j< nums.length;j++ ){
				//System.out.println("num[i]" + nums[i]);
				//System.out.println("num[j]" + nums[j]);
				if(nums[i] + nums[j] == target) {
					 res[0] = i;
					 res[1] = j;
				}	
			}
		}
    	//System.out.println("Answer: " + Arrays.toString(res));
		return res;
    }
}


//简化版
/* 
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	//int[] res= {0,0};
    	for(int i =0; i< nums.length-1; i++){
			for(int j = i+1; j< nums.length;j++ ){
				//System.out.println("num[i]" + nums[i]);
				//System.out.println("num[j]" + nums[j]);
				if(nums[i] + nums[j] == target) {
			    	System.out.println("Answer: " + Arrays.toString(new int[] { i, j }));
					return new int[] { i, j };
					}	
			}
		}
		//return res;
    	 throw new IllegalArgumentException("No two sum solution");
    }
}
*/


//Tc O(n)
//Sc O(n)
//Approach 2: Two-pass Hash Table
/*
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
*/

//Tc O(n)
//Sc O(n)
//Approach 3: One-pass Hash Table
/*
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
*/







