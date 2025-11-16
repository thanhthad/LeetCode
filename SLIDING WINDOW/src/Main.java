import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int length = random.nextInt(1,20);
        int[] array = new int[length];
        for(int i = 0 ; i < length ; i++){
            array[i] = random.nextInt(0,100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(smallestSubarrayWithSumAtLeastK(array,400));
    }

    public static int smallestSubarrayWithSumAtLeastK(int[] nums, int K) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= K) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }





//    public static int maxSumOfK(int[] nums, int k) {
//        int result = 0;
//        if(nums.length <k){
//            return  -1;
//        }
//        int left = 0;
//        for(int i = 0; i < k ; i ++){
//            result += nums[i];
//        }
//        int max= result;
//        for(int right = k; right < nums.length; right++){
//            result += nums[right] - nums[right-k];
//            max = Math.max(max,result);
//        }
//        return max;
//    }

}