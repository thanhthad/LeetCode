import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public static void main(String[] args) {
        ListNode test1 = new ListNode(0);
        ListNode current = test1;
        test1.next = new ListNode(1);
        test1.next.next = new ListNode(3);
        test1.next.next.next = new ListNode(4);
        ListNode result1 =  reverse(test1);
        while(result1 != null){
            System.out.println(result1.val);
            result1 = result1.next;
        }
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = slow.next;
        ListNode reverse = reverse(slow);
        ListNode current = head;
        while(reverse != null){
            if(current.val != reverse.val){
                return false;
            }
            reverse = reverse.next;
            current = current.next;
        }
        return true;
    }
//    public static ListNode reverse(ListNode head){
//        ListNode reverse = null;
//        while(head != null){
//            ListNode current_reverse = reverse;
//            ListNode current = head.next;
//            head.next = null;
//            reverse  = head;
//            reverse.next = current_reverse;
//            head = current;
//        }
//        return reverse;
//    }

}