public class MoveZeroes {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int n = arr.length;

        int temp[] = new int[n];
        int index = 0;

        // Store non-zeros
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        // Fill remaining with zeros
        while (index < n) {
            temp[index++] = 0;
        }

        // Copy back to arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        // Print
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
