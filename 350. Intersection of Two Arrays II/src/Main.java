import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] result = intersect(new int[] {3,4,5,5,6} , new int[] {4,8,6,6,6,9,9,5});
        for(int i =0 ; i < result.length ; i ++){
            System.out.println(result[i] + " ");
        }
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        int max = 0;
        for (int num : nums1) max = Math.max(max, num);
        for (int num : nums2) max = Math.max(max, num);

        int[] freq = new int[max + 1];

        for (int n : nums1) {
            freq[n]++;
        }

        List<Integer> result = new ArrayList<>();
        for (int n : nums2) {
            if (freq[n] > 0) {
                result.add(n);
                freq[n]--;
            }
        }

        int[] arr = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }


//    public static int[] intersect(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        List<Integer> lists= new ArrayList<>();
//        int lefts1 = 0;
//        int lefts2 = 0;
//        int lengths1 = nums1.length;
//        int lengths2 = nums2.length;
//        while(lefts1 < lengths1 && lefts2 < lengths2){
//            if(nums1[lefts1] == nums2[lefts2]){
//                lists.add(nums1[lefts1]);
//                lefts2 ++;
//                lefts1 ++;
//            }else if(nums1[lefts1] < nums2[lefts2]){
//                lefts1 ++;
//            }else{
//                lefts2 ++;
//            }
//        }
//        int[] result = new int[lists.size()];
//        for(int i= 0 ; i < lists.size() ; i++){
//            result[i] = lists.get(i);
//        }
//        return result;
//    }

//    public int[] intersect(int[] nums1, int[] nums2) {
//        if (nums1.length > nums2.length) {
//            return intersect(nums2, nums1);
//        }
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums1) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        List<Integer> result = new ArrayList<>();
//        for (int num : nums2) {
//            if (map.getOrDefault(num, 0) > 0) {
//                result.add(num);
//                map.put(num, map.get(num) - 1);
//            }
//        }
//
//        int[] arr = new int[result.size()];
//        for (int i = 0; i < result.size(); i++) {
//            arr[i] = result.get(i);
//        }
//        return arr;
//    }

}