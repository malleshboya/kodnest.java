import java.util.Arrays;
public class array {
    public static void rotateAntiClockwiseOnce(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int firstElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = firstElement;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("Original Array: " + Arrays.toString(arr));

        rotateAntiClockwiseOnce(arr);
        System.out.println("After Anti-Clockwise Rotation: " + Arrays.toString(arr));
    }
}
