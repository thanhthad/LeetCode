import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[random.nextInt(3,8)];
        for(int i =0 ; i < array.length ; i ++){
            array[i] = random.nextInt(-10,10);
            System.out.print(i + ":" + array[i] + "  ");
        }
        System.out.println();
        System.out.println("Length : " + array.length);
        System.out.println("Target : " + (int) Math.pow(3,3));
//        System.out.println(threeSumClosest(array,(int) Math.pow(3,3)));
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4},1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    // sum == target → best case
                    return target;
                }
            }
        }
        return closest;
    }

}