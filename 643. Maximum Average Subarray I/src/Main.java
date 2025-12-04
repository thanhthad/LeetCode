//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public double findMaxAverage(int[] nums, int k) {
        int max = 0 ;
        int value = 0;
        for(int i =0 ; i < k ; i++){
            value += nums[i];
        }
        max = value;
        for(int i = k; i < nums.length ; i++){
            value += nums[i];
            value -= nums[i-k];
            max = Math.max(max,value);
        }
        return (double)max/k;
    }
}