package abhi.coding.solution.hackerearth.problems.medium;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();

        List<String> list=new ArrayList<>();
        s.nextLine();
        while(n-- >0){
            list.add(s.nextLine());
        }
        System.out.println(list);
        method(list,list.size());
    }
    static void method(List<String> list,int n){

        Collections.sort(list,(a,b)->{
            int c=a.length()-b.length();
            if(c<0) return -1;
            else return 1;
        });
        System.out.println(list);
        boolean vis[]=new boolean[n];
        int count=0;


        for(int i=0;i<n;i++){
            if(vis[i]) continue;

            boolean flag=false;

            for(int j=i;j< n;j++){
                if(!vis[j] && list.get(j).indexOf(list.get(i))!=-1){
                    vis[j]=true;
                }
                flag=true;
            }

            if(flag)count++;

        }
        System.out.print(count);
    }








}