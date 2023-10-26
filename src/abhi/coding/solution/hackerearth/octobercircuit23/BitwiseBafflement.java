package abhi.coding.solution.hackerearth.octobercircuit23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BitwiseBafflement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int testCases = Integer.parseInt(line);
        while (testCases-- >0){
            String N = reader.readLine();
            int arrSize = Integer.parseInt(N);
            String A = reader.readLine();
            List<String> listA=new LinkedList(Arrays.asList(A.split(" ")));
            List<Integer> listAP=listA.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            System.out.println(sub(listAP));
        }

    }

    static int sub(List<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++)
        {
            // j is the number of elements which should be printed
            for (int j = i; j < arr.size(); j++)
            {
                // print the array from i to j
                ArrayList<Integer> arrPrint = new ArrayList<>();
                int XorVal = 0;
                int AndVal = 0;
                for (int k = i; k <= j; k++)
                {
                    arrPrint.add(arr.get(k));
                    //System.out.print(arr[k]+" ");
                    if (arrPrint.size()>1){
                        XorVal ^=arr.get(k);
                        AndVal &=arr.get(k);
                    } else if (arrPrint.size()==1){
                        XorVal = arr.get(k);
                        AndVal = arr.get(k);
                    }
                }
                if (arrPrint.size()>1){
                    boolean isTrue = (XorVal%2==0) && (!(AndVal%2==0));
                    if (isTrue){
                       result+=1;
                    } else result+=0;
                }
            }
        }
        return result;
    }

}


