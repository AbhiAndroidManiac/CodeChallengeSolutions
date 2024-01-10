package abhi.coding.solution.algolearning.hashing;

import java.rmi.server.LogStream;

public class StringHashing {
    public static void main(String[] args) {
        String string1 = new String("Geeksforgeeks");
        String string2 = new String("Practice");
        String string3 = new String("Geeks");
        String string4 = new String("Geeks");


        // Comparing for String 1 < String 2
        System.out.println("Comparing " + string1 + " and " + string2
                + " : " + conventionalStringCompare(string1, string2));

        // Comparing for String 3 = String 4
        System.out.println("Comparing " + string3 + " and " + string4
                + " : " + conventionalStringCompare(string3, string4));


        // Comparing for String 1 > String 4
        System.out.println("Comparing " + string1 + " and " + string4
                + " : " + conventionalStringCompare(string1, string4));
    }
    //conventional method of the string comparison using the lexicographically technique
    // with the time complexity of the O(min(str1.length,str2.length)
    public static int conventionalStringCompare(String str1,String str2){
        int l1=str1.length();
        int l2=str2.length();
        int lmin=Math.min(l1,l2);
        for (int i = 0; i <lmin ; i++) {
          int str1_ch = (int)str1.charAt(i);
          int str2_ch = (int)str2.charAt(i);
           if (str1_ch!=str2_ch){
               return str1_ch-str2_ch;
           }
        }
        //edge case  for strings like
        //Strings 1=Geeks 2=Geeksforgeeks
        if (l1!=l2){
            return l1-l2;
        }
        ///if non of the above conditions is true then it implies that the strings are equal
        else {
            return 0;
        }
    }
}
