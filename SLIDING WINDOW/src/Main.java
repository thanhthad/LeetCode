import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
    }
    public static int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (last[c] >= left) {
                left = last[c] + 1;
            }

            last[c] = right;

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
//
//    public static int lengthOfLongestSubstring(String s) {
//        Map<Character, Integer> lastIndex = new HashMap<>();
//        int left = 0;
//        int maxLen = 0;
//
//        for (int right = 0; right < s.length(); right++) {
//            char c = s.charAt(right);
//
//            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left) {
//                left = lastIndex.get(c) + 1;
//            }
//
//            lastIndex.put(c, right);
//
//            maxLen = Math.max(maxLen, right - left + 1);
//        }
//
//        return maxLen;
//    }



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