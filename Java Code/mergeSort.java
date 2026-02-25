import java.util.Scanner;
class Solution {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] nums = new int[n];

    System.out.println("Enter " + n + " elements:");
    for(int i = 0; i < n; i++){
        nums[i] = sc.nextInt();
    }

    mergeSort(nums);

    System.out.print("Sorted array: ");
    for(int i = 0; i < n; i++){
        System.out.print(nums[i] + " ");
    }

    sc.close();
}
    public static int[] mergeSort(int[] nums) {
        int length = nums.length;
        if (length < 2) return nums;
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        for(int i = 0; i < length; i++){
            if(i < middle)
            leftArray[i] = nums[i];
            else{
                rightArray[i - middle] = nums[i];
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, nums);
        return nums;

    }
    public static void merge(int[] leftArray, int[] rightArray, int[] nums){
        int leftSize = leftArray.length, rightSize = rightArray.length;
        int i = 0, l = 0, r = 0;
        while(l < leftSize && r < rightSize){
            if(leftArray[l] <= rightArray[r]){
                nums[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                nums[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            nums[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            nums[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
