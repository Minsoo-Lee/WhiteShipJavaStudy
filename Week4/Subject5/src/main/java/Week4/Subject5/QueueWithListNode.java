package Week4.Subject5;

public class QueueWithListNode {

    private final ListNode head = new ListNode(0);
    private int size = 0;

    public void enQueue(int data) {
        ListNode.add(head, new ListNode(data), ++size);
    }

    public int deQueue() {
        if (empty())
            throw new IllegalStateException("queue is empty. cannot dequeue");
        int data = head.getNext().getData();
        ListNode.remove(head, 1);
        return data;
    }

    public boolean empty() {
        return head.getNext() == null;
    }

    public int size() {
        ListNode tmp = head.getNext();
        int count = 0;

        while (tmp != null) {
            tmp = tmp.getNext();
            count++;
        }
        return count;
    }

    public void clearQueue() {
        head.setNext(null);
    }
}
