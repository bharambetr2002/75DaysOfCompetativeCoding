public class gfgDay1 {

    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest: " + secondLargest);
    }
}
