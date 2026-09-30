package linkedlist;

public class IsPalindromeLinkedList {
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
    public boolean isPalindrome(Node head) {
        if (head == null) return true;
        if (head.next == null) return true;
        if (head.next.next == null) return head.value == head.next.value;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head1 = head, head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        while (head2 != null) {
            if (head1.value != head2.value) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
}
