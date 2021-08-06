package linkedListChapter.chapter04;

import chapter03.ListNode;

//两数相加
//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字
public class Demo01 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n1=0,sum1=0;
        while (l1!=null){
            sum1+=Math.pow(10,n1)*l1.val;
            l1=l1.next;
            n1++;
        }
        int n2=0,sum2=0;
        while (l2!=null){
            sum2+=Math.pow(10,n2)*l2.val;
            l2=l2.next;
            n2++;
        }
        System.out.println("sum1: "+ sum1);
        System.out.println("sum2: "+sum2);
        int sum=sum1+sum2;

        ListNode dummy=new ListNode(0);
        if (sum==0){
            return dummy;
        }
        ListNode head=dummy;
        int reminder=0;
        while (sum!=0){
            System.out.println(sum);
            reminder=sum%10;
            System.out.println("reminder: "+reminder);
            sum/=10;
            head.next=new ListNode(reminder);
            head=head.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        //[9]
        //[1,9,9]
        ListNode l1 = new ListNode(9);
        /*ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        l1.next=n2;
        n2.next=n3;*/

        ListNode l2 = new ListNode(1);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(9);
        ListNode n7 = new ListNode(9);
        ListNode n8 = new ListNode(9);
        ListNode n9 = new ListNode(9);
        ListNode n10 = new ListNode(9);
        ListNode n11= new ListNode(9);
        ListNode n12 = new ListNode(9);
        l2.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=n9;
        n9.next=n10;
        n10.next=n11;
        n11.next=n12;

        ListNode node = addTwoNumbers(l1, l2);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }

    }
}
