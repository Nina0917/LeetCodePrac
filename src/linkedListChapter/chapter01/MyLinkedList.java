package linkedListChapter.chapter01;

public class MyLinkedList {
    int size;
    SinglyListNode head;
    public MyLinkedList() {
        size=0;
        head = new SinglyListNode(0);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        SinglyListNode pred = head;
        for (int i = 0; i < index+1; i++) {
            pred=pred.next;
        }
        return pred.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        // If index is greater than the length,
        // the node will not be inserted.
        if (index > size) return;

        // [so weird] If index is negative,
        // the node will be inserted at the head of the list.
        if (index < 0) index = 0;

        ++size;
        // find predecessor of the node to be added
        SinglyListNode pred = head;
        for(int i = 0; i < index; ++i) pred = pred.next;

        // node to be added
        SinglyListNode toAdd = new SinglyListNode(val);

        // insertion itself
        toAdd.next = pred.next;
        pred.next = toAdd;

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        SinglyListNode pred=head;
        for (int i = 0; i < index; i++) {
            pred=pred.next;
        }
        SinglyListNode node = pred.next.next;
        pred.next=node;
    }
}
