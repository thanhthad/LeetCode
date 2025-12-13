//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        int[] array1 = new int[] { 1,2,3,4,5,6,7,8,9,12,12,12};
        rotate(array1,5);
        for (int i = 0 ; i < array1.length; i++){
            System.out.println(array1[i] + " ");
        }
    }
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        int[] result = new int[length];
        int index = 0;
        for(int i = length - k ; i < length ; i++){
            result[index] = nums[i];
            index ++;
        }
        int i = 0;
        while(index < length){
            result[index] = nums[i];
            i ++;
            index ++;
        }

        for(i = 0 ; i < length ; i++){
            nums[i] = result[i];
        }
    }
}