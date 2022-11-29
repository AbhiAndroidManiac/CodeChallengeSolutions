package abhi.coding.solution.codeforces;


import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem1741A {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String[] strings={"XXXS XS","XXXL XL","XL M","XXL XXL"};
        for (int i = 0; i < (strings.length); i++) {
            System.out.println(strings[i]);
        }
        for (int i = 0; i < strings.length ; i++) {
            System.out.println(strings[i].split("\\s")[0]);
            System.out.println(strings[i].split("\\s")[1]);
        }
      /*  //int testcases = s.nextInt();
        //int currenttestcase=1;
        Problem1741A problem1741A=new Problem1741A();
        for (int i = 0; i <=testcases ; i++) {
            System.out.println(s.nextLine());
        }
*//*        while (currenttestcase<=testcases){
            String so=s.nextLine();
            problem1741A.somemethod(s.nextLine());

            currenttestcase++;
        }*/
    }
    private void somemethod(String something){
        String string1=something.split("\\s")[0];
        String string2=something.split("\\s")[1];
        if (string1.contains("S") & string2.contains("S") || string1.contains("L") & string2.contains("L") || string1.contains("M") & string2.contains("M")){
            System.out.println("=");
        } else {
            System.out.println("undefined");
        }
    }
}
