package abhi.coding.solution.basics.dynamicprogramming;

import java.util.HashMap;

public class Fib {
    public HashMap<Integer,Integer> hm;
    int nthValue;
    public static void main(String[] args) {
        Fib fibon=new Fib();
        fibon.hm=new HashMap<>();
        //System.out.println(fibon.fibm(6));
        //System.out.println(fibon.fibm(7));
        //System.out.println(fibon.fibm(8));
        System.out.println(fibon.fibm(51));

    }
    int fibm(int n){
        if (hm.containsKey(n)) return hm.get(n);
        if (n<=2) {
            return 1;
        }
        nthValue= (fibm(n - 2)+fibm(n - 1));
        hm.put(n,nthValue);
        return nthValue;
    }
}
