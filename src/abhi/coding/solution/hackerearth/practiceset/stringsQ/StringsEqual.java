package abhi.coding.solution.hackerearth.practiceset.stringsQ;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringsEqual {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(reader.readLine());
        while (testcases-- > 0){
            String line =reader.readLine();
            String line2 = reader.readLine();
            String line3 = reader.readLine();
            System.out.println(line);
            System.out.println(line2);
            System.out.println(line3);
        }
    }
}
