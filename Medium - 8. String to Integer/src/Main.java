//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println('%' - '0' );
    }
    public static int myAtoi(String s) {
        String strim = s.stripLeading();
        if (strim.isEmpty()) return 0;

        boolean positive = true;
        char[] lists = strim.toCharArray();
        char c = strim.charAt(0);
        int index = 0;

        if (c == '+' || c == '-') {
            positive = (c == '+');
            index++;
        } else if (!Character.isDigit(c)) {
            return 0;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = index; i < lists.length; i++) {
            if (!Character.isDigit(lists[i])) break;
            stringBuilder.append(lists[i]);
        }

        if (stringBuilder.length() == 0) return 0;

        long num = Long.parseLong(stringBuilder.toString());
        if (!positive) num = -num;
        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) num;
    }

}