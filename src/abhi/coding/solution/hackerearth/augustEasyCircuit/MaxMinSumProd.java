package abhi.coding.solution.hackerearth.augustEasyCircuit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class MaxMinSumProd {
    public static void main(String[] args) {
        int[] a= {2, 3 ,1};
        //core for creating all possible subsets of the array
        for (int i = 0; i < a.length; i++)
            // For loop for end index
            for (int j = i; j < a.length; j++) {
                // For loop to print subarray elements
                //ArrayList<Integer> b  = new ArrayList<>();
                for (int k = i; k <=j; k++) {
                    //b.add(a[k]);
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
    }
}
