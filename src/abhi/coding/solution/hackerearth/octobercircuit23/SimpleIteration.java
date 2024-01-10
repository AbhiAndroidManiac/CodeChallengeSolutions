package abhi.coding.solution.hackerearth.octobercircuit23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleIteration {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        for (int i = a; i <=b ; i++) {
            if (i<=9){
                //print the english word of it
                System.out.println(printEnglishOfNumber(i));
            } else {
               System.out.println(isOddOrEven(i));
            }
        }

    }
    private static String isOddOrEven(int n){
        if (n%2==0){
            return "even";
        } else {
            return "odd";
        }
    }
    private static String printEnglishOfNumber(int n){
        String returnValue = "";
        switch (n){
            case 1 :
                returnValue= "ONE";
                break;
            case 2:
                returnValue= "TWO";
                break;
            case 3:
                returnValue= "THREE";
                break;
            case 4:
                returnValue= "FOUR";
                break;
            case 5:
                returnValue= "FIVE";
                break;
            case 6:
                returnValue= "SIX";
                break;
            case 7:
                returnValue= "SEVEN";
                break;
            case 8:
                returnValue= "EIGHT";
                break;
            case 9:
                returnValue= "NINE";
                break;
            default:
                returnValue= "ZERO";
                break;
            }
            return returnValue;
        }

}
