//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {0,1,1,2,2,0,0,2,1};
        sortColors(nums);
        for(int i =0 ; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {

            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, right);
                right--;
            }
        }
    }

    public static int[] swap ( int[] nums , int left , int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        return nums;
    }
}