import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static int nextGreaterElement(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        int right = chars.length - 2;

        while(right >= 0 && chars[right] >= chars[right+1]){
            right--;
        }
        if(right == -1) return -1;

        int index_min = right + 1;
        for(int i = right + 1; i < chars.length; i++){
            if(chars[i] > chars[right] && chars[i] <= chars[index_min]){
                index_min = i;
            }
        }

        char temp = chars[right];
        chars[right] = chars[index_min];
        chars[index_min] = temp;

        int i = right + 1, j = chars.length - 1;
        while(i < j){
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }

        long result = Long.parseLong(new String(chars));
        if(result > Integer.MAX_VALUE) return -1;
        return (int)result;
    }
}