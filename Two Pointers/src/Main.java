//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }
    public static long countPairsDiffLessThan(int[] nums, int diff) {
        int n = nums.length;
        if (n < 2) return 0;

        long count = 0;
        int right = 1;

        for (int left = 0; left < n - 1; left++) {
            if (right < left + 1) right = left + 1;
            while (right < n && (long)nums[right] - nums[left] < diff) {
                right++;
            }
            count += (right - left - 1);
        }
        return count;
    }


//    public static int coupleEqual (int[] nums , int target){
//        int min = 0;
//        int max = nums.length -1;
//        int count = 0;
//        while(min < max){
//            int sum = nums[min] + nums[max];
//            if(sum == target){
//                count ++;
//                min ++;
////              or  max --;
//            }else if(sum > target){
//                max --;
//            }else{
//                min ++;
//            }
//        }
//        return count;
//    }

//    public static boolean twoSumSorted(int[] nums, int target){
//        int min = 0;
//        int max = nums.length -1;
//        while(min < max){
//            int sum = nums[min] + nums[max];
//            System.out.println("-----------------------");
//            System.out.println("Sum: " + sum);
//            System.out.println("Min: " + min);
//            System.out.println("Max: " + max);
//            if(sum == target){
//                return true;
//            }else if ( sum > target){
//                max --;
//            }else{
//                min ++;
//            }
//        }
//        return false;
//    }
}