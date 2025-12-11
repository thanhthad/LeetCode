import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA, currentB = headB;
        int lengthA = 0 , lengthB = 0;
        while(currentA != null){
            lengthA ++;
            currentA = currentA.next;
        }
        while(currentB !=null){
            lengthB ++;
            currentB = currentB.next;
        }
        currentA = headA;
        currentB = headB;
        if(lengthA - lengthB > 0){
            for(int i= 0; i < lengthA - lengthB ; i++){
                currentA = currentA.next;
            }
        }else if(lengthA - lengthB < 0 ){
            for(int i = 0 ;i < lengthB - lengthA ; i++){
                currentB = currentB.next;
            }
        }
        while(currentA != null){
            if(currentB == currentA){
                return currentB;
            }
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;
    }

//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Set<ListNode> saved = new HashSet<>();
//        ListNode currentA = headA;
//        while(currentA != null){
//            saved.add(currentA);
//            currentA = currentA.next;
//        }
//        ListNode currentB = headB;
//        while(currentB !=null){
//            if(saved.contains(currentB)){
//                return currentB;
//            } currentB = currentB.next;
//        }
//        return null;
//    }

//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode currentA = headA;
//        while(currentA != null){
//            ListNode currentB = headB;
//            while(currentB != null){
//                if(currentA == currentB){
//                    return currentA;
//                }
//                currentB = currentB.next;
//            }
//            currentA = currentA.next;
//        }
//        return null;
//    }

}