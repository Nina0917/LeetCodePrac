package linkedListChapter.chapter02;

import chapter03.ListNode;

//环形链表
public class Demo01 {
    public static boolean hasCycle(ListNode head) {
        //如果是空链表或者链表长度为1，返回
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            System.out.println("slow: "+slow.val);
            System.out.println("quick: "+fast.val);

            //if判断一定要放在移动指针前面，否则长度为3的LinkedList会出现空指针异常
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;

    }

    public static void main(String[] args) {
        /*ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n2;

        System.out.println(hasCycle(n1));*/
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        //n4.next=n2;

        System.out.println(hasCycle(n1));

    }
}
