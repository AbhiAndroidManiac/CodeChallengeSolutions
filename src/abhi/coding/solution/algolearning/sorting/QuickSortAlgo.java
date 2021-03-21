package abhi.coding.solution.algolearning.sorting;

public class QuickSortAlgo {
    public static void main(String[] args) {
        int[] a={50,23,9,18,61,32};
        int l=a.length;
        QuickSortAlgo q=new QuickSortAlgo();
        q.sort(a,0,l-1);
        System.out.print("The sorted array");
        System.out.println();
        for (int i = 0; i <l ; i++) {
            if (i==0)
                System.out.print("["+a[i]+",");
            else if (i==l-1)
                System.out.print(a[i]+"]");
            else
            System.out.print(a[i]+", ");


        }
    }
    /*This function makes the last element as the pivot and
    places the pivot element at its correct position with
    all lows at the left and right at its right
     */
    int partitiion(int[] a,int low,int high){
        int pivot =high;
        int i=low-1; //index of the smaller element 
        for (int j =low; j <high ; j++) {
            //if current element is smaller than or
            //equal to the pivot
            if (a[j]<=a[pivot]){
                i++;
                //swap a[i] and a[j]
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return i+1;
    }

    //the main function that implements sort
    void sort(int[] a,int low,int high){
        if (low<high){
            /*pi is partining index, a[pi] is now at the right place
             */
            int pi=partitiion(a, low, high);
            //recursively sort elements before and after partition
            sort(a,low,pi-1);
            sort(a,pi+1,high);
        }
    }

}
