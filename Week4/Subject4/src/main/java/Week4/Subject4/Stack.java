package Week4.Subject4;

public class Stack {

    private final ListNode head = new ListNode(0);

    public void push(int data) {
        ListNode.add(head, new ListNode(data), size() + 1);
    }

    public int pop() {
        if (head.getNext() == null)
            throw new IllegalStateException("stack is empty. cannot pop");
        ListNode cur = head.getNext();
        ListNode prev = head;

        while (cur != null) {
            cur = cur.getNext();
            prev = prev.getNext();
        }

        int result = prev.getData();
        prev = null;
        return result;
    }

    // 테스트용
    public int top() {
        ListNode tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        return tmp.getData();
    }

    public boolean empty() {
        return head.getNext() == null;
    }

    public int size() {
        ListNode tmp = head.getNext();
        int size = 0;

        while (tmp != null) {
            tmp = tmp.getNext();
            size++;
        }
        return size;
    }

    public void clearStack() {
        head.setNext(null);
    }
}
