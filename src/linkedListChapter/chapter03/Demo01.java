package linkedListChapter.chapter03;

import chapter03.ListNode;

import java.util.Stack;

//反转链表
//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
public class Demo01 {
    public ListNode reverseList(ListNode head) {
        Stack s = new Stack();
        s.push(null);
        ListNode temp=head;
        while (temp!=null){
            s.push(temp);
            temp=temp.next;
        }
        ListNode dummy= (ListNode)s.pop();
        temp=dummy;
        while (temp!=null){
            temp.next=(ListNode)s.pop();
            temp=temp.next;
        }
        return dummy;

    }
}
