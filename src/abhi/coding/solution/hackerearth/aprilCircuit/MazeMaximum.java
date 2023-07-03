package abhi.coding.solution.hackerearth.aprilCircuit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MazeMaximum {
    public static void main(String[] args) {
        System.out.println("Works.....");
        Scanner s= new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n= s.nextInt();//number of rows vertical
        int m=s.nextInt();//number of columns horizontal
        int[][] matrixarray=new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixarray[i][j]=s.nextInt();
            }
        }
        int i = 0;
        int j = 0;
        int x=0;
        for (i = 0; i <n ; i++) {
         //line changer

            for (j = 0; j <m ; j++) {
                x=matrixarray[i][j];
                //same line space changer
                //reads the row
                if (x>=matrixarray[j][i] && x>=matrixarray[i][j]){
                    System.out.println("The row is "+i+ " the column is "+j);
                }
                System.out.print(matrixarray[j][i]+" ");
                //System.out.println();


                //reads the column
                //System.out.print(matrixarray[i][j]+" ");
            }
            System.out.println();
        }

    }
}
