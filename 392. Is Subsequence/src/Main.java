//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","dahbgd"));
    }
    public static boolean isSubsequence(String s, String t) {
        int left = 0;
        int right  = 0;
        while(left < s.length() && right < t.length()){
            if(s.charAt(left) == t.charAt(right)){
                left ++;
            }
            right ++;
        }
        return left == s.length();
    }
}