import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        String string = "palkjlfkklooabg";
        System.out.println(convert(string,4));
    }

//    public static String convert(String s, int numRows) {
//        int length = s.length();
//        if(numRows == 1 ) return s;
//        List<List<Character>> list = new ArrayList<>();
//        if(numRows >= 2 ){
//            for (int i = 0 ; i < numRows ; i++){
//                list.add(new ArrayList<>());
//            }
//        }
//        if(numRows ==2){
//            String value = "";
//            for (int i = 0 ; i < length ; i ++){
//                if(i%2 == 0){
//                    list.get(0).add(s.charAt(i));
//                }
//                else list.get(1).add(s.charAt(i));
//            }
//            for(int i = 0 ;i< list.get(0).size() ; i++){
//                value += list.get(0).get(i);
//            }
//            for(int i = 0 ; i < list.get(1).size() ; i++){
//                value += list.get(1).get(i);
//            }
//            return value;
//        }
//
//        int check1 = 1;
//        int check2 = numRows -1;
//        boolean check = false;
//        for(int i = 0 ; i < length ; i ++){
//            System.out.println("Check1: " + check1);
//            System.out.println("Index: " + s.charAt(check1 - 1 ));
//            if(check1 == numRows + 1){
//                System.out.println("Inner check 2: " + check2);
//                if(check2 == 2 ){
//                    list.get(check2-1).add(s.charAt(i));
//                    check1 = 1;
//                    check2 = numRows -1;
//                    continue;
//                }
//                list.get(check2-1).add(s.charAt(i));
//                check2 -= 1;
//                continue;
//            }
//            list.get(check1 -1).add(s.charAt(i));
//            check1 ++;
//        }
//        String string = "";
//        for (int i = 0 ; i < list.size(); i++){
//            for (int j = 0 ; j < list.get(i).size() ; j ++){
//                string += list.get(i).get(j);
//            }
//        }
//        return string;
//    }
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        // Tạo list chứa từng hàng
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int curRow = 0;          // bắt đầu ở hàng đầu tiên
        boolean goingDown = false; // hướng di chuyển

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            // Đổi hướng khi chạm đỉnh hoặc đáy
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }
            // Di chuyển row
            curRow += goingDown ? 1 : -1;
        }

        // Ghép tất cả các hàng lại
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}