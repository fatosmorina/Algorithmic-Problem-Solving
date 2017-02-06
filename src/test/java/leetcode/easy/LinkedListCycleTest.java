package leetcode.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import leetcode.easy.LinkedListCycle.ListNode;

@RunWith(MockitoJUnitRunner.class)
public class LinkedListCycleTest {

    @InjectMocks
    LinkedListCycle linkedListCycle;

    @Test
    public void shouldReturnTrue() {
	ListNode head = new ListNode(3);
	ListNode second = new ListNode(2);
	ListNode third = new ListNode(0);
	ListNode fourth = new ListNode(-4);
	head.next = second;
	second.next = third;
	third.next = fourth;
	fourth.next = second;
	assertTrue(linkedListCycle.hasCycle(head));
    }
}
