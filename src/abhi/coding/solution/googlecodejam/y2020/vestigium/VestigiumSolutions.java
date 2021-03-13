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
            Result r=vestigiumSolutions.cal(a);
            System.out.println(String.format("Case #%d: %d %d %d",caseNum,r.diagonalSum,r.dupRowCount,r.dupColCount));
            caseNum++;
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
        Set<Integer> rowset=new HashSet<>();
        int diagonalSum=0;
        int dupRow=0;
        int dupCol=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==j){
                    diagonalSum +=a[i][j];
                }
                rowset.add(a[i][j]);
                colList.get(j).add(a[i][j]);
            }
            if (rowset.size()!=row){
                dupRow++;
            }
            rowset.clear();
        }
        for (Set<Integer> s:colList){
            if (s.size()!=row){
                dupCol++;
            }
        }
        return new Result(diagonalSum,dupRow,dupCol);
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
