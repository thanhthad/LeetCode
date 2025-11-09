//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int check = lengthOfLongestSubstring("pwwkew");
        System.out.println(check);

    }
    public static int lengthOfLongestSubstring(String s) {
        int lenght = s.length();
        if (lenght <= 1) return 1;
        int count = 1;
        int longest = 1;
        int index = 0 ;
        int max = index + 1;
        System.out.println(lenght);
        while(longest <= (lenght-max)){
            System.out.println("==> START vòng ngoài: index = " + index + ", max = " + max);
            boolean out_whileloop_inside = true;
            while (true) {
                System.out.println("  -> Vòng trong: index = " + index + ", max = " + max);
                for (int i = index; i < max; i++) {
                    System.out.println("    So sánh " + s.charAt(i) + " và " + s.charAt(max));
                    if (s.charAt(i) == s.charAt(max)) {
                        out_whileloop_inside = false;
                        System.out.println("    ⚠️ Trùng ký tự " + s.charAt(max));
                        break;
                    }
                }
                if (out_whileloop_inside == false) {
                    break;
                }
                count += 1;
                System.out.println("count " + count);
                max += 1;
            }
            if(longest < count){
                longest = count;
            }
            index = max;
            max = index  + 1;
            count = 1;
            System.out.println("==> Kết thúc vòng ngoài: longest = " + longest + ", count = " + count);
            System.out.println("longest" + longest);
            System.out.println("length - max: " + (lenght-max));
        }
        return longest;
    }
}