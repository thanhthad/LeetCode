//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String a  = "race a car";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome("     "));
    }
    public static boolean isPalindrome(String s) {
        int left = 0 ;
        int right = s.length() -1 ;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            while(right > left && !Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}