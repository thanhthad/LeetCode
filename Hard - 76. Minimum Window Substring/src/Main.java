import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int[] window = new int[128];

        int left = 0, right = 0;
        int formed = 0;
        int required = 0;

        for (int i = 0; i < 128; i++) {
            if (need[i] > 0) required++;
        }

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window[c]++;

            if (need[c] > 0 && window[c] == need[c]) {
                formed++;
            }

            // Khi window đã chứa đủ t
            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char remove = s.charAt(left);
                window[remove]--;

                if (need[remove] > 0 && window[remove] < need[remove]) {
                    formed--;
                }
                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }

//    public static String minWindow(String s, String t) {
//        char [] char_s = s.toCharArray();
//        char [] char_t = t.toCharArray();
//        if(char_s.length < char_t.length) return "";
//        int[] array_t = new int[128];
//        Arrays.fill(array_t,0);
//        for(char value  : char_t){
//            array_t[value] ++;
//        }
//        int[] array_s = new int[128];
//        int right = 0;
//        int left = 0;
//        int min = s.length() + 1;
//        char[] result = null;
//        while(right < char_s.length){
//            if(array_t[char_s[right]] == 0){
//                right ++;
//                continue;
//            }
//            array_s[char_s[right]]  ++;
//            while(array_s[right] >= array_t[right]){
//                if(min > (right - left + 1)){
//                    result = Arrays.copyOfRange(char_s,left, right +1);
//                    min = right - left + 1;
//                }
//                array_s[char_s[left]] --;
//                left ++;
//            }
//        }
//        StringBuilder string = null;
//        for(int i = 0 ;i < result.length ; i++){
//            string.append(result[i]);
//        }
//        return string.toString();
//    }
}