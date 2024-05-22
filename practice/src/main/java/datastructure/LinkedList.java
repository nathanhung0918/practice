package datastructure;

public class LinkedList {
  public ListNode head; // head of list

  // Method to insert a new node
  public static LinkedList insert(LinkedList list, int data) {
    // Create a new node with given data
    ListNode new_node = new ListNode(data);

    // If the Linked List is empty,
    // then make the new node as head
    if (list.head == null) {
      list.head = new_node;
    } else {
      // Else traverse till the last node
      // and insert the new_node there
      ListNode last = list.head;
      while (last.next != null) {
        last = last.next;
      }

      // Insert the new_node at last node
      last.next = new_node;
    }

    // Return the list by head
    return list;
  }

  // Method to print the LinkedList.
  public void printList(LinkedList list) {
    System.out.println(list.toString());
  }

  public String toString() {
    ListNode currNode = head;

    String listString = String.valueOf(currNode.val);

    // Traverse through the LinkedList
    while (currNode.next != null) {
      listString += " -> " + currNode.next.val;
      // Go to next node
      currNode = currNode.next;
    }
    return listString;
  }

}
