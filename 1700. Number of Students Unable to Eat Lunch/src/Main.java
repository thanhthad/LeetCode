import java.util.ArrayDeque;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new ArrayDeque<>();
        for(int student : students){
            q.offer(student);
        }
        int i = 0 ;
        int fail = 0;

        while (!q.isEmpty() && fail < q.size()) {
            if (q.peek() == sandwiches[i]) {
                q.poll();
                i++;
                fail = 0;
            } else {
                q.offer(q.poll());
                fail++;
            }
        }
        return q.size();
    }
}