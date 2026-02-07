import java.util.Scanner;

public class trappingRainWater {

    // Finding left max
    static int maxLeft(int index, int[] arr) {
        int leftMax = 0;
        for (int i = 0; i < index; i++) {
            leftMax = Math.max(leftMax, arr[i]);
        }
        return leftMax;
    }

    // Finding right max
    static int maxRight(int index, int[] arr, int size) {
        int rightMax = 0;
        for (int i = size - 1; i > index; i--) {
            rightMax = Math.max(rightMax, arr[i]);
        }
        return rightMax;
    }

    // Total rainwater
    static int rainwater(int[] arr, int size) {
        int total = 0;
        for (int i = 0; i < size; i++) {
            int leftMax = maxLeft(i, arr);
            int rightMax = maxRight(i, arr, size);

            if (arr[i] < leftMax && arr[i] < rightMax) {
                total += Math.min(leftMax, rightMax) - arr[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many buildings are there?\n");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter building's sizes:\n");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(
                "The total rainwater that will be stored between the buildings is "
                        + rainwater(arr, size)
                        + " units"
        );

        scanner.close();
    }
}
