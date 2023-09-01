package abhi.coding.solution.hackerearth.augustcircuit2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
/*You are given two strings
        and
        of length
        and
        respectively consisting of lowercase English letters. You can make several strings using characters from
        . If you use any character of
        to make the string, that character will be removed from
        .

        That means if you select an integer
        from
        to the length of the string
        and use
        , then the character
        will be removed and the string length gets reduced by
        , the indices of characters to the right of the deleted one also get reduced by
        .

        Find the maximum number of strings you can make the same as that of
        .

        Input format

        The first line contains an integer
        denoting the number of test cases.
        The first line of each test case contains two space-separated integers
        and
        .
        The second line of each test case contains the string
        .
        The third line of each test case contains the string
        .
        Output format

        For each test case, print the maximum number of strings you can make the same as that of
        .

        Constraints
        2
        4 3
        hgeb
        ebh
        7 3
        xyzxyxx
        xyx

        solution
        1
        2
        Explanation
For test case
: The first string uses characters at indexes 1, 3, and 4 (1-based indexing). Hence, the answer is 1.

For test case
: The first string uses characters at indexes 1, 2, and 4 (1-based indexing). The second string uses characters at indexes 5, 6, and 7 (1-based indexing). Hence, the answer is 2.*/


public class BFromA {
    public static void main(String args[] ) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        while (testCases-- > 0) {
            String line = reader.readLine();
            int N = Integer.parseInt(line.charAt(0) + "");
            int D = Integer.parseInt(line.charAt(2) + "");
            String A = reader.readLine();
            String B = reader.readLine();
            List<String> listA=new LinkedList(Arrays.asList(A.split("")));
            List<String> listB=new LinkedList(Arrays.asList(B.split("")));
            LinkedHashMap<String,Integer> countLinkedHashMap = new LinkedHashMap<>();
            LinkedHashMap<String,Integer> totCountHashMap = new LinkedHashMap<>();
            for (int i = 0; i <listB.size() ; i++) {
                if (countLinkedHashMap.containsKey(listB.get(i))){
                    countLinkedHashMap.put(listB.get(i),countLinkedHashMap.get(listB.get(i))+1);
                } else {
                    countLinkedHashMap.put(listB.get(i),1);
                }
                totCountHashMap.put(listB.get(i),0);
            }
            System.out.println(validateExistence(countLinkedHashMap,listA,totCountHashMap));
        }
    }
    private static int validateExistence(LinkedHashMap<String,Integer> countMap,List<String> a,LinkedHashMap<String,Integer> totCountMap){
        for (String key: totCountMap.keySet()){
            totCountMap.put(key,(Collections.frequency(a,key)/countMap.get(key)));
        }
        int min = Collections.min(totCountMap.values());
        return min;
    }
}




