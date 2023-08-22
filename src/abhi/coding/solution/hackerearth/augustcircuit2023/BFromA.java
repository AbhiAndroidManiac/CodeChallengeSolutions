package abhi.coding.solution.hackerearth.augustcircuit2023;

import java.util.*;

public class BFromA {
    List listA = new ArrayList();
    List listB = new ArrayList();
    public static void main(String[] args) {
        String[] a={"h","g","e","b"};
        String[] b={"e","b","h"};
        BFromA bFromA = new BFromA();
        bFromA.listA=Arrays.asList(a);
        bFromA.listB=Arrays.asList(b);

        HashMap<String,Integer> validatorMap = new HashMap<>();
        for (int i = 0; i <bFromA.listB.size() ; i++) {
            validatorMap.put(bFromA.listB.get(i).toString(),0);
        }
        validateExistence(validatorMap,bFromA.listA);
        for (String name: validatorMap.keySet()) {
            System.out.print(validatorMap.get(name)+" ");
        }
    }

    private static int validateExistence(HashMap<String,Integer> validatorMap,List a){
        int count = 0;
        for (int i = 0; i <a.size() ; i++) {
            //check if the element of the bigger array is present
            if (validatorMap.containsKey(a.get(i))){
                //check if the character is already read and added in the hashmap
                if (validatorMap.get(a.get(i))==0){
                    //if not add the index in the value against the character key
                    validatorMap.put(String.valueOf(a.get(i)),i);
                }
            }
        }
        for (String name: validatorMap.keySet()) {
            System.out.print(validatorMap.get(name)+" ");
            if (validatorMap.get(name)==0){
                count=0;
            } else {
                count=1;
            }
        }
        if (count==1){

        }
        return count;
    }
}






  /* int[] a= {2, 3 ,1};
        //core for creating all possible subsets of the array
        for (int i = 0; i < a.length; i++)
            // For loop for end index
            for (int j = i; j < a.length; j++) {
                // For loop to print subarray elements
                ArrayList<Integer> b  = new ArrayList<>();
                for (int k = i; k <=j; k++) {
                    b.add(a[k]);
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }*/
