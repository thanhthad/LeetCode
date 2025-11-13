import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode current1 = head1;
        ListNode current2 = head2;
        Random random = new Random();
        for(int i = 0 ; i < 10 ; i ++){
            int index = 1 + random.nextInt(50);
            int index1 = 1 + random.nextInt(50);
            current1.next = new ListNode(index);
            current2.next = new ListNode(index1);
            current1 = current1.next;
            current2 = current2.next;
        }
        ListNode check = head2;
        ListNode check1 = head1;
        while(check!= null){
            System.out.print(check.val + "-> ");
            check = check.next;
        }
        System.out.println();
        while(check1!= null){
            System.out.print(check1.val + "-> ");
            check1 = check1.next;
        }

        ListNode result = mergeTwoLists(head1,head2);
//        ListNode test = result;
//        while(result!=null){
//            System.out.println(test.val + " -> ");
//            test = test.next;
//        }
    }
    public static class ListNode {
         int val;
          ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Nếu 1 trong 2 list rỗng
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummy = new ListNode(-1); // node giả
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Nối phần còn lại
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next; // bỏ qua node giả đầu
    }

}