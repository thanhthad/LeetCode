//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int check = lengthOfLongestSubstring("au");
        System.out.println(check);

    }
//    public static int lengthOfLongestSubstring(String s) {
//        int lenght = s.length();
//        if (lenght <= 1) return 1;
//        int count = 1;
//        int longest = 1;
//        int index = 0 ;
//        int max = index + 1;
//        System.out.println(lenght);
//        while(longest <= (lenght-index)){
//            System.out.println("==> START vòng ngoài: index = " + index + ", max = " + max);
//            boolean out_whileloop_inside = true;
//            while (true) {
//                System.out.println("  -> Vòng trong: index = " + index + ", max = " + max);
//                for (int i = index; i < max; i++) {
//                    System.out.println("    So sánh " + s.charAt(i) + " và " + s.charAt(max));
//                    if (s.charAt(i) == s.charAt(max)) {
//                        out_whileloop_inside = false;
//                        System.out.println("    ⚠️ Trùng ký tự " + s.charAt(max));
//                        break;
//                    }
//                }
//                if (out_whileloop_inside == false) {
//                    break;
//                }
//                count += 1;
//                System.out.println("count " + count);
//                max += 1;
//            }
//            if(longest < count){
//                longest = count;
//            }
//            index = max;
//            max = index  + 1;
//            count = 1;
//        }
//        return longest;
//    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;
        if (n == 1) return 1;

        int longest = 0; // lưu độ dài chuỗi con dài nhất
        int start = 0;   // bắt đầu window
        int end = 0;     // kết thúc window

        while (end < n) {

            // kiểm tra ký tự s[end] đã xuất hiện trong window start -> end-1 chưa
            for (int i = start; i < end; i++) {
                if (s.charAt(i) == s.charAt(end)) {
                    // nếu trùng, dịch start lên vị trí sau ký tự trùng
                    start = i + 1;
                    break;
                }
            }

            // cập nhật độ dài hiện tại
            int currentLength = end - start + 1;
            if (currentLength > longest) {
                longest = currentLength;
            }

            // tăng end để mở rộng window
            end++;
        }

        return longest;
    }
}