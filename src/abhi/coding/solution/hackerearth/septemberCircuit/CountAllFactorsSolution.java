package abhi.coding.solution.hackerearth.septemberCircuit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class CountAllFactorsSolution {
    public static void main(String[] args) {

        Scanner s= new Scanner(new BufferedReader(new InputStreamReader(System.in)));
       //size of the array
       int arrL = s.nextInt();
       int arrIndex = 0;
       //The array
       int[] OpArray= new int[arrL];
       while (arrIndex<arrL){
            OpArray[arrIndex]=s.nextInt();
            arrIndex++;
       }
       //The number of queries
        int q=s.nextInt();


        int queryIndex=0;
        //array of the query
        int[] queryArray=new int[q];
        while (queryIndex<q){
            queryArray[queryIndex]=s.nextInt();
            queryIndex++;
        }
        System.out.println(arrL);
        for (int i = 0; i <arrL ; i++) {
            System.out.println(OpArray[i]);
        }
        System.out.println(q);
        CountAllFactorsSolution countAllFactorsSolution=new CountAllFactorsSolution();
        for (int i = 0; i <q ; i++) {
            System.out.println(countAllFactorsSolution.getTheFactors(queryArray[i]));
            LinkedList<Integer> factorList=countAllFactorsSolution.getTheFactors(queryArray[i]);

        }

    }
    private LinkedList<Integer> getTheFactors(int n){
        LinkedList<Integer> factorsList=new LinkedList<>();
        for (int i = 1; i <= n; ++i) {
            if (n%i==0){
                factorsList.add(i);
            }
        }
        return factorsList;
    }
}
