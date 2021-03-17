package abhi.coding.solution.algolearning.maxsubrraysum;

public class StraightForwardApproach {
    //time complexity is o(n)^3
    int best =0;
    public static void main(String[] args) {
        StraightForwardApproach straightForwardApproach=new StraightForwardApproach();
        int[] a={-1,2,4,-3,5,2,-5,2};
        straightForwardApproach.maximumSum(a);
        straightForwardApproach.printSubarray(a);
        System.out.println(straightForwardApproach.best);
    }
    public void maximumSum(int[] a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = i; j <a.length ; j++) {
                int sum=0;
                for (int k = i; k <=j ; k++) {
                    sum+=a[k];
                }
                best=Math.max(sum,best);
            }
        }
    }
    //with every loop the start shits right
    private void printSubarray(int[] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print("[");
            for (int j = i; j <a.length ; j++) {
                if (j==a.length-1)
                System.out.print(a[j]);
                else
                System.out.print(a[j]+", ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
