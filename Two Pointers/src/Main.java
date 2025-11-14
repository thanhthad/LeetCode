import java.awt.image.WritableRaster;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[] {1,2,3,5,6,7,13,14};
        int[] array2 = new int[] {1,2,3,4,5,6,7,8,9};
        int[] array3 = new int[] {1,2,3,4,5};
        int[] array4 = new int[] {1,2};
        System.out.println(countIJK(array3,10));
        System.out.println(countIJK(array4,4));
    }

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