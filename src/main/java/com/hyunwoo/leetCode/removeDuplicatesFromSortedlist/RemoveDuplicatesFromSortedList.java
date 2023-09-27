//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package com.hyunwoo.leetCode.removeDuplicatesFromSortedlist;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode list = head;
        while (list.next != null) {
            if (list.next == null) {
                break;
            }

            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return head;
    }

}
