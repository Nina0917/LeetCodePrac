package chapter03;

public class Demo04 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//下面4行是空判断
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            //比较一下，哪个小就把哪个放到新的链表中
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        //然后把那个不为空的链表挂到新的链表中
        curr.next = l1 == null ? l2 : l1;
        return dummy.next;

    }
}
