package abhi.coding.solution.LeetCode.ProblemStatement4;


//Problem Statement :-
//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n)).

//Definition:-Median: The middle element is found by ordering all elements in sorted order and picking out the one
// in the middle (or if there are two middle numbers, taking the mean of those two numbers).

public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
    static int getMedian(int[] A, int[] B,int n, int m){
        int i=0;
        int j=0;
        //for the loop indexing of the for loop
        int count;
        int m1=-1,m2=-1;

        if ((m+n)/2==1){
            //odd size condition
            for (count=0; count<=(n+m)/2;i++){
                if (i!=n && j!=m){
                    m1=(A[i]>B[j])?B[j++] : A[i++];
                }
            }
        } else {
            //even size condition

        }

        return 0;
    }
}

