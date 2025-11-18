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
        System.out.println(threeSumClosest(array,(int) Math.pow(3,3)));

    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min  = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        for(int i = 0 ; i < nums.length - 2; i++){
            right = nums.length -1;
            left = i + 1;
            int sum = nums[i] + nums[left] + nums[right];
            System.out.println("---------------- Loop:" + i + "-----------------");
            while(left < right){
                while(left < right && sum > target){
                    System.out.println("-----------While sum > target------------");
                    System.out.println("Right : " + right);
                    System.out.println("Sum: " + sum);
                    min = Math.min(min,sum - target);
                    right --;
                    sum = sum - nums[right + 1] + nums[right];
                    System.out.println("Min : " + min);
                }
                while(left < right && sum < target){
                    System.out.println("-----------While sum < target------------");
                    System.out.println("Left: " + left);
                    System.out.println("Sum: " + sum);
                    min = Math.min(min , target - sum);
                    left ++;
                    sum = sum - nums[left-1] + nums[left];
                    System.out.println("Min : " + min);
                }
                if(min == 0){
                    return target;
                }
            }
        }
        return min;
    }
}