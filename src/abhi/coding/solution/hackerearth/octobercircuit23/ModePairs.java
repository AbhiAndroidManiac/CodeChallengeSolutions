package abhi.coding.solution.hackerearth.octobercircuit23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class ModePairs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        List<String> diffvalue=new LinkedList(Arrays.asList(line.split(" ")));
        int N = Integer.parseInt(diffvalue.get(0));
        int P = Integer.parseInt(diffvalue.get(1));
        int K = Integer.parseInt(diffvalue.get(2));
        String A = reader.readLine();
        List<String> list = new LinkedList(Arrays.asList(A.split(" ")));
        int congruentval=K%P;
        int totValue = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
               // pairs.add(new String[]{list.get(i), list.get(j)});
                totValue+=isInValidCondition(Integer.parseInt(list.get(i)),Integer.parseInt(list.get(j)),congruentval,P);
            }
        }
        System.out.println(totValue);
    }
    static int isInValidCondition(int value1,int value2,int CongruentValue,int P){
        int conditionCheckValue = (int) ((Integer.sum(value1,value2))*(Math.pow(value1,2)+Math.pow(value2,2)));
        if (conditionCheckValue%P==CongruentValue){
            return 1;
        } else return 0;

    }
}
