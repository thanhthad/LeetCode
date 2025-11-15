import java.awt.image.WritableRaster;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0 ; i < length ; i ++){
            array[i] = random.nextInt(99);
        }
        Arrays.sort(array);
    }

    public static boolean hasAdjacentDuplicate(int[] nums) {
        int length = nums.length - 1;
        int left = 0;
        while(left < length -1){
            if(nums[left] == nums[left + 1]){
                return false;
            }else{
                left ++;
            }
        }
        return true;
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length - 1;
        int left = 0 ;
        int count = length;
        while(left < length - 1){
            if(nums[left] == nums[left + 1]){
                count --;
                left ++;
            }
            left ++;
        }
        return count;
    }

    public static class Pair{
        int a,b;
        Pair(int a,  int b){
            this.a = a;
            this.b = b;
        }
    }
    public static List<Pair> twoSumSorted(int[] nums, int target) {
        List<Pair> pairList = new ArrayList<>();
        int length = nums.length - 1;
        int right = length;
        int left = 0 ;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum > target){
                right --;
            }else if(sum < target){
                left ++;
            }else{
                pairList.add(new Pair(left,right));
            }
        }
        return pairList;
    }

    public static int countPairsDiffLEK(int[] nums, int K) {
        int count = 0;
        int length = nums.length -1 ;
        int left = 0;
        int right = 1;
        while(right<length){
            while(nums[right] - nums[left] < K){
                right ++;
            }
            count += (right - left -1 );
            left ++;
            if(left == right){
                right ++;
            }
        }
        return count;
    }

    public static int lengthOfLongestSubstring(String s) {
        // TODO: dùng set / map + 2 con trỏ (left, right)
        int maxLen = 0;

        // ...

        return maxLen;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        // TODO: sort
        List<List<Integer>> result = new ArrayList<>();

        // TODO: loop i, rồi two pointers j, k

        return result;
    }







//    public static int countPairsLessThanK(int[] nums, int K) {
//        int left = 0;
//        int right = nums.length - 1;
//        int count = 0;
//        while(left < right){
//            int sum=nums[left] + nums[right];
//            if(sum >= K){
//                right --;
//            }else{
//                count += (right - left);
//                left ++;
//            }
//        }
//        return count;
//    }

//    public static int countPairsDiffLEK(int[] nums, int K){
//        int left = 0;
//        int right = 1;
//        int count = 0;
//
//        while (right < nums.length) {
//            if (nums[right] - nums[left] <= K) {
//                count += (right - left);
//                right++;
//            } else {
//                left++;
//                if (left == right) right++;
//            }
//        }
//        return count;
//    }



//    public static int countIJK (int[] array , int target){
//        int count = 0;
//        for (int i = 0 ; i < array.length - 2 ; i++ ){
//            int j = i + 1;
//            int k = array.length -1;
//            System.out.println("-------------Loop1------------");
//            while(j < k){
//                int sum = array[i] + array[j] + array[k];
//                if(sum >= target){
//                    k --;
//                }else {
//                    count += k - j;
//                    j++;
//                }
//                System.out.println("J  :" +j);
//                System.out.println("K  :" + k);
//                System.out.println("Count : " + count);
//            }
//        }
//        return count;
//    }

//    public static int countPairs(int[] array,int target){
//        int length = array.length;
//        int left = 0;
//        int right = length -1 ;
//        int count = 0 ;
//        while(left < right){
//            int sum = array[left] + array[right];
//            if(sum >= target){
//                right --;
//            }else{
//                count += (right -left);
//                left ++;
//            }
//        }
//        return count;
//    }


//    public static long countPairsDiffLessThan(int[] nums, int diff) {
//        int n = nums.length;
//        if (n < 2) return 0;
//
//        long count = 0;
//        int right = 1;
//
//        for (int left = 0; left < n - 1; left++) {
//            if (right < left + 1) right = left + 1;
//            while (right < n && (long)nums[right] - nums[left] < diff) {
//                right++;
//            }
//            count += (right - left - 1);
//        }
//        return count;
//    }


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