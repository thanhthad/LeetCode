import java.util.ArrayList;
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
    public static ListNode toLinkedList(List<Integer> list){
        if(list.isEmpty() || list == null) return null;
        ListNode head = new ListNode(list.get(0));
        ListNode current = head;
        for (int i= 1;i< list.size();i++){
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return head;
    }

    public static void printList(ListNode node){
        List<Integer> result = new ArrayList<>();
        while (node != null){
            result.add(node.val);
            node = node.next;
        }
        System.out.println(result);
    }

    public static ListNode sum(ListNode l1 , ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Sau khi ra khỏi vòng lặp, nếu còn dư carry
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Kết quả bắt đầu từ dummyHead.next
        return dummyHead.next;

    }

    public static void main(String[] args) {
        List<Integer> l1 = List.of(2,4,5);
        List<Integer> l2 = List.of(5,6,4);
        System.out.println(l1);
        System.out.println(l2);
        ListNode listNode1 = toLinkedList(l1);
        ListNode listNode2 = toLinkedList(l2);
        printList(listNode1);
        printList(listNode2);
    }

}