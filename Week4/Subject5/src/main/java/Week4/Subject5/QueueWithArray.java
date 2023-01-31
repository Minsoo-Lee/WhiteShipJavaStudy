package Week4.Subject5;

public class QueueWithArray {

    private final int[] arr;
    private final int size;
    private int front;
    private int back;

    public QueueWithArray(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        back = 0;
    }

    public void enQueue(int data) {
        if (full())
            throw new IllegalStateException("queue is full. cannot enqueue");
        arr[(front++) % size] = data;
    }

    public int deQueue() {
        if (empty())
            throw new IllegalStateException("queue is empty. cannot dequeue");
        return arr[(back++) % size];
    }

    public boolean full() {
        return front - back == size;
    }

    public boolean empty() {
        return front == back;
    }

    public int size() {
        return front - back;
    }

    public void clearQueue() {
        front = 0;
        back = 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("queue : [");
        int count = back;
        while (count < front) {
            str.append(arr[count % size]);
            if (count < front - 1)
                str.append(" ");
            count++;
        }
        str.append("]");
        return str.toString();
    }
}
