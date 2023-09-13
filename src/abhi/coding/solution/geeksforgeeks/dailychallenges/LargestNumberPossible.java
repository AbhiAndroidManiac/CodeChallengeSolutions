package abhi.coding.solution.geeksforgeeks.dailychallenges;

import java.util.Collections;
//Given two numbers 'N' and 'S' , find the largest number that can be formed with 'N' digits
// and whose sum of digits should be equals to 'S'. Return -1 if it is not possible.
//Input: N = 2, S = 9
//Output: 90
//Explaination: It is the biggest number
//with sum of digits equals to 9.
//Input: N = 3, S = 20
//Output: 992
//Explaination: It is the biggest number
//with sum of digits equals to 20.
//Your Task:
//You do not need to read input or print anything. Your task is to complete the function findLargest() which takes N and S as input parameters and returns the largest possible number. Return -1 if no such number is possible.
//
//Expected Time Complexity: O(N)
//Exepcted Auxiliary Space: O(1)
//
//Constraints:
//1 ≤ N ≤ 104
//0 ≤ S ≤ 105
public class LargestNumberPossible {
    public static void main(String[] args) {
        System.out.println("The print statement of the largest number possible is working");
        System.out.println(findLargest(4, 0));
        //System.out.println(findLargest(3, 20));
    }
    static String findLargest(int N, int S){
        //if S is 0, then  the largest number is 0
        if (S == 0 && N==1){
            return String.valueOf(0);
        } else if(S==0 && N>1){
            return String.valueOf(-1);
        }
        //if S is greater than 9 times d,
        //then it is impossible to form a d-digit
        //whose sum of digits is S.
        //maximum possible number formed is 9*N
        //for :- example N=2 and maximum digit can be formed is 99
        // whose sum is 9+9 = 18 and any thing greater then 18 cannot be formed
        // so lets say sum is 20 the digit cannot be formed.
        if (S>9*N){
            return String.valueOf(-1);
        }
        //initialize an empty string to save the result
        String result="";
        for (int i = 0; i <N ; i++) {
            //if s is greater then or equal to 9
            //then add 9 to result and subtract 9 from s
            if (S>=9){
                result+='9';
                S-=9;
            }
            //otherwise add S to the string and make S =0
            else {
                result+=Integer.toString(S);
                S=0;
            }
            //if S is Zero and there are still digits left to fill
            //then fill the remaining digits with zero's and break out of loop
            if (S==0 && i<N-1){
                result+=String.join("", Collections.nCopies(N-i-1,"0"));
                break;
            }

        }
        return result;
    }

}
