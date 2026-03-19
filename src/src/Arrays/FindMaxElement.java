package Arrays;

public class FindMaxElement {

    public static int findMaxElement (int [] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {2, 5, 1, 9, 3};
        System.out.println( findMaxElement(arr));;

    }
}
