package Week4.Subject3;

public class Stack {

    private final int[] arr;
    private int index;
    private final int size;

    public Stack(int size) {
        this.size = size;
        arr = new int[this.size];
        index = -1;
    }

    public void push(int data) {
        if (isFull())
            throw new IllegalStateException("stack is full. cannot push more");
        arr[++index] = data;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException("stack is empty. cannot pop");
        return arr[index--];
    }

    // 테스트용
    public int top() {
        if (isEmpty())
            throw new IllegalStateException("stack is empty. cannot extract top element");
        return arr[index];
    }
    public boolean isEmpty() {
        return index == -1;
    }

    public boolean isFull() {
        return index == size - 1;
    }

    public void clearStack() {
        index = -1;
    }

    public int getSize() {
        return index + 1;
    }
}
