package abhi.coding.solution.algolearning.maxsubrraysum;

public class SecApproach {
    int best=0;
    public static void main(String[] args) {
        int[] a={-1,2,4,-3,5,2,-5,2};
        SecApproach secApproach=new SecApproach();
        secApproach.calculateSum(a);
        System.out.println(secApproach.best);
    }
    private void calculateSum(int[] a){
        for (int i = 0; i <a.length ; i++) {
            int sum =0;
            for (int j = i; j <a.length ; j++) {
                sum+=a[j];
                best=Math.max(best,sum);
            }
        }
    }
}
