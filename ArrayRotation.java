import java.util.Arrays;

public class ArrayRotation {
    // left rotation by d
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    // right rotation by d
    public static void rightRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        leftRotate(arr1, 2);
        System.out.println("Left rotated by 2: " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5};
        rightRotate(arr2, 2);
        System.out.println("Right rotated by 2: " + Arrays.toString(arr2));
    }
}
