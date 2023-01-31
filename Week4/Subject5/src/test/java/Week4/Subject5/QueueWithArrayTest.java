package Week4.Subject5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class QueueWithArrayTest {

    QueueWithArray queue = new QueueWithArray(5);

    @AfterEach
    public void clear() {
        queue.clearQueue();
    }

    @Test
    void enQueue() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        assertThat(queue.toString()).isEqualTo("queue : [1 2 3 4 5]");
    }

    @Test
    void deQueue() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);

        assertThat(queue.toString()).isEqualTo("queue : [3 4 5 6 7]");
    }

    @Test
    void deQueueException() {
        try {
            queue.deQueue();
        } catch (IllegalStateException e) {
            assertThat(e.getMessage()).isEqualTo("queue is empty. cannot dequeue");
        }
    }

    @Test
    void full() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        assertThat(queue.full()).isEqualTo(true);
    }

    @Test
    void empty() {
        assertThat(queue.empty()).isEqualTo(true);
    }

    @Test
    void size() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        assertThat(queue.size()).isEqualTo(5);
    }
}