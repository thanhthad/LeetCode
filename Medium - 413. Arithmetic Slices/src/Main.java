import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfArithmeticSlices(
                new int[] {1,2,3,4}
        ));
    }

    public static int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;

        int result = 0;
        int current = 0;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                current += 1;
                result += current;
            } else {
                current = 0;
            }
        }
        return result;
    }

//    public static int numberOfArithmeticSlices(int[] nums) {
//        if(nums.length <= 2) return 0;
//
//        int result = 0;
//        int length = nums.length;
//
//        for (int window = 3; window <= length; window++) {
//            for (int end = window - 1; end < length; end++) {
//                int[] sub = Arrays.copyOfRange(nums, end - window + 1, end + 1);
//                if (check(sub)) {
//                    result++;
//                }
//            }
//        }
//        return result;
//    }
//
//    private static boolean check(int[] nums){
//        int diff = nums[1] - nums[0];
//        int right = 2;
//        int length = nums.length;
//
//        while(right < length){
//            if(nums[right] - nums[right - 1] != diff){
//                return false;
//            }
//            right++;
//        }
//        return true;
//    }
}