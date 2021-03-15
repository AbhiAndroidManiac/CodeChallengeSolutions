package abhi.coding.solution.googlecodejam.y2020.nestingdepth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//try putting the class name as the solution rather then any other custom name.

public class NestingDepthSolution {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int testCases =s.nextInt();
        int caseNum=1;
        NestingDepthSolution nestingDepthSolution=new NestingDepthSolution();

        while (caseNum<=testCases){
            String sequenceNumber=s.next();
            StringBuilder result=nestingDepthSolution.getResult(sequenceNumber);

            System.out.println(String.format("Case #%d: ",caseNum)+result);

            caseNum++;
        }}
        private StringBuilder getResult(String string){
            char[] input=string.toCharArray();
            StringBuilder output=new StringBuilder();

            if (string==null|| string.length()==0){
                output=null;
            } else {
                //System.out.println(String.format("The test case %d",caseNum));
                int depth = 0;
                for (int i = 0; i < input.length; i++) {
                    int digit = input[i] - '0';
                    //System.out.println(Math.max(0,digit-depth));

                    for (int j = 0; j < Math.max(0, digit - depth); j++) {
                        output.append("(");
                    }
                    for (int j = 0; j < Math.max(0, depth - digit); j++) {
                        output.append(")");
                    }
                    output.append(digit);
                    depth = digit;
                }
                for (int i = 0; i < depth; i++) {
                    output.append(")");
                }
            }

            return output;
        }

}
/*
    char[] input=sequenceNumber.toCharArray();
    StringBuilder output=new StringBuilder();
    //System.out.println(String.format("The test case %d",caseNum));
    int depth=0;
            for (int i = 0; i < input.length; i++) {
        int digit=input[i]-'0';
        //System.out.println(Math.max(0,digit-depth));

        for (int j = 0; j < Math.max(0,digit-depth); j++) {
        output.append("(");
        }
        for (int j = 0; j <Math.max(0,depth-digit) ; j++) {
        output.append(")");
        }
        output.append(digit);
        depth=digit;
        }
        for (int i = 0; i <depth ; i++) {
        output.append(")");
        }
*/
