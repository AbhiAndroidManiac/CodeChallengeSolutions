package abhi.coding.solution.algolearning.stringconcepts;

import java.awt.*;

public class Subsequence {
    public static void main(String[] args) {
        System.out.println("The system is showing the output");
    }

    //pick and don't approach
    // Function to print all the subsequences
    static  void printAllSubsequence(String input_str,String output_str){
        //Base case
        //  If the input string is empty then simply print the output
        if (input_str.length()==0){
            System.out.println(output_str);
            return;
        }
        // output string is passed as a parameter by including first
        // character of the current input string
        // And input string is passed as a parameter
        // by excluding the first character of current input string
        printAllSubsequence(input_str.substring(1), output_str + input_str.charAt(0));

    }
}
