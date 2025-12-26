//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static int findLUSlength(String[] strs) {
        int length = strs.length;
        int result = -1;
        for(int i =0 ; i < length; i++){
            boolean uncommon = true;
            for(int j = 0 ; j < length ; j++){
                if(j == i ) continue;
                if(isSubsequence(strs[i],strs[j])){
                    uncommon = false;
                    break;
                }
            }
            if(uncommon){
                result = Math.max(strs[i].length(),result);
            }
        }
        return  result;
    }
    static boolean isSubsequence(String a, String b){
        int i = 0 , j = 0;
        while(i< a.length() && j < b.length()){
            if(a.charAt(i) == b.charAt(j)){
                i++;
            }
            j++;
        }
        return i == a.length();
    }
}