import java.util.Scanner;

public class BubbleSortStats {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read n
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];

        // TODO: Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // TODO: Implement Bubble Sort & Keep track of the number of swaps
        long totalSwaps = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    totalSwaps++;
                }
            }
        }

        // TODO: Print total swaps
        System.out.println(totalSwaps);

        // TODO: Print the first element of the sorted array
        System.out.println(arr[0]);

        // TODO: Print the last element of the sorted array
        System.out.println(arr[n - 1]);

        sc.close();
    }
}