package linkedListChapter.chapter02;

import chapter03.ListNode;

import java.util.HashSet;
import java.util.Set;

//相交链表
//给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
public class Demo03 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp=headA;
        while (temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while (temp!=null){
            if (set.contains(temp)){
                return temp;
            }
            temp=temp.next;

        }
        return null;
    }
}
