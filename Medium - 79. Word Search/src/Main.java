//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    }
    int m ,n;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        for(int i = 0 ; i< m;i ++){
            for(int j = 0 ; j < n ; j++){
                if(check(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean check(char[][] board,String word,int row, int cell,int index){
        if(index == word.length()) return true;
        if(row < 0 || cell < 0 || row >= m || cell >= n) return false;
        if(board[row][cell] != word.charAt(index)) return false;
        char temp = board[row][cell];
        board[row][cell] = '#';
        boolean result = check(board,word,row-1,cell,index+1) ||
                check(board,word,row,cell-1,index+1) ||
                check(board,word,row + 1 , cell , index +1) ||
                check(board,word,row,cell + 1,index + 1);

        board[row][cell] = temp;
        return result;
    }
}