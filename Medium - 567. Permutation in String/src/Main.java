import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] array1 = new int[26];
        Arrays.fill(array1,0);
        int[] array2 = new int[26];
        Arrays.fill(array2,0);
        for(char c : s1.toCharArray()){
            array1[c - 'a']++;
        }
        int window = s1.length();
        for(int i =0 ; i < s2.length() ; i++){
            array2[s2.charAt(i)-'a']++;
            if(i>=window){
                array2[s2.charAt(i-window)-'a']--;
            }
            if(Arrays.equals(array1,array2)){
                return true;
            }
        }
        return false;
    }
}