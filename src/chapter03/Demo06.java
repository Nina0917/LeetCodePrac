package chapter03;

public class Demo06 {
    public static boolean hasCycle(ListNode head) {
        if (head==null)
            return false;
        //快慢两个指针
        ListNode slow = head;
        ListNode fast = head;
        //fast.next!=null确保了fast.next.next不会出现空指针异常
        while (fast!=null && fast.next!=null){
            //每次慢指针走一步
            slow=slow.next;
            //快指针走两步
            fast=fast.next.next;
            //如果相遇，说明有环，直接返回true
            if (slow==fast)
                return true;
        }
        //否则就是没环
        return false;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        //System.out.println();
        System.out.println(n1.next);
        System.out.println(n1.next.next);
    }
}
