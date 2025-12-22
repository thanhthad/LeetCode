import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.empty());
    }
}
//class MyQueue {
//    private Stack<Integer> inStack;
//    private Stack<Integer> outStack;
//
//    public MyQueue() {
//        inStack = new Stack<>();
//        outStack = new Stack<>();
//    }
//
//    public void push(int x) {
//        inStack.push(x);
//    }
//
//    public int pop() {
//        if (outStack.isEmpty()) {
//            while (!inStack.isEmpty()) {
//                outStack.push(inStack.pop());
//            }
//        }
//        return outStack.pop();
//    }
//
//    public int peek() {
//        if (outStack.isEmpty()) {
//            while (!inStack.isEmpty()) {
//                outStack.push(inStack.pop());
//            }
//        }
//        return outStack.peek();
//    }
//
//    public boolean empty() {
//        return inStack.isEmpty() && outStack.isEmpty();
//    }
//}

class MyQueue {
    private Stack<Integer> stack;
    private Stack<Integer> reverse;
    public MyQueue() {
        stack = new Stack<>();
        reverse = new Stack<>();
    }

    public void push(int x) {
        int size = stack.size();
        for(int i = 0 ; i < size ; i++){
            reverse.push(stack.pop());
        }
        stack.push(x);
        for(int i = 0; i < size ; i++){
            stack.push(reverse.pop());
        }
    }

    public int pop() {
        return empty() ? 0 : stack.pop();
    }

    public int peek() {
        return empty() ? 0 : stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}