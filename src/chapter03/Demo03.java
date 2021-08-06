package chapter03;

import java.util.Stack;

public class Demo03 {
    public ListNode reverseList(ListNode head) {
        //用栈，栈是先进后出
        Stack<ListNode> stack = new Stack<>();
        //把链表节点全部放入栈中
        while (head!=null){
            stack.push(head);
            head=head.next;
        }
        if (stack.isEmpty())
            return null;
        ListNode node = stack.pop();
        ListNode dummy = node;
        //栈中的节点全部出栈，连成一个新的链表
        while (!stack.isEmpty()){
            ListNode tempNode = stack.pop();
            node.next=tempNode;
            node=node.next;
        }
        //最后一个结点就是反转前的头结点，一定要让他的next
        //等于空，否则会构成环
        node.next=null;
        return dummy;
    }
}
