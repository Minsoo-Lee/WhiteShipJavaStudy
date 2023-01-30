package Week4.Subject4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack = new Stack();

    @AfterEach
    public void clear() {
        stack.clearStack();
    }

    @Test
    void push() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertThat(stack.size()).isEqualTo(3);
    }

    @Test
    void pop() {
        stack.push(1);
        stack.push(2);

        assertThat(stack.pop()).isEqualTo(2);
    }

    @Test
    void top() {
        stack.push(1);
        stack.push(2);

        assertThat(stack.top()).isEqualTo(2);
    }

    @Test
    void empty() {
        assertThat(stack.empty()).isEqualTo(true);
    }

    @Test
    void size() {
        assertThat(stack.size()).isEqualTo(0);
    }

    @Test
    public void clearStack() {
        stack.push(1);
        stack.push(2);
        stack.clearStack();

        assertThat(stack.empty()).isEqualTo(true);
    }
}