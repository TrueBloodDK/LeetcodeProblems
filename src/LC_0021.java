//Leetcode problem 21
//21. Merge Two Sorted Lists
// You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists into one sorted list. The list should be made by splicing
//together the nodes of the first two lists.
//Return the head of the merged linked list.
//
//Example 1:
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
//
//Example 2:
//Input: list1 = [], list2 = []
//Output: []
//
//Example 3:
//Input: list1 = [], list2 = [0]
//Output: [0]
//
//Constraints:
//    The number of nodes in both lists is in the range [0, 50].
//    -100 <= Node.val <= 100
//    Both list1 and list2 are sorted in non-decreasing order.

//
 // SOLVED at 21.10.25
//

import java.util.ArrayList;
import java.util.Collections;

public class LC_0021 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(10);
        head1.next.next = new ListNode(15);
        head1.next.next.next = new ListNode(40);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(20);

        mergeTwoLists(head1, head2);
    }
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<>();

        while (list1 != null){
            arr.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null){
            arr.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(arr);

        ListNode head = new ListNode(0);
        ListNode current = head;

        for (int i = 0; i < arr.size(); i++) {
            current.next = new ListNode(arr.get(i));
            current = current.next;
        }

        return head.next;
    }
    
    static class ListNode {
      int val;
      ListNode next;

      ListNode() {}

      ListNode(int val) {
          this.val = val;
      }

      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }
}
