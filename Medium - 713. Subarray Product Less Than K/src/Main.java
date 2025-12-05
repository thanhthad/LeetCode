//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return  0;
        int left = 0 ;
        int right = 0;
        int count = 1;
        int result = 0;
        while(right < nums.length){
            count *= nums[right];
            while(left <= right && count >= k){
                count /= nums[left];
                left ++;
            }
            result += right - left + 1;
            right ++;
        }
        return result;
    }

}