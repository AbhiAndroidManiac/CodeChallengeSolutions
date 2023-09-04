package abhi.coding.solution.hackerearth.septembereasy23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PerfectCube {
    static int MAX = (int)(1e5);

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        List<Integer> list = new LinkedList<>(Stream.of(line.split("\\s+")).map(Integer::valueOf).collect(Collectors.toList()));
        int k = 1;
        int c = 0;
        for (int i = 0; i <arraySize; i++) {
            int s = list.get(i);
            if (Math.floor(Math.cbrt(s)) == Math.ceil(Math.cbrt(s))) {
                c++;
            }
            for (int j = i + 1; j < arraySize; j++) {
                s += list.get(j);
                if (Math.floor(Math.cbrt(s)) == Math.ceil(Math.cbrt(s))) {
                    c++;
                }
            }
        }
        System.out.println(c);
       // countSubarrays(list, arraySize);
    }
    static class Key
    {
        int arr[];

        Key(int arr[])
        {
            this.arr = arr;
        }

        @Override public int hashCode()
        {
            return 31 + Arrays.hashCode(arr);
        }

        @Override public boolean equals(Object obj)
        {
            if (this == obj)
                return true;
            if (obj == null ||
                    (getClass() != obj.getClass()))
                return false;

            Key other = (Key)obj;

            if (!Arrays.equals(arr, other.arr))
                return false;

            return true;
        }
    }

    // Function to store the prime
// factorization of a number
    static void primeFactors(int v[], int n)
    {
        for(int i = 2; i * i <= n; i++)
        {

            // If N is divisible by i
            while (n % i == 0)
            {

                // Increment v[i] by 1 and
                // calculate it modulo by 3
                v[i]++;
                v[i] %= 3;

                // Divide the number by i
                n /= i;
            }
        }

        // If the number is not equal to 1
        if (n != 1)
        {

            // Increment v[n] by 1
            v[n]++;

            // Calculate it modulo 3
            v[n] %= 3;
        }
    }

    // Function to count the number of
// subarrays whose product is a perfect cube
    static void countSubarrays(List<Integer> arr, int n)
    {

        // Store the required result
        int ans = 0;

        // Stores the prime
        // factors modulo 3
        int v[] = new int[MAX];

        // Stores the occurrences
        // of the prime factors
        HashMap<Key, Integer> mp = new HashMap<>();
        mp.put(new Key(v), 1);

        // Traverse the array, arr[]
        for(int i = 0; i < n; i++)
        {

            // Store the prime factors
            // and update the vector v
            primeFactors(v, arr.get(i));

            // Update the answer
            ans += mp.getOrDefault(new Key(v), 0);

            // Increment current state
            // of the prime factors by 1
            Key vv = new Key(v);
            mp.put(vv, mp.getOrDefault(vv, 0) + 1);
        }

        // Print the result
        System.out.println(ans);
    }
}
