class Solution {
    // Step 1: Insert copied nodes after original nodes
    private void insertcopy(Node head) {
        Node temp = head;

        while (temp != null) {
            Node copy = new Node(temp.val);

            copy.next = temp.next;
            temp.next = copy;

            temp = temp.next.next;
        }
    }

    // Step 2: Connect random pointers of copied nodes
    private void Pointrandoms(Node head) {
        Node temp = head;

        while (temp != null) {
            Node copy = temp.next;

            if (temp.random != null)
                copy.random = temp.random.next;
            else
                copy.random = null;

            temp = temp.next.next;
        }
    }

    // Step 3: Separate original and copied lists
    private Node PointNext(Node head) {
        Node temp = head;
        Node newhead = temp.next;

        while (temp != null) {
            Node copy = temp.next;

            // Restore the original list
            temp.next = copy.next;

            // Connect the copied list
            if (copy.next != null) {
                copy.next = copy.next.next;
            }

            temp = temp.next;
        }

        return newhead;
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        insertcopy(head);
        Pointrandoms(head);

        return PointNext(head);
    }
}