package Week4.Subject5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class QueueWithListNodeTest {

    QueueWithListNode queue = new QueueWithListNode();

    @AfterEach
    public void clear() {
        queue.clearQueue();
    }

    @Test
    void enQueue() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        assertThat(queue.size()).isEqualTo(3);
    }

    @Test
    void deQueue() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        assertThat(queue.deQueue()).isEqualTo(1);
    }

    @Test
    void empty() {
        assertThat(queue.empty()).isEqualTo(true);
    }

    @Test
    void size() {
        assertThat(queue.size()).isEqualTo(0);
    }
}