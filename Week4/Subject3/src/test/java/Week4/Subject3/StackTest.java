package Week4.Subject3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StackTest {

    Stack stack = new Stack(3);

    @AfterEach
    public void clearStack() {
        stack.clearStack();
    }

    @Test
    void push() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertThat(stack.getSize()).isEqualTo(3);
    }

    @Test
    void pop() {
        stack.push(100);
        assertThat(stack.pop()).isEqualTo(100);
    }

    @Test
    void 원소_꺼내기() {
        stack.push(1);
        stack.push(2);

        assertThat(stack.top()).isEqualTo(2);
    }

    @Test
    void 비었는지_확인() {
        assertThat(stack.isEmpty()).isEqualTo(true);
    }

    @Test
    void 차있는지_확인() {
        assertThat(stack.isFull()).isEqualTo(false);
    }

    @Test
    void 스택_비우기() {
        System.out.println(stack.getSize());
        stack.clearStack();
        assertThat(stack.getSize()).isEqualTo(0);
    }
}