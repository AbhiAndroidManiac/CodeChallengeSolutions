package abhi.coding.solution.LeetCode.problem35.searchinsertposition;


//priblem statement:-
/*Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not, return the index
where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.*/
/*
Example 1:

        Input: nums = [1,3,5,6], target = 5
        Output: 2
        Example 2:

        Input: nums = [1,3,5,6], target = 2
        Output: 1
        Example 3:

        Input: nums = [1,3,5,6], target = 7
        Output: 4


        Constraints:

        1 <= nums.length <= 104
        -104 <= nums[i] <= 104
        nums contains distinct values sorted in ascending order.
        -104 <= target <= 104*/
public class SearchInsertPositionSolution {
    public static void main(String[] args) {
        SearchInsertPositionSolution solution = new SearchInsertPositionSolution();
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println("Printing");
        System.out.println("The output :- " + solution.searchInsert(nums, target));
    }


    //using while loop with log(n) complexity
    public int searchInsert(int[] nums,int target){
        if (target<nums[0]){
            return 0;
        }
        if (target>nums[nums.length-1]){
            return nums.length;
        }
        int low = 0;
        int high=nums.length-1;
        while (low+1<high){
            int mid=(low+high)/2;
            int value = nums[mid];
            if (target>value){
                low=mid;
            } else if (target<value){
                high=mid;
            } else {
                return mid;
            }
        }
        if (nums[low]==target){
            return low;
        }
        return high;
    }


    //using for loop with 0(n) complexity

    /*   public int searchInsert(int[] nums, int target) {
        int returnvalue = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                returnvalue = i;
            } else if (nums[i] < target) {
                returnvalue = i + 1;
            }
        }
        return returnvalue;
    }*/
}
