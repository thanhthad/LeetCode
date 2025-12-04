import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public int findLHS(int[] nums) {
        Map<Integer,Integer> saved = new HashMap<>();
        int max = 0;
        for(int i = 0; i < nums.length ; i++){
            if(saved.containsKey(nums[i])){
                saved.put(nums[i],saved.get(nums[i]) + 1);
            }else{
                saved.put(nums[i],1);
            }
        }
        for(int key : saved.keySet()){
            if(saved.containsKey(key + 1)){
                max = Math.max(max,saved.get(key) + saved.get(key + 1));
            }
        }
        return max;
    }

//    public int findLHS(int[] nums) {
//        Map<Integer, Integer> freq = new HashMap<>();
//        int max = 0;
//
//        for(int x : nums){
//            freq.put(x, freq.getOrDefault(x, 0) + 1);
//        }
//
//        for(int x : freq.keySet()){
//            if(freq.containsKey(x + 1)){
//                max = Math.max(max, freq.get(x) + freq.get(x + 1));
//            }
//        }
//
//        return max;
//    }
}