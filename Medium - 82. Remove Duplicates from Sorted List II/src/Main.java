//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head ==null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;
        while(current != null){
            boolean duplicate = false;
            while(current.next != null && current.val == current.next.val){
                current = current.next;
                duplicate = true;
            }
            if(duplicate){
                prev.next= current.next;
            }else{
                prev = prev.next;
            }
            current = current.next;
        }
        return dummy.next;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}