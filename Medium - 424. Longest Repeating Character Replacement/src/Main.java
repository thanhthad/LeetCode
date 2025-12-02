//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        characterReplacement("ABAB",2);
    }
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxLen = 0;
        int n = s.length();
        int max = 0;
        int left = 0;
        int right = 0;
        while(right < n){
            int index = s.charAt(right) - 'A';
            count[index] ++;
            max = Math.max(max,count[index]);
            if ((right - left + 1) - max > k){
                count[s.charAt(left) - 'A']--;
                left ++;
            }
            maxLen =  Math.max(maxLen,right -left + 1);
            right ++;
        }
        return maxLen;
    }

//    public static int characterReplacement(String s, int k) {
//        int[] count = new int[26];
//        int maxFreq = 0;
//        int left = 0;
//        int maxLen = 0;
//
//        for (int right = 0; right < s.length(); right++) {
//            int idx = s.charAt(right) - 'A';
//            count[idx]++;
//
//            maxFreq = Math.max(maxFreq, count[idx]);
//
//            while ((right - left + 1) - maxFreq > k) {
//                count[s.charAt(left) - 'A']--;
//                left++;
//            }
//
//            maxLen = Math.max(maxLen, right - left + 1);
//        }
//
//        return maxLen;
//    }

}