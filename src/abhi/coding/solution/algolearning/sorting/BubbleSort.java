package abhi.coding.solution.algolearning.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a= {1,3,8,2,9,2,5,6};
        int temp=0;
        System.out.print("[");
        for (int i = 0; i <a.length ; i++) {
            if (i!=a.length-1)
                System.out.print(a[i]+", ");
            else
                System.out.print(a[i]);
        }
        System.out.print("]");

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length-1 ; j++) {
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("[");
        for (int i = 0; i <a.length ; i++) {
            if (i!=a.length-1)
            System.out.print(a[i]+", ");
            else
            System.out.print(a[i]);
        }
        System.out.print("]");
    }

}
