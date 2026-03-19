package Arrays;

public class ReverseAnArray {

    public static void reverseAnArray (int [] arr) {
      int start = 0;
      int end = arr.length - 1;
      while (start <= end) {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
      }
      return;
    }

    public static void main(String[] args) {
        int [] arr = {2, 5, 1, 9, 3};
        reverseAnArray(arr);

        for(var a : arr) {
            System.out.print(a + " ");
        }

    }
}
