package abhi.coding.solution.googlecodejam.y2020.parentingpartnersreturn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class PPRSolution {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int testCases=s.nextInt();
        int caseNum=1;
        PPRSolution pprSolution=new PPRSolution();
        while (caseNum<=testCases){
            int n=s.nextInt();
            int[][] a=new int[n][2];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <2 ; j++) {
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println(String.format("Case #%d: %s", caseNum, pprSolution.calSchedule(a)));
            caseNum++;
        }
    }
    private String calSchedule(int[][] schedule){
        if (schedule==null||schedule.length==0||schedule[0].length==0){
            return null;
        }
        List<IntervalWithIndex> l=new ArrayList<>();
        for (int i = 0; i < schedule.length ; i++) {
            l.add(new IntervalWithIndex(schedule[i][0],schedule[i][1],i));
        }
        Collections.sort(l);
        int CEndTime=Integer.MIN_VALUE;
        int JEndTime=Integer.MIN_VALUE;
        char[] result =new char[l.size()];
        for (int i = 0; i < l.size(); i++) {
            IntervalWithIndex it=l.get(i);
            if (it.startTime>=CEndTime){
                result[it.originalIndex]='C';
                CEndTime=it.endTime;
            } else if (it.startTime>=JEndTime){
                result[it.originalIndex]='J';
                JEndTime=it.endTime;
            } else {
                return "IMPOSSIBLE";
            }
        }
        StringBuilder sb=new StringBuilder();
        for (char c:result
             ) {
            sb.append(c);
        }
        return sb.toString();
    }

    private class IntervalWithIndex implements Comparable<IntervalWithIndex>{
        int startTime;
        int endTime;
        int originalIndex;

        public IntervalWithIndex(int startTime, int endTime, int originalIndex) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.originalIndex = originalIndex;
        }

        @Override
        public int compareTo(IntervalWithIndex o) {
            return this.startTime-o.startTime;
        }
    }

}
