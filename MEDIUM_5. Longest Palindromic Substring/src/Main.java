//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String string = longestPalindrome("he");
        System.out.println(string);


    }

    public static String longestPalindrome(String s) {
        int length = s.length();
        int max = 1;
        int min = 0;
        String longest = "";
        if (length <= 1) return s; // chỉ 1 ký tự -> chính nó là palindrome
        if (length == 2) return s.charAt(0) == s.charAt(1) ? s : s.substring(0, 1);
        if (length == 3) {
            if (check(s)) return s; // ví dụ "aba"
            if (s.charAt(0) == s.charAt(1)) return s.substring(0, 2);
            if (s.charAt(1) == s.charAt(2)) return s.substring(1, 3);
            return s.substring(0, 1);
        }

        for ( int j = 1 ; j < 3 ; j++){
            max = j;
            for(int i = 0 ;  i < length; i++){
                if(check(s.substring(min,max + 1))){
                    String  check = larger_twosides(min , max + 1 ,s);
                    if(check.length() > longest.length()) longest = check ;
                }
                min +=1;
                max +=1;
                if(max + 1 > length){
                    break;
                }
            }
            min = 0;
        }
        return longest;
    }

    public static boolean check(String s ){
        int length = s.length();
        for(int i = 0 ; i < length/ 2 ; i++){
            if(s.charAt(0) == s.charAt(length-1-i)){
                continue;
            }
            return false;
        }
        return true;
    }

    public static String larger_twosides (int min , int max , String s){
        int count;
        String longest = s.substring(min,max);
        int length = s.length();
        while(true){
            if(min ==0 ) return longest;
            if(max == length) return longest;
            min -=1;
            max +=1;
            if(check(s.substring(min,max))){
                longest = s.substring(min,max);
            }else {
                return longest;
            }
        }
    }
}