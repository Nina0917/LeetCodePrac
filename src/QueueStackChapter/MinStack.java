package QueueStackChapter;

public class MinStack {
    class Node{
        int value;
        Node next;
        int min;

        public Node(int value,Node next, int min){
            this.value=value;
            this.next=next;
            this.min=min;
        }
    }
    //成员变量
    Node head;
    public MinStack() {
        head=null;
    }

    public void push(int val) {

        if (head==null){
            head = new Node(val,null,val);
        }else {
            int min = val<head.min?val:head.min;
            Node n = new Node(val,head,min);
            head=n;
        }
    }

    public void pop() {
        if (head==null)
            return;
        head=head.next;
    }

    public int top() {
        if (head==null)
            throw new IllegalStateException("stack is empty");
        return head.value;
    }

    public int getMin() {
        if (head==null)
            throw new IllegalStateException("stack is empty");
        return head.min;
    }


}
