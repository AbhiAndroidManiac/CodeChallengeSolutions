package abhi.coding.solution.geeksforgeeks.dailychallenges;

import java.util.LinkedList;

public class PerfectNumbers {
    public static void main(String[] args) {
        long num = 6L;
        System.out.print(isPerfectNumber(num));
    }
    static int isPerfectNumber(long N) {
        long num = N;
        LinkedList<Long> list = new LinkedList<>();
        for (long i = 1; i < Math.sqrt(num) ; i++) {
            if (num%i==0 && num != i){
                list.add(i);
                list.add(num / i);
            }
        }
        if (list.contains(num)) list.remove(num);
        long sum = list.stream().mapToLong(Long::valueOf).sum();
        if (sum==num){
            return 1;
        } else {
            return 0;
        }
    }
}
