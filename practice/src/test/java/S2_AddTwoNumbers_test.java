import datastructure.ListNode;
import org.junit.jupiter.api.Test;
import solution.S2_AddTwoNumbers;
import datastructure.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class S2_AddTwoNumbers_test {

  S2_AddTwoNumbers s2 = new S2_AddTwoNumbers();

  @Test
  void test1() {
    //Input: l1 = [2,4,3], l2 = [5,6,4]
    //Output: [7,0,8]
    //Explanation: 342 + 465 = 807.
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

    //convert ListNode to LinkedList
    LinkedList list1 = new LinkedList();
    list1.head = expected;
    LinkedList list2 = new LinkedList();
    list2.head = s2.addTwoNumbers(l1, l2);

    assertEquals(list1.toString(), list2.toString());
  }

  @Test
  void test2()
  {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    LinkedList list1 = new LinkedList();
    list1.head = l1;
    list1.insert(6);
    list1.printList();
  }

}
