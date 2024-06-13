package abhi.coding.solution.codeforces.problemset;

import java.util.Scanner;

public class ThreatreSquare1A0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long m = s.nextLong();
        long a = s.nextLong();

        //calculate the number of flag stones needed  along the dimensions
        //calculate the number of stone required along the length
        //assuming n is for length
        long numFlagStonesLength = Long.valueOf((long) Math.ceil(Double.valueOf(n)/Double.valueOf(a)));
        //calculate the number of stone required along the length
        //assuming m is for breadth
        long numFlagStonesBreadth = Long.valueOf((long) Math.ceil(Double.valueOf(m)/Double.valueOf(a)));

        //total number of flagstones
        long totalFlagStones = numFlagStonesBreadth*numFlagStonesLength;
        System.out.println(totalFlagStones);
    }
}
