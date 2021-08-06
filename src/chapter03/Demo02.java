package chapter03;

public class Demo02 {
    public ListNode1 removeNthFromEnd(ListNode1 head, int n) {
        ListNode1 pre = head;
        int last = length(head) - n;
        //如果last等于0表示删除的是头结点
        if (last == 0)
            return head.next;
        //这里首先要找到要删除链表的前一个结点
        for (int i = 0; i < last - 1; i++) {
            pre = pre.next;
        }
        //然后让前一个结点的next指向要删除节点的next
        pre.next = pre.next.next;
        return head;
    }

    private int length(ListNode1 head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
