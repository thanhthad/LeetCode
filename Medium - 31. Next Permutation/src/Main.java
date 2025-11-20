import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int left = n - 2;

        // 1. Find pivot
        while (left >= 0 && nums[left] >= nums[left + 1]) {
            left--;
        }

        if (left >= 0) {
            // 2. Find the next greater element than nums[left]
            int right = n - 1;
            while (nums[right] <= nums[left]) {
                right--;
            }

            // 3. Swap
            swap(nums, left, right);
        }

        // 4. Reverse the tail
        reverse(nums, left + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

}