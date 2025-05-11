package Day4;

public class gfgDay4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 5;
        int n = arr.length;
        // for d rotations
        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }
}
