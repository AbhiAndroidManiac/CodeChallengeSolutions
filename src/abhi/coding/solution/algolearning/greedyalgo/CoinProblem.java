package abhi.coding.solution.algolearning.greedyalgo;

import java.util.*;

public class CoinProblem {
    int[] a={1,2,5,10,20,50,100,200};
    LinkedList ansList=new LinkedList();
    public static void main(String[] args) {
        int max_amount=520;
        //find the size of the coin array
        CoinProblem cp=new CoinProblem();
        //calculate the array size


        cp.getMxValues(cp.a,max_amount);
        for (int i = 0; i < cp.ansList.size() ; i++) {
            if (i==0)
                System.out.print("["+cp.ansList.get(i)+", ");
            else if (i== cp.ansList.size()-1)
                System.out.print(cp.ansList.get(i)+"]");
            else
                System.out.print(cp.ansList.get(i)+", ");
        }
    }

    private void getMxValues(int[] a,int max_amount){
        List<Values> l=new LinkedList<Values>();
        int count=0;

        for (int i = 0; i <a.length ; i++) {
            l.add(new Values(a[i],i));
        }
        Collections.sort(l);
        for (int i = 0; i <l.size() ; i++) {
            while (max_amount>=l.get(i).coinValue){
                max_amount-=l.get(i).coinValue;
                ansList.add(l.get(i).coinValue);
                count++;
            }
            if (max_amount==0)
                break;
        }

    }

    class Values implements Comparable<Values>{
        int coinValue;
        int index;
        public Values(int coinValue, int index) {
            this.coinValue = coinValue;
            this.index = index;
        }
        @Override
        public int compareTo(Values o) {
            return o.coinValue-this.coinValue;
        }

    }
}
