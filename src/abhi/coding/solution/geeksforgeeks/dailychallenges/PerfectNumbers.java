package abhi.coding.solution.geeksforgeeks.dailychallenges;

import java.util.LinkedList;


/*Given a number N, check if a number is perfect or not.
        A number is said to be perfect if sum of all its factors
        excluding the number itself is equal to the number.
        Return 1 if the number is Perfect otherwise return 0.


        Input:
N = 6
Output:
1
Explanation:
Factors of 6 are 1, 2, 3 and 6.
Excluding 6 their sum is 6 which
is equal to N itself. So, it's a
Perfect Number.


Input:
N = 10
Output:
0
Explanation:
Factors of 10 are 1, 2, 5 and 10.
Excluding 10 their sum is 8 which
is not equal to N itself. So, it's
not a Perfect Number.*/
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
