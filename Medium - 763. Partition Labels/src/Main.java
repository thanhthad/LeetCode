import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();

        int[] chars = new int[128];
        Arrays.fill(chars, -1);
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)] = i;
        }

        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            right = Math.max(right, chars[s.charAt(i)]);
            if (i == right) {
                result.add(right - left + 1);
                left = i + 1;
            }
        }
        return result;
    }
}