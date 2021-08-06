package chapter03;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo05 {
    public static boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();

        // 将链表的值复制到数组中
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        // 使用双指针判断是否回文
        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode n1= new ListNode(1);
        ListNode n2= new ListNode(2);
        ListNode n3= new ListNode(2);
        ListNode n4= new ListNode(4);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;

        System.out.println(isPalindrome(n1));

    }
}
