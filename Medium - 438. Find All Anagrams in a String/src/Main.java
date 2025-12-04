import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()) return  new ArrayList<>();
        int[] arrayP = new int[26];
        int[] arrayS = new int[26];
        Arrays.fill(arrayS,0);
        Arrays.fill(arrayP,0);
        for(char a : p.toCharArray()){
            arrayS[a - 'a']++;
        }
        List<Integer> result = new ArrayList();
        int window = p .length();
        for(int i = 0; i < s.length() ; i++){
            arrayP[s.charAt(i) - 'a']++;

            if(i >= window){
                arrayP[s.charAt(i - window) - 'a']--;
            }
            if(i >= window - 1){
                if (Arrays.equals(arrayP, arrayS)) {
                    result.add(i - window + 1);
                }
            }
        }
        return result;
    }
}