//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] test = twoSum(new int[]{1,2,3,4,5,6,7,8,9,12,13} , 222);
        for(int i = 0; i < 2 ; i ++){
            System.out.println(test[i] + " ");
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        int[] result = new int[2];
        while(left < right){
            int value = numbers[left] + numbers[right];
            if(value == target){
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            }
            if(value > target){
                right --;
            }
            if(value < target){
                left ++;
            }
        }
        return result;
    }
}