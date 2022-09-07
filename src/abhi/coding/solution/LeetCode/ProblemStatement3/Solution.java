package abhi.coding.solution.LeetCode.ProblemStatement3;


//Leetcode problem statement 3
//Given a string s, find the length of the longest substring without repeating characters.


public class Solution {

    //Sum of N natural numbers is n(n+1)/2
    //method to check if all the characters in str[i..j] are distinct then return true else false
    //time complexity for O(n^3)

    public static Boolean areDistinct(String str,int i, int j){
        boolean[] visited = new boolean[26];
        for (int k = i; k <=j ; k++) {
            if (visited[str.charAt(k) - 'a']==true) {
                return false;
            }
            visited[str.charAt(k) - 'a']=true;
        }
        return true;
    }

    //Returns length of the longest substring
    //with all the distinct characters
    public static int getLongestSubstring(String str){
        int n=str.length();

        //Result
        int res=0;

        for (int i = 0; i <n ; i++)
            for (int j = i; j <n ; j++)
                if (areDistinct(str,i,j))
                    res=Math.max(res,j-i+1);



        return res;
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println("The input string is"+str);
        int len = getLongestSubstring(str);

        System.out.println("The len of the longest non repeating character is"+len);
    }

}
