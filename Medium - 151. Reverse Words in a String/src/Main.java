//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0 ; i--){
            sb.append(words[i]);
            if(i != 0 ) sb.append(" ");
        }
        return sb.toString();
    }
}