package abhi.coding.solution.basicdatastructureUse;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetUse {
    public static void main(String[] args) {
        Integer[] a={22, 45,33, 66, 55, 34, 77};
        Integer[] b={33, 2, 83, 45, 3, 12, 55};
        Set<Integer> set1=new HashSet<>();
        set1.addAll(Arrays.asList(a));
        Set<Integer> set2=new HashSet<>();
        set2.addAll(Arrays.asList(b));

        //finding union of set1 and set2
        Set<Integer> union_data=new HashSet<>(set1);
        union_data.addAll(set2);
        System.out.println("union of set1 and set2"+union_data);
        Iterator<Integer> it=union_data.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        it.forEachRemaining(s1 -> System.out.print("The for each print is"+set1));
        //finding intersection of set1 and set2
        Set<Integer> intersection=new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection of set1 and set2"+intersection);

        //finding difference of set1 and set2
        Set<Integer> diff=new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println("diference of set1 and set2"+diff);


    }

}
