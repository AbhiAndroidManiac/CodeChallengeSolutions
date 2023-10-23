package abhi.coding.solution.hackerearth.octobercircuit23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SwapSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        while (testCases-- >0){
            String line = reader.readLine();
            int N = Integer.parseInt(line.charAt(0)+"");
            int K = Integer.parseInt(line.charAt(2)+"");
            String A = reader.readLine();
            String B = reader.readLine();
            List<String> listA=new LinkedList(Arrays.asList(A.split(" ")));
            List<String> listB=new LinkedList(Arrays.asList(B.split(" ")));
            System.out.println();
            System.out.println("The test cases is "+testCases);
            System.out.println("size of array is "+N);
            System.out.println("Number of operations allowed "+K);
            findMaxSum(listA,listB,N,K);
        }
    }
    private static void findMaxSum(List<String> listA,List<String> listB,int N,int K){
        int sum = 0;
        List<ResultCal> sumOp=new LinkedList<>();
        for (int i = 0; i < N; i++) {
            if (Integer.valueOf(listB.get(i))>Integer.valueOf(listA.get(i))){
                ResultCal resultCal = new ResultCal();
                resultCal.diff =Integer.valueOf(listB.get(i))-Integer.valueOf(listA.get(i));
                resultCal.position = i;
                sumOp.add(resultCal);
            } else sum+= Integer.valueOf(listA.get(i));
        }
        Collections.sort(sumOp,new ValueComparator());
        List<ResultCal> finalList=sumOp.subList(0,K);

        for (int i = 0; i <sumOp.size() ; i++) {
            System.out.print(sumOp.get(i).position+" "+sumOp.get(i).diff);
            System.out.println();
        }
        System.out.println("The sublist is");
        for (int i = 0; i <finalList.size() ; i++) {
            if (i<K){
                sum+=Integer.valueOf(listB.get(sumOp.get(i).position));
            } else sum+=Integer.valueOf(listA.get(sumOp.get(i).position));
            System.out.print(finalList.get(i).position+" "+finalList.get(i).diff);
            System.out.println();
        }

        System.out.println("The sume value so far is"+sum);
    }
    public static class ResultCal{
        private int position;
        private int diff;
    }
    public static class  ValueComparator implements java.util.Comparator<ResultCal>{
        @Override
        public int compare(ResultCal resultCal, ResultCal t1) {
            return t1.diff-resultCal.diff;
        }
    }
}
