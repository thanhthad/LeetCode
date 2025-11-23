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

    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(0);
        ListNode largeDummy = new ListNode(0);

        ListNode small = smallDummy;
        ListNode large = largeDummy;

        while (head != null) {
            if (head.val < x) {
                small.next = new ListNode(head.val);
                small = small.next;
            } else {
                large.next = new ListNode(head.val);
                large = large.next;
            }
            head = head.next;
        }

        small.next = largeDummy.next;
        large.next = null;

        return smallDummy.next;
    }
//    public ListNode partition(ListNode head, int x) {
//        ListNode smallDummy = new ListNode(0);
//        ListNode largeDummy = new ListNode(0);
//
//        ListNode small = smallDummy;
//        ListNode large = largeDummy;
//
//        while (head != null) {
//            if (head.val < x) {
//                small.next = head;   // dùng lại node gốc
//                small = small.next;
//            } else {
//                large.next = head;   // dùng lại node gốc
//                large = large.next;
//            }
//            head = head.next;
//        }
//
//        large.next = null;            // tránh tạo vòng lặp
//        small.next = largeDummy.next; // nối 2 list
//
//        return smallDummy.next;
//    }

}