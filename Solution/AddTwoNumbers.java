public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return addWithAddUp(l1, l2, 0);
  }

  public ListNode addWithAddUp(ListNode l1, ListNode l2, int addUp) {
    int cur = l1.val + l2.val + addUp;
    if (cur >= 10) {
      cur = cur - 10;
      addUp = 1;
    } else {
      addUp = 0;
    }

    ListNode result = new ListNode(cur);
    if (l1.next != null && l2.next != null) {
      result.next = addWithAddUp(l1.next, l2.next, addUp);
    } else if (l1.next != null) {
      result.next = addTwoNumbers(l1.next, new ListNode(addUp));
    } else if (l2.next != null) {
      result.next = addTwoNumbers(l2.next, new ListNode(addUp));
    } else if (addUp == 1) {
      result.next = new ListNode(1);
    }



    return result;
  }
}

class ListNode {
  int val;
  ListNode next;
 ListNode(int x) { val = x; }
 }
