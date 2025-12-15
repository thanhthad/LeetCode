//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public static int findDuplicate(int[] nums) {
        // Bước 1: tìm điểm gặp trong cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];          // đi 1 bước
            fast = nums[nums[fast]];    // đi 2 bước
        } while (slow != fast);

        // Bước 2: tìm entry của cycle (số bị lặp)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // hoặc fast, đều đúng
    }

//    public int findDuplicate(int[] nums) {
//        int length =nums.length;
//        for(int i = 0; i < nums.length -1 ; i++){
//            for(int j = i + 1 ; j < nums.length ; j++){
//                if(nums[i] == nums[j]) return nums[i];
//            }
//        }
//        return 0;
//    }
}