package abhi.coding.solution.LeetCode.LongestPalindromicSubString;



//problem statement
/*Given a string s, return the longest palindromic substring in s.
A string is called a palindrome string if the reverse of that string is the same as the original string.*/
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.

import java.util.*;
import java.lang.*;
import java.io.*;
class Solution {
    public static void main(String args[]) {
        // Your code goes here
        String s = "mojologiccigolmojo";
        //longestPalindrome(s);
        ArrayList<String> list1=new ArrayList<>();
        list1.add("b");
        list1.add("d");
        list1.add("g");
        list1.add("h");
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        list.removeAll(list1);
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }
    }
    public static void  longestPalindrome(String str){
        //length of the string
        int n=str.length();

        int max=1,start=0;

        for (int i = 0; i <n ; i++) {
            for (int j = i; j <n; j++) {
                boolean flag =true;
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = false;

                if (flag && (j - i + 1) > max) {
                    start = i;
                    max = j - i + 1;
                }
            }
        }
        System.out.println(str.substring(start,start+max));
    }
}