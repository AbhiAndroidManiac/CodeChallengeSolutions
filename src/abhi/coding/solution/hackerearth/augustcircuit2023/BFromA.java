package abhi.coding.solution.hackerearth.augustcircuit2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

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




