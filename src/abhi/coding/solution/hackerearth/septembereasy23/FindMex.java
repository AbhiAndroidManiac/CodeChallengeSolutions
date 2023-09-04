package abhi.coding.solution.hackerearth.septembereasy23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class FindMex {

/*    Problem
    You are given an integer array of length
. You have to find
    of
    element for all
            .

            of the
    element is the minimum element greater than or equal to
    which is not present in array till the
    index.



    Input Format:

    First line contains an integer
    denoting the size of array.

    Next line contains
    integers denoting the elements of the array.



    Output Format:

    Print
    integers.
    element should be the
    of the array prefix till
    5
    1 0 5 5 3
    0 2 2 2 2

    For first test case mex of first index is 0. As it is note present in array

mex of second index is 2 as 0 and 1 is present in array.

mex of 3rd, 4th and 5th index is 2.
    */



    public static void main(String[] args) throws IOException {
        //input taking code for the program
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st =new StringTokenizer(br.readLine());
        int[] presence = new int[2*100001];
        int mex = 0; //current mex
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            presence[arr[i]] = 1; //mark the element as present
            //update the mex as long as the current element is in the presence arrat
            while (presence[mex] ==1){
                mex++;
            }
            result.append(mex).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}

    /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int arraySize = Integer.parseInt(reader.readLine());
    String line = reader.readLine();
    List<String> list = new LinkedList<>(Arrays.asList(line.split(" ")));
    List<Integer> sampleList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
    StringBuffer result = new StringBuffer();
        for (int i = 0; i <arraySize ; i++) {
        List opList = sampleList.subList(0,i+1);
        opList= (List) opList.stream().sorted().collect(Collectors.toList());
        int resultToAdd = findSmallestMissing(opList,0,i);
        result.append(resultToAdd);
        }
        System.out.print(result);
public static int findSmallestMissing(List<Integer> nums, int left, int right)
        {
        // base condition
        if (left > right) {
        return left;
        }

        int mid = left + (right - left) / 2;

        // if the mid-index matches with its value, then the mismatch
        // lies on the right half
        if (nums.get(mid) == mid) {
        return findSmallestMissing(nums, mid + 1, right);
        }
        else {
        // mismatch lies on the left half
        return findSmallestMissing(nums, left, mid - 1);
        }
        }*/
