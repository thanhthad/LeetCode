import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(findPairs(
                new int[]{3,1,4,1,5},2
        ));
    }
    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int toK = i + 1;
            while(toK < nums.length && nums[toK] - nums[i] < k){
                toK ++;
            }
            if(toK < nums.length && nums[toK] - nums[i] == k){
                count ++;
            }
        }
        return count;
    }
//    public static int findPairs(int[] nums, int k) {
//        if(k < 0 ) return  0;
//        Map<Integer,Integer> saved = new HashMap();
//        for(int num : nums){
//            saved.put(num, saved.getOrDefault(num,0) + 1);
//        }
//        int count = 0;
//        if(k == 0){
//            for(int val : saved.values()){
//                if(val >= 2 ) count++;
//            }
//        }else{
//            for(int key : saved.keySet()){
//                if(saved.containsKey(key + k)){
//                    count ++;
//                }
//            }
//        }
//        return count;
//    }
}