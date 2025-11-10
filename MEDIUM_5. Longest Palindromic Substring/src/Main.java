//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String string = "hhhehhllo";

        int length = string.length();
        int max;
        int min = 0;
        int longest = 0 ;
        for ( int j = 1 ; j < 3 ; j++){
            max = j;
            for(int i = 0 ;  i < length; i++){
                System.out.println("Min and Max : " + min + " " + max);
                if(check(string.substring(min,max + 1))){
                    System.out.println("Đã kiểm tra: " + string.substring(min,max + 1));
                    int check = larger_twosides(min , max + 1 ,string);
                    if(check > longest) longest = check ;
                }
                min +=1;
                max +=1;
                if(max + 1 > length){
                    break;
                }
            }
            min = 0;
        }
        System.out.println("Longest: " + longest);
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

    public static int larger_twosides (int min , int max , String s){
        int count;
        int longest = max -min;
        int length = s.length();
        while(true){
            if(min ==0 ) return longest;
            if(max == length) return longest;
            min -=1;
            max +=1;
            if(check(s.substring(min,max))){
                longest = max - min;
            }else {
                return longest;
            }
        }
    }
}