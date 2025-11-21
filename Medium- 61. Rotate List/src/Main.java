import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ListNode head = new ListNode(0);
        ListNode current = head;
        for(int i = 0; i < random.nextInt(4,20) ;i++){
            current.next = new ListNode(random.nextInt(-10,10));
            current = current.next;
            System.out.print(current.val + " ");
        }
        System.out.println();
        ListNode result = rotateRight(head.next,6);
        while(result.next  != null){
            System.out.print(result.val + "");
        }
    }
//    public static ListNode rotateRight(ListNode head, int k) {
//        int lenght = 1;
//        ListNode current = head;
//        while(current.next != null){
//            current = current.next;
//            lenght ++;
//        }
//        int check = -1;
//        if(k >= lenght){
//            check = k % lenght;
//            if(check != -1){
//                k = check;
//            }
//            if(check == 0){
//                return head;
//            }
//        }
//        int index = lenght - k;
//        ListNode dummy = head;
//        current = dummy;
//        for(int i =0 ; i < index -1 ; i++){
//            current = current.next;
//        }
//        ListNode result = new ListNode(0);
//        ListNode current_result = result;
//        for(int i = 0 ; i< k ; i++){
//            current_result.next = dummy.next;
//            current_result = current_result.next;
//        }
//        current_result.next = dummy;
//
//        return result;
//    }
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;
        if (k == 0) return head;

        tail.next = head;

        int stepsToNewHead = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}