class Solution {
    private ListNode reverse(ListNode head) {
        ListNode node = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }

        return node;
    }

    private ListNode getK(ListNode temp, int k) {
        k--;

        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }

        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode kthNode = getK(temp, k);

            if (kthNode == null) {
                if (prev != null) prev.next = temp;
                break;
            }

            ListNode newNode = kthNode.next;

            kthNode.next = null;
            reverse(temp);

            if (temp == head) {
                head = kthNode;
            } else {
                prev.next = kthNode;
            }

            prev = temp;
            temp = newNode;
        }

        return head;
    }
}