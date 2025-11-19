import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{
                1000000000,1000000000,1000000000,1000000000
        }, -294967296));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int a = 0; a < n - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) continue; // skip duplicate a

            // Pruning (minimum sum > target)
            long minSum = (long) nums[a] + nums[a+1] + nums[a+2] + nums[a+3];
            if (minSum > target) break;

            // Pruning (maximum sum < target)
            long maxSum = (long) nums[a] + nums[n-1] + nums[n-2] + nums[n-3];
            if (maxSum < target) continue;

            for (int b = a + 1; b < n - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) continue; // skip duplicate b

                int left = b + 1;
                int right = n - 1;

                // Pruning b layer
                long min2 = (long) nums[a] + nums[b] + nums[left] + nums[left + 1];
                if (min2 > target) break;

                long max2 = (long) nums[a] + nums[b] + nums[right] + nums[right - 1];
                if (max2 < target) continue;

                while (left < right) {
                    long sum = (long) nums[a] + nums[b] + nums[left] + nums[right];

                    if (sum == target) {
                        res.add(Arrays.asList(nums[a], nums[b], nums[left], nums[right]));

                        left++;
                        right--;

                        // skip duplicate left
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        // skip duplicate right
                        while (left < right && nums[right] == nums[right + 1]) right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return res;
    }

}