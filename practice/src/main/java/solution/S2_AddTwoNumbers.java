package solution;

import datastructure.ListNode;

public class S2_AddTwoNumbers {
  /**
   * Linked List
   * Math
   * Recursion
   **/
  //  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
  //    ListNode dummyHead = new ListNode(0);
  //    ListNode p = l1, q = l2, curr = dummyHead;
  //    int carry = 0;
  //    while (p != null || q != null) {
  //      int x = (p != null) ? p.val : 0;
  //      int y = (q != null) ? q.val : 0;
  //      int sum = carry + x + y;
  //      carry = sum / 10;
  //      curr.next = new ListNode(sum % 10);
  //      curr = curr.next;
  //      if (p != null) p = p.next;
  //      if (q != null) q = q.next;
  //    }
  //    if (carry > 0) {
  //      curr.next = new ListNode(carry);
  //    }
  //    return dummyHead.next;
  //  }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //dummyHead是一個定錨，用來固定指向新的ListNode
    ListNode dummyHead = new ListNode(0);
    //下列宣告為指標，用來指向l1和l2的第一個ListNode
    ListNode p = l1, q = l2, curr = dummyHead;

    int carry = 0;
    while (p != null || q != null) {
      int count = 0;
      if (p != null) {
        count += p.val;
      }
      if (q != null) {
        count += q.val;
      }
      count += carry;
      curr.next = new ListNode(count % 10);
      curr = curr.next;
      carry = count / 10;
      if (p != null)
        p = p.next;
      if (q != null)
        q = q.next;
    }
    if (carry > 0) {
      curr.next = new ListNode(carry);
    }
    return dummyHead.next;
  }


}
