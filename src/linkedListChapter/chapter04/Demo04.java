package linkedListChapter.chapter04;

import java.util.HashMap;

//复制带随机指针的链表
//给你一个长度为 n 的链表，每个节点包含一个额外增加的随机指针 random ，该指针可以指向链表中的任何节点或空节点
class Node2 {
    int val;
    Node2 next;
    Node2 random;

    public Node2(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class Demo04 {
    public Node2 copyRandomList(Node2 head) {
        if (head==null)
            return null;
        HashMap<Node2,Node2> map = new HashMap<>();
        //第一遍遍历，把每一个node复制成新node，添加到map里
        Node2 cur =head;
        while (cur!=null){
            Node2 n= new Node2(cur.val);
            map.put(cur,n);
            cur=cur.next;
        }
        //第二遍遍历，把next和random的指针加进去
        cur=head;
        while (cur!=null){
            //next
            map.get(cur).next=map.get(cur.next);
            //random
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);
    }
}
