package Day2;

public class gfgDay2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 0, 4, 5, 0 };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
