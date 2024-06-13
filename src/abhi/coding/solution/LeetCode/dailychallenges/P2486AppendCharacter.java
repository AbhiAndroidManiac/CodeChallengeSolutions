package abhi.coding.solution.LeetCode.dailychallenges;


/*problem statement for the problem:-
You are two strings s and t of only lowercase english letters
Return the minimum numbers of characters that need to be appended to the
end of s so that t becomes a subsequence of s.
A subsequence is a string that can be derived from another string by deleting
some or no characters without changing the order of the remaining
characters.

        ex:- s="coaching" t="coding"
output=4
append "ding" to the end of s so that s="coachingding"
ex:-s="abcde" t="a"
output = 0
it is already a subsequence of s ("abcde").

ex:-s="z" t="abcde"
output=5
        "zabcde"
it can be shown that appending any 4 characters to the end of s will never make t
a subsequence.*/

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class P2486AppendCharacter {
    public static void main(String[] args) {
        String s = "z";
        String t = "abcde";
/*        String s1 = "Somebody is a good coder";
        String s2 = "yia";*/
        //int result = minAppendsToMakeSubsequence(s,t);
        //System.out.println(result);
       // System.out.println("The result is"+minAppendMS("Abhishek is a good developer","ksa"));
    }
    /*public static  String minAppendMS(String s, String t){
        int i = 0, j = 0;
        while (i<s.length() && j<t.length()){
            if (s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }
        return s.substring(t.length()-j,j);
    }*/
    //Greedy two pointer approach
    public static int minAppendsToMakeSubsequence(String s, String t){
      int i = 0,j=0;
      //i is for s counter and j is for t counter
      while (i<s.length() && j< t.length()){
          if (s.charAt(i)==t.charAt(j)){
              j++;
          }
          i++;
      }
        return t.length()-j;
    }
    //best optimised approach for 1 ms result
    public static int minTimeComplexityApproach(String s, String t){
        if (s.contains(t)) return 0;
        int sIndex = 0, similar = 0;
        for (int i = 0; i <t.length() ; i++) {
            char curr = t.charAt(i);
            //Returns the index within this string of the first
            //occurrence of the specified character, starting the search at the specified index.
            int index = s.indexOf(curr,sIndex);
            if (index!=-1){
                sIndex=index+1;
                similar++;
            }
            else break;
        }
        return t.length()-similar;
    }

}
