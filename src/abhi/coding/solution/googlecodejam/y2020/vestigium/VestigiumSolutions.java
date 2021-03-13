package abhi.coding.solution.googlecodejam.y2020.vestigium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class VestigiumSolutions {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int testCases=s.nextInt();
        int caseNum=1;
        VestigiumSolutions vestigiumSolutions=new VestigiumSolutions();
        while (caseNum<=testCases){
            int n=s.nextInt();
            int[][] a=new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n ; j++) {
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out. println();
            }
            vestigiumSolutions.cal(a);
        }
    }
    private Result cal(int[][] a){
        if (a==null|| a.length==0||a[0].length==0){
            return null;
        }
        int row = a.length;
        int col=a[0].length;
        List<Set> colList =new ArrayList<>();
        for (int i = 0; i < row; i++) {
            colList.add(new HashSet<Integer>());
        }
        for (int i = 0; i < row; i++) {
            System.out.println(colList.get(i));
        }
        return new Result(0,0,0);
    }
    private class Result{
        int diagonalSum=0;
        int dupRowCount=0;
        int dupColCount=0;

        public Result(int diagonalSum, int dupRowCount, int dupColCount) {
            this.diagonalSum = diagonalSum;
            this.dupRowCount = dupRowCount;
            this.dupColCount = dupColCount;
        }
    }

}
