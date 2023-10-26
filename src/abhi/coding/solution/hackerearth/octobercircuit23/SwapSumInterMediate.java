package abhi.coding.solution.hackerearth.octobercircuit23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class SwapSumInterMediate {
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
            List<Integer> listAP=listA.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            List<String> listB=new LinkedList(Arrays.asList(B.split(" ")));
            List<Integer> listBP=listB.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int s = listAP.stream().mapToInt(Integer::intValue).sum();

            ArrayList<Integer> c = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                int d = listBP.get(j) - listAP.get(j);
                if (d > 0) {
                    c.add(d);
                }
            }
            Collections.sort(c,Collections.reverseOrder());
            if (c.size() >= K) {
                int sum = s;
                for (int j = 0; j < K; j++) {
                    sum += c.get(j);
                }
                System.out.println(sum);
            } else {
                int sum = s;
                for (int j = 0; j < c.size(); j++) {
                    sum += c.get(j);
                }
                System.out.println(sum);
            }
        }
    }
}
