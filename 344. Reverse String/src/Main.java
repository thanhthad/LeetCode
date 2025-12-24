//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public void reverseString(char[] s) {
        int left = 0 ;
        int right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
    }

//    public void reverseString(char[] s) {
//        for(int i = 0 ; i< s.length/2 ; i++){
//            char temp = s[i];
//            s[i] = s[s.length-i-1];
//            s[s.length-i-1] = temp;
//        }
//    }
}