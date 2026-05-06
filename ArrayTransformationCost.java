import java.util.*;

public class ArrayTransformationCost {

    public static int minOperations(int[] arr, int k) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if ((arr[i] - arr[0]) % k != 0) {
                return -1;
            }
        }

        Arrays.sort(arr);

        int target = arr[n / 2];

        int totalOperations = 0;

        for (int i = 0; i < n; i++) {
            totalOperations += Math.abs(arr[i] - target) / k;
        }

        return totalOperations;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        int result = minOperations(arr, k);

        System.out.println("Minimum operations: " + result);

        sc.close();
    }
}
