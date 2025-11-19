import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ListNode listnode = new ListNode(0);
        System.out.println("ListNode 0:" + listnode.val);
        ListNode current = listnode;
        for(int i = 0 ; i < 10; i++){
            current.next = new ListNode(random.nextInt(1,100));
            current = current.next;
            System.out.println("ListNode "+ (i + 1) +": " + current.val);
        }
        System.out.println("-----------------------------------");
        ListNode result = removeNthFromEnd(listnode,1);
        System.out.println("Node 1: " + result.val);
        while(result.next != null){
            result = result.next;
            System.out.println("Result: " + result.val);
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode current = head;
        while(current.next != null){
            count ++;
            current = current.next;
        }
        ListNode result = new ListNode(0);
        result.next = head;
        current = result;
        for(int i= 0 ; i < count - n ; i ++){
            current = current.next;
        }
        current.next = current.next.next;
        return  result.next;
    }

//    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//
//        ListNode fast = dummy;
//        ListNode slow = dummy;
//
//        for (int i = 0; i < n + 1; i++) {
//            fast = fast.next;
//        }
//
//        while (fast != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;
//
//        return dummy.next;
//    }


    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val , ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}