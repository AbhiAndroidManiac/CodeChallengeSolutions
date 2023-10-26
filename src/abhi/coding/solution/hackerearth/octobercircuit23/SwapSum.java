package abhi.coding.solution.hackerearth.octobercircuit23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class SwapSum {
    public static void main(String[] args) throws IOException {
       System.out.println(15%3);
       System.out.println(0%3);
        /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        while (testCases-- >0){
            String line = reader.readLine();
            int N = Integer.parseInt(line.charAt(0)+"");
            int K = Integer.parseInt(line.charAt(2)+"");
            String A = reader.readLine();
            String B = reader.readLine();
            List<String> listA=new LinkedList(Arrays.asList(A.split(" ")));
            List<Integer> listAP=listA.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            List<String> listB=new LinkedList(Arrays.asList(B.split(" ")));
            List<Integer> listBP=listB.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            findMaxSum(listAP,listBP,N,K);
        }*/
    }
    private static void findMaxSum(List<Integer> listA,List<Integer> listB,int N,int K){
        int sum = listA.stream().mapToInt(Integer::intValue).sum();
        List<Integer> sumOp = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            sumOp.add(Integer.valueOf(listB.get(i))-Integer.valueOf(listA.get(i)));
        }
        Collections.sort(sumOp,Collections.reverseOrder());
        if (sumOp.size()>=K){
            int s=sum;
            for (int i = 0; i <K ; i++) {
                s+=sumOp.get(i);
            }
            System.out.println(s);
        } else {
            int s = sum;
            for (int i = 0; i <sumOp.size() ; i++) {
                s+=sumOp.get(i);
            }
            System.out.println(s);
        }
    }
/*    private static int findMaxSum(List<String> listA,List<String> listB,int N,int K){
        int sum = 0;
        List<ResultCal> sumOp=new LinkedList<>();
        for (int i = 0; i < N; i++) {
            if (Integer.valueOf(listB.get(i))>Integer.valueOf(listA.get(i))){
                ResultCal resultCal = new ResultCal();
                //finding difference in the both the list simultaneous position
                resultCal.diff =Integer.valueOf(listB.get(i))-Integer.valueOf(listA.get(i));
                resultCal.position = i;
                sumOp.add(resultCal);
            } else sum+= Integer.valueOf(listA.get(i));
        }
        Collections.sort(sumOp,new ValueComparator());
        for (int i = 0; i <sumOp.size() ; i++) {
            if (i<K){
                sum+=Integer.valueOf(listB.get(sumOp.get(i).position));
            } else sum+=Integer.valueOf(listA.get(sumOp.get(i).position));
        }
        return sum;
    }*/
   /* public static class ResultCal{
        private int position;
        private int diff;
    }
    public static class  ValueComparator implements java.util.Comparator<ResultCal>{
        @Override
        public int compare(ResultCal resultCal, ResultCal t1) {
            return t1.diff-resultCal.diff;
        }
    }*/
}
