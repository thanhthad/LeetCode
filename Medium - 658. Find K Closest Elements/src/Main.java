import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0 ;
        int right = arr.length - 1;
        while(right - left + 1 > k){
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            } else {
                right--;
            }

        }
        int[] array1 = Arrays.copyOfRange(arr,left,right + 1);
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < array1.length;i++){
            result.add(array1[i]);
        }
        return result;
    }
}