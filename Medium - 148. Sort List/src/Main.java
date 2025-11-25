import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

//    public ListNode sortList(ListNode head) {
//        ListNode current = head;
//        int length = 0;
//        while(current != null){
//            length ++;
//            current = current.next;
//        }
//        int[] sortList = new int[length];
//        current = head;
//        for(int i =0 ; i < length ; i ++){
//            sortList[i] = current.val;
//            current = current.next;
//        }
//        Arrays.sort(sortList);
//        ListNode result = new ListNode(0);
//        current = result;
//        for(int i = 0 ; i < length ; i ++){
//            current.next = new ListNode(sortList[i]);
//            current = current.next;
//        }
//        current.next = null;
//        return result.next;
//    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        for (int size = 1; size < length; size <<= 1) {
            ListNode cur = dummy.next;
            ListNode tail = dummy;

            while (cur != null) {
                ListNode left = cur;

                ListNode right = split(left, size);

                cur = split(right, size);

                tail.next = merge(left, right);

                while (tail.next != null) tail = tail.next;
            }
        }

        return dummy.next;
    }

    private ListNode split(ListNode head, int size) {
        if (head == null) return null;
        for (int i = 1; head.next != null && i < size; i++) {
            head = head.next;
        }
        ListNode next = head.next;
        head.next = null;
        return next;
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;

        return dummy.next;
    }
}