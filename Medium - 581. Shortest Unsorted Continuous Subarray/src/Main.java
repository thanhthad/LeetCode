import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[]{2,6,4,8,10,9,15}));
    }

    public static int findUnsortedSubarray(int[] nums) {
        int max_seen =  -(int)Math.pow(10,5) + 1;
        int left = 0;
        int min_seen =  ((int)Math.pow(10,5) + 1);
        int length = nums.length ;
        int right = -1;
        for(int i = 0 ; i < length ; i++){
            if(max_seen <= nums[i]){
                max_seen = nums[i];
            }else{
                right = i;
            }
        }
        System.out.println("Max_seen: " + max_seen);
        System.out.println("Right: "  + right);
        for(int i = length - 1 ; i >= 0 ; i--){
            if(min_seen >= nums[i]){
                min_seen = nums[i];
            }else{
                left = i;
            }
        }
        System.out.println("Min_seen: " + min_seen);
        System.out.println("Left: " + left);
        return right - left + 1;
    }


//    public static int findUnsortedSubarray(int[] nums) {
//        int length = nums.length;
//        int[] array = new int[length];
//        for(int i =0 ;i < length ; i ++){
//            array[i] = nums[i];
//        }
//        Arrays.sort(array);
//        int right = length - 1;
//        int left = 0;
//        while(left < right){
//            boolean checkleft = false;
//            boolean checkright = false;
//            if(nums[left] != array[left]){
//                checkleft = true;
//            }else{
//                left ++;
//            }
//            if(nums[right] == array[right]){
//                right --;
//            }else{
//                checkright = true;
//            }
//            if(checkleft == true && checkright == true){
//                return right - left + 1;
//            }
//            System.out.println("Left: " +left);
//            System.out.println("Right: " + right);
//            System.out.println("Lenght:" + length);
//            System.out.println("-----------------------------");
//        }
//        return 0;
//    }
}