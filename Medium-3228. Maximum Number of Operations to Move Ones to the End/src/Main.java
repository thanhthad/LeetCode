//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        maxOperations("10010");
    }
    public static int maxOperations(String s) {
        int countOne = 0;
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '0') {
                while (i + 1 < s.length() && s.charAt(i + 1) == '0') {
                    i++;
                }
                ans += countOne;
            } else {
                countOne++;
            }
            i++;
        }
        return ans;
    }

    public static boolean check(String string){
        int index = -1;
        for (int i = 0 ; i < string.length(); i++){
            if(string.charAt(i) == '1'){
                if(index == -1) {
                    index = i; // lưu vị trí '1' đầu tiên
                }
            } else { // charAt(i) == '0'
                if(index != -1 && i > index){
                    // '0' nằm sau '1' đầu tiên → sai
                    return false;
                }
            }
        }
        return true;
    }

}