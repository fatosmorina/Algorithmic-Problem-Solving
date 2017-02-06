package leetcode.easy;

//https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
	if (head == null) {
	    return false;
	}
	ListNode oneJumper = head;
	ListNode twoJumper = head;
	while (twoJumper.next != null && twoJumper.next.next != null) {
	    oneJumper = oneJumper.next;
	    twoJumper = twoJumper.next.next;
	    if (oneJumper == twoJumper) {
		return true;
	    }
	}
	return false;
    }

    public boolean hasCycle2(ListNode head) {
	if (head == null)
	    return false;
	ListNode walker = head;
	ListNode runner = head;
	while (runner.next != null && runner.next.next != null) {
	    walker = walker.next;
	    runner = runner.next.next;
	    if (walker == runner)
		return true;
	}
	return false;
    }

    public static class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
	    val = x;
	    next = null;
	}
    }

}
