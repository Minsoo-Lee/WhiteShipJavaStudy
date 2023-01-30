package Week4.Subject2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    private ListNode head = new ListNode(0);

    @BeforeEach
    public void setHead() {
        addNodes(head);
    }

    @AfterEach
    public void clearHead() {
        head = null;
    }

    @Test
    void 노드_추가() {
        assertThat(head.getNext().getNext().getData()).isEqualTo(2);
    }

    @Test
    void 인덱스_추가_범위_이탈() {
        try {
            head = ListNode.add(head, new ListNode(3), 2);
        } catch (IllegalStateException e) {
            assertThat(e.getMessage()).isEqualTo("Position out of Bound");
        }
    }

    @Test
    void 노드_제거() {
        head = ListNode.remove(head, 3);
        assertThat(head.getNext().getNext().getNext()).isEqualTo(null);
    }

    @Test
    void 인덱스_제거_범위_이탈() {
        try {
            head = ListNode.add(head, new ListNode(3), 2);
        } catch (IllegalStateException e) {
            assertThat(e.getMessage()).isEqualTo("Position out of Bound");
        }
    }

    @Test
    void contains() {
        assertThat(head.contains(head, new ListNode(4))).isEqualTo(false);
    }

    void addNodes(ListNode head) {
        head = ListNode.add(head, new ListNode(1), 1);
        head = ListNode.add(head, new ListNode(2), 2);
        head = ListNode.add(head, new ListNode(3), 3);
    }
}