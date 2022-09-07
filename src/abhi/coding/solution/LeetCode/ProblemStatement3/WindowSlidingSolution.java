package abhi.coding.solution.LeetCode.ProblemStatement3;

public class WindowSlidingSolution {
    //timecomplexity for this technique is O(n^2)
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);
        System.out.println("The length of the longest "
                + "non-repeating character "
                + "substring is " + LongestUniqueCharSubstring(str));
    }

    public static int LongestUniqueCharSubstring(String str){
        String text="";
        int maxLength=-1;
        if (str.isEmpty()){
            return 0;
        } else if (str.length()==1){
            return 1;
        }

        for (char c: str.toCharArray()){
            String current=String.valueOf(c);
            if (text.contains(current)){
                text=text.substring(text.indexOf(current)+1);
                String something=text;
            }
            text=text+String.valueOf(c);
            String some=text;
            maxLength=Math.max(text.length(),maxLength);
        }
        return maxLength;
    }
}
