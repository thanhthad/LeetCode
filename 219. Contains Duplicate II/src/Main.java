import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1},3));

    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int length = nums.length;
        int index = 0;
        while(index < length){
            if(!map.containsKey(nums[index])){
                map.put(nums[index],index);
            }else{
                int i = map.get(nums[index]);
                if (index - i <= k){
                    return true;
                }else{
                    map.put(nums[index],index);
                }
            }
            index ++;
        }
        return false;
    }

//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
//                return true;
//            }
//            map.put(nums[i], i);
//        }
//        return false;
//    }

}