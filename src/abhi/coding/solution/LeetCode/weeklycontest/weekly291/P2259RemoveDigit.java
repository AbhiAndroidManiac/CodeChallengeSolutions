package abhi.coding.solution.LeetCode.weeklycontest.weekly291;

public class P2259RemoveDigit {
    public static void main(String[] args) {
        System.out.println("The code is printing");
        String value = "1231";
        P2259RemoveDigit someobject = new P2259RemoveDigit();
        String result = someobject.removeDigit(value,'1');
        System.out.println("The result is "+result);
    }
    public  String removeDigit(String number, char digit) {
        String maxResult="";
        // Iterate through the string and remove the digit at each occurrence
        for (int i = 0; i <number.length() ; i++) {
            if (number.charAt(i)==digit){
                String newNumber = number.substring(0,i)+number.substring(i+1);
                // Compare with the current maxResult
                if (newNumber.compareTo(maxResult)>0){
                    maxResult=newNumber;
                }
            }
        }
        return maxResult;
    }

}
