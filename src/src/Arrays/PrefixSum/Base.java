package Arrays.PrefixSum;

import java.util.Arrays;

public class Base {


    public static void preFixSum (int [] arr) {
        int left = 0;
        int right = arr.length;
//        int ans = 0;
//        for(int i = left ; i < right ; i++) {
//           ans = ans +  arr[i];
//           arr[i] = ans;
//        }

//        cleaner approach
        for (int i = 1 ; i < right ; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }

    public static void main(String[] args) {
        int [] arr = {2, 4, 1, 3, 6};
        preFixSum(arr);

        System.out.println(Arrays.toString(arr));

    }
}
