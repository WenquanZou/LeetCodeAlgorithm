class ListNode(var `val`: Int = 0) {
  var next: ListNode? = null
}

class RemoveNthNodeFromEnd {

  fun removeNthFromEnd(head: ListNode, n: Int): ListNode {
    val start = ListNode(0)
    start.next = head
    var first: ListNode? = start
    var second = start
    // Advances first pointer so that the gap between first and second is n nodes apart
    for (i in 0..n) {
      first = first!!.next
    }
    // Move first to the end, maintaining the gap
    while (first != null) {
      first = first.next
      second = second.next!!
    }
    //Remove the nth node
    second.next = second.next!!.next
    return start.next!!
  }
}
