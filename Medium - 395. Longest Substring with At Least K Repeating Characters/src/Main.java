//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public int longestSubstring(String s, int k) {
        int maxLen = 0;
        int n = s.length();

        for (int t = 1; t <= 26; t++) {
            int[] count = new int[26];
            int start = 0, end = 0;
            int numUnique = 0;
            int numAtLeastK = 0;

            while (end < n) {
                int idx = s.charAt(end) - 'a';
                if (count[idx] == 0) numUnique++;
                count[idx]++;

                if (count[idx] == k) numAtLeastK++;
                end++;

                // nếu khác nhau vượt quá t -> thu hẹp
                while (numUnique > t) {
                    int leftIdx = s.charAt(start) - 'a';
                    if (count[leftIdx] == k) numAtLeastK--;
                    count[leftIdx]--;
                    if (count[leftIdx] == 0) numUnique--;
                    start++;
                }

                // window hợp lệ
                if (numUnique == numAtLeastK) {
                    maxLen = Math.max(maxLen, end - start);
                }
            }
        }
        return maxLen;
    }

//    public int longestSubstring(String s, int k) {
//        if (s == null || s.length() == 0) return 0;
//
//        int[] count = new int[26];
//        for (char c : s.toCharArray()) {
//            count[c - 'a']++;
//        }
//
//        // Tìm ký tự xuất hiện < k
//        for (int i = 0; i < s.length(); i++) {
//            if (count[s.charAt(i) - 'a'] < k) {
//                // chia chuỗi
//                int left = longestSubstring(s.substring(0, i), k);
//                int right = longestSubstring(s.substring(i + 1), k);
//                return Math.max(left, right);
//            }
//        }
//
//        // Nếu chạy đến đây, toàn bộ ký tự >= k
//        return s.length();
//    }

}