package abhi.coding.solution.algolearning.maxsubrraysum;

public class PrintSubarray {
    public static void main(String[] args) {
        PrintSubarray printSubarray=new PrintSubarray();
        int[] a={1,2,3};
        printSubarray.printSubarrays(a,0,0);
    }
    //The number of the subarray is the (2^n)-1 including the empty array
    //recursive function to print all possible subarrays for given array
    private void printSubarrays(int[] a, int start,int end){
        //stop if we have reached the end of the array
        if (end==a.length)
            return;

        //increment the endpoint and start from 0
        else if (start>end)
            printSubarrays(a,0,end+1);

        //print the subarray and increment the starting point
        else {
            System.out.print("[");
            for (int i = start; i < end; i++) {
                System.out.print(a[i]+", ");
            }
            System.out.print(a[end]+"]");
            printSubarrays(a,start+1,end);
        }
        return;
    }
}
