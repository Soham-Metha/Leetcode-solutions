class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode ref = head.next;
        ListNode prev = head;
        while(ref != null)
        {
            if (ref.val == prev.val)
            {
                prev.next = ref.next;
            }
            else prev = ref;
            ref = ref.next;
        }
        return head;
    }
}