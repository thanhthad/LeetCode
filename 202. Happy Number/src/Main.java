import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(102 % 10);
    }
//    public static boolean isHappy(int n) {
//        Set<Integer> seen = new HashSet<>();
//
//        while (n != 1) {
//            if (seen.contains(n)) {
//                return false; // vòng lặp
//            }
//            seen.add(n);
//
//            int sum = 0;
//            int temp = n;
//            while (temp > 0) {
//                int digit = temp % 10;
//                sum += digit * digit;
//                temp /= 10;
//            }
//            n = sum;
//        }
//
//        return true;
//    }
    private static int sumSquareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = sumSquareDigits(n);

        while (fast != 1 && slow != fast) {
            slow = sumSquareDigits(slow);
            fast = sumSquareDigits(sumSquareDigits(fast));
        }

        return fast == 1;
    }
}