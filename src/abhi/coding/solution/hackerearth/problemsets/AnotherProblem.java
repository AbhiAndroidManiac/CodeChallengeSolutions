package abhi.coding.solution.hackerearth.problemsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnotherProblem {
    public static void main(String[] args) {
        List<String> chunks = new ArrayList<>();
        chunks.add("pensource");
        chunks.add("opens");
        chunks.add("urcekaruya");
        chunks.add("ruyadsa");
        System.out.println("opensourcekaruyadsa");
        List<String> resultSaver = new ArrayList<>();
        StringBuilder input = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chunks.size() ; i++) {
            String compare = chunks.get(i);
            input.append(compare);
            for (int j = 0; j <chunks.size() ; j++) {
                String comparator = chunks.get(j);
                if (i==j){
                    continue;
                }
                if (compare.substring(compare.length()-4).equals(comparator.substring(0,4))){
                    if (!contains(result,compare) && !contains(result,compare)){
                        result.append(compare);
                        result.append(comparator.substring(4,comparator.length()));
                    } else {

                    }

                }else {
                }

            }

        }
        System.out.println("The length of string" + input.length());
        System.out.println(result+" "+result.length());
    }
    public static boolean contains(StringBuilder sb, String findString){

        /*
         * if the substring is found, position of the match is
         * returned which is >=0, if not -1 is returned
         */
        return sb.indexOf(findString) > -1;
    }

}
