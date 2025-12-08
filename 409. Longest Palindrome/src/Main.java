import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] count = new int[128];
        count['a'] = 1234234;
        for(int i= 0 ;i < count.length;i++){
            System.out.print(i +" " +  count[i]);
            System.out.println();
        }
        System.out.println(count[(int) 'c']);
    }
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for(char c : s.toCharArray()){
            arr[c]++;
        }
        int longest = 0;
        boolean odd = false;
        for(int i =0 ; i < arr.length; i++){
            if(arr[i] %2 ==0){
                longest += arr[i];
            }
            else if(arr[i] % 2 == 1){
                odd = true;
                longest += arr[i] - 1;
            }
        }
        if(odd) longest ++;
        return longest;
    }
}