import java.util.ArrayDeque;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.empty());
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
    }
}
class MyStack {
    Queue<Integer> queue = new ArrayDeque<>();
    public MyStack() {
    }

    public void push(int x) {
        int size =queue.size();
        queue.offer(x);
        for(int i =0 ; i < size ; i ++){
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}