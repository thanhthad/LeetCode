import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
    public static int removeDuplicates(int[] nums) {
        int write = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[write] = nums[i];
                write++;
            }
            System.out.println("-----------Loop: " + i + "-------------");
            System.out.println("Count: " + count);
            System.out.println("Right: " + write);

            for(int k = 0 ; k < nums.length; k ++){
                System.out.print(nums[k] + " " );
            }
            System.out.println();
        }

        return write;
    }

}