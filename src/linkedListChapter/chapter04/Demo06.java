package linkedListChapter.chapter04;

import chapter03.ListNode;

//旋转链表
//给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
public class Demo06 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        // 链表长度n
        int n = 1;
        ListNode curr = head;
        while (curr.next != null) {
            n++;
            curr = curr.next;
        }
        // 链表尾节点连接头节点，闭合成环
        curr.next = head;
        // n - k % n是新链表头节点的索引
        // n - k % n - 1是新链表尾节点的索引
        for (int i = 0; i < n - k % n - 1; i++) {
            head = head.next;
        }
        ListNode newHead = head.next;
        // 断开环
        head.next = null;
        return newHead;

    }
}
