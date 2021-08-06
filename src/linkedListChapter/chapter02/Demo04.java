package linkedListChapter.chapter02;

import chapter03.ListNode;

//删除链表的倒数第N个节点
//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
public class Demo04 {
    //遍历两遍
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 计算链表长度
        int size = 0;
        ListNode tmp = head;
        while(tmp != null){
            size++;
            tmp = tmp.next;
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next=head;

        tmp = dummyNode;
        int index = 0;
        while(index < size - n){
            tmp = tmp.next;
            index++;
        }
        tmp.next = tmp.next.next;
        return dummyNode.next;
    }
}
