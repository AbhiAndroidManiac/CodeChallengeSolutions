package abhi.coding.solution.algolearning.maxsubrraysum;

public class SubArraySumEff {
    //Kadane's algorithm
    private int best=0;
    public static void main(String[] args) {
        int[] a={-1,2,4,-3,5,2,-5,2};
        SubArraySumEff subArraySumEff=new SubArraySumEff();
        subArraySumEff.sumCal(a);
        System.out.print(subArraySumEff.best);
    }
    private void sumCal(int[] a){
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum=Math.max(a[i],sum+a[i]);
            best=Math.max(sum,best);
        }
    }
}
