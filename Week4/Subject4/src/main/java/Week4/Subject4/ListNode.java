package Week4.Subject4;

public class ListNode {

    private final int data;
    private ListNode next;

    public int getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int data) {
        this.data = data;
        next = null;
    }

    public static ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if (head == null) {
            head = nodeToAdd;
            return head;
        } else if (position == 0) {
            nodeToAdd.setNext(head);
            return nodeToAdd;
        }

        int count = 1;
        ListNode cur = head;

        while (cur != null) {
            if (count == position) {
                ListNode tmp = cur.getNext();
                cur.setNext(nodeToAdd);
                nodeToAdd.setNext(tmp);
                return head;
            }
            cur = cur.getNext();
            count++;
        }
        throw new IllegalStateException("Position out of Bound");
    }

    public static ListNode remove(ListNode head, int positionToRemove) {
        if (positionToRemove == 0) {
            return head.getNext();
        }

        int count = 1;
        ListNode cur = head.getNext();
        ListNode prev = head;

        while (cur != null) {
            if (count == positionToRemove) {
                ListNode tmp = cur.getNext();
                prev.setNext(tmp);
                cur.setNext(null);
                return head;
            }
            cur = cur.getNext();
            prev = prev.getNext();
            count++;
        }
        throw new IllegalStateException("Position out of Bound");
    }

    public boolean contains(ListNode head, ListNode nodeToCheck) {
        ListNode tmp = head;
        while (tmp != null) {
            if (tmp.getData() == nodeToCheck.getData())
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }
}
