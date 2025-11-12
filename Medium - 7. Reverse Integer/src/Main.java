//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(123456789));
    }
//    public static int reverse(int x) {
//        int rev = 0;
//
//        while (x != 0) {
//            int digit = x % 10;
//            x = x / 10;
//
//            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
//            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
//
//            rev = rev * 10 + digit;
//        }
//
//        return rev;
//    }
public static int  reverse(int x) {
    int flag = 1;
    if(x < 0) {
        flag = -1;
    }
    long n = Math.abs(x);
    long ans = 0;

    while(n > 0) {
        long rem = n % 10;
        ans = ans * 10 + rem;
        n = n / 10;
    }

    if(ans > Integer.MAX_VALUE) {
        return 0;
    }

    return flag * (int)ans;

}
}