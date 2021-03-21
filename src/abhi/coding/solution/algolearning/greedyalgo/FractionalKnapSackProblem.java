package abhi.coding.solution.algolearning.greedyalgo;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSackProblem {
    //Greedy approach
    public static void main(String[] args) {
        FractionalKnapSackProblem fp=new FractionalKnapSackProblem();
        int[] wt={10,40,20,30};
        int[] val={60,40,100,120};
        int capacity=50;
        double maxValue=fp.getMaxValue(wt,val,capacity);
        System.out.print("Maximum value we can obtain = "+maxValue);
    }
    //function to get the maximum value
    private double getMaxValue(int[] wt,int[] val,int capacity){
        ItemValue[] itemValues=new ItemValue[wt.length];

        for (int i = 0; i < wt.length ; i++) {
            itemValues[i]=new ItemValue(wt[i],val[i],i);
        }
        //sorting items by  value
        Arrays.sort(itemValues, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue o1, ItemValue o2) {
                return o2.cost.compareTo(o1.cost);
            }
        });
        double totalValue=0d;
        for (ItemValue i: itemValues) {
            int curWt=(int) i.wt;
            int curVal=(int) i.val;
            if (capacity-curWt>0){
                //this weight can be picked
                capacity=capacity-curWt;
                totalValue+=curVal;
            } else {
                //item can't be picked whole
                double fraction=((double)capacity/(double)curWt);
                totalValue+=curVal*fraction;
                capacity=(int)(capacity-(curWt*fraction));
                int cal=capacity;
                break;
            }
        }


        return totalValue;
    }
    class ItemValue{
        Double cost;
        double wt,val,ind;
        //itemValue function
        public ItemValue(double wt, double val, double ind) {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost=new Double((double) val/(double) wt);
        }
    }
}
