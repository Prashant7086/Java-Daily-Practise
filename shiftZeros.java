public class shiftZeros {

    public static void shiftZeros(int[] arr) {

        int j = 0; // Position for the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill the remaining positions with zeros
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 4, 0, 5};

        shiftZeros(arr);

        System.out.print("Array after shifting zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}