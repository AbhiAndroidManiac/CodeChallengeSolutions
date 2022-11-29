package abhi.coding.solution.LeetCode.problem1.twosum;


//Problem statement Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//You can return the answer in any order.

//Example Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//Example 2 Input: nums = [3,2,4], target = 6
//Output: [1,2]

import abhi.coding.solution.LeetCode.ProblemStatement3.Solution;

//Example Input: nums = [3,3], target = 6
//Output: [0,1]
public class SolutionTwoSum {
    public static void main(String[] args) {
        System.out.println("Hello world");
        SolutionTwoSum solutionTwoSum=new SolutionTwoSum();
        int[] nums={2,7,11,15};
        System.out.println(solutionTwoSum.twoSum(nums,9)[0]+" "+solutionTwoSum.twoSum(nums,9)[1]);
    }
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[0];
        for (int i = 0; i < nums.length ; i++) {
            int sumcheck=0;
            for (int j = i+1; j < nums.length ; j++) {
                sumcheck = nums[i]+nums[j];
                if (sumcheck==target){
                    result= new int[]{i, j};
                }

            }

        }
        return result;
    }
}
