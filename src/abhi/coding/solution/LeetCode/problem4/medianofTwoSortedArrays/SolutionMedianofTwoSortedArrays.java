package abhi.coding.solution.LeetCode.problem4.medianofTwoSortedArrays;


/*Given two sorted arrays nums1 and nums2 of size m and n respectively,
return the median of the two sorted arrays.The overall run time complexity
should be O(log (m+n)).*/

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * Solution
 * Take minimum size of two array. Possible number of partitions are from 0 to m in m size array.
 * Try every cut in binary search way. When you cut first array at i then you cut second array at (m + n + 1)/2 - i
 * Now try to find the i where a[i-1] <= b[j] and b[j-1] <= a[i]. So this i is partition around which lies the median.
 * <p>
 * Time complexity is O(log(min(x,y))
 * Space complexity is O(1)
 * <p>
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * https://discuss.leetcode.com/topic/4996/share-my-o-log-min-m-n-solution-with-explanation/4
 */

public class SolutionMedianofTwoSortedArrays {
    public static void main(String[] args) {

        int[] x = {1, 2};
        int[] y = {3, 4};
        SolutionMedianofTwoSortedArrays solutionMedianofTwoSortedArrays = new SolutionMedianofTwoSortedArrays();
        System.out.println(solutionMedianofTwoSortedArrays.findMedianSortedArrays(x, y));

    }


    public double findMedianSortedArrays(int nums1[], int nums2[]) {
        //if input1 length is greater then input2 then so switch input1 to input2
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int x = nums1.length;
        int y = nums2.length;

        int low = 0;
        int high = x;
        while (low <= high) {
            int partitionx = (low + high) / 2;
            int partitiony = (x + y + 1) / 2 - partitionx;

            //if partitionx is 0 it means nothing  is there on left side . use -INF  for maxleft
            //if partitionX is length of input then there is nothing on right side. Use +INF for minRightX
            int maxLeftX = (partitionx == 0) ? Integer.MIN_VALUE : nums1[partitionx - 1];
            int minRightX = (partitionx == x) ? Integer.MAX_VALUE : nums1[partitionx];

            //same applies for the y partition as well
            int maxLeftY = (partitiony == 0) ? Integer.MIN_VALUE : nums2[partitiony - 1];
            int minRightY = (partitiony == y) ? Integer.MAX_VALUE : nums2[partitiony];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) % 2 == 0) {
                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
                } else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                //we are too far on right side for partitionX. Go on left side
                high = partitionx - 1;

            } else {
                //we are too far on left side for partitionX. Go on right side
                low = partitionx + 1;
            }
        }
        throw new IllegalArgumentException();
    }
}
