package abhi.coding.solution.googlecodejam.y2020.indicium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IndiciumSolution {
    private  int n, k;
    private  boolean done;
    String res=new String();
    int[][] grid = new int[105][105];
    int[][] resultGrid=new int[105][105];
    public static void main(String[] args) {
        IndiciumSolution indiciumSolution=new IndiciumSolution();
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int testCases = s.nextInt();
        int caseNum = 1;
        while (caseNum <= testCases) {
            indiciumSolution.n=s.nextInt();
            indiciumSolution.k=s.nextInt();
            indiciumSolution.rec(0,0);
            if (!indiciumSolution.done){
                indiciumSolution.res="IMPOSSIBLE";
            }
            System.out.println("Case "+caseNum+": "+indiciumSolution.res);
            for (int i = 0; i <indiciumSolution.n ; i++) {
                for (int j = 0; j <indiciumSolution.n ; j++) {
                    System.out.print(indiciumSolution.resultGrid[i][j]+" ");
                }
                System.out.println();
            }
            caseNum++;
        }
    }

    private void  rec(int row, int col) {

        if (col==n){
            col=0;
            row++;
        }
        if (row==n){
            int trace=0;
            for (int i = 0; i < n; i++) {
                trace+=grid[i][i];
            }
        if (trace==k&&!done){
            res= "POSSIBLE";
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    resultGrid[i][j]=grid[i][j];
                }
            }
            done=true;
        }
        //equivalent of return in the c++
            return;
        }
        for (int i = 1; i <=n ; i++) {
            boolean ok=true;
            for (int j = 0; j < row ; j++) {
                if (grid[j][col]==i){
                    ok=false;
                    break;
                }
            }
            for (int j = 0; j <col ; j++) {
                if (grid[row][j]==i){
                    ok=false;
                    break;
                }
            }
            if (ok){
                grid[row][col]=i;
                rec(row,col+1);
            }
        }

    }

}
