class MergeKSortedArray {

  fun mergeKLists(lists: Array<ListNode>?): ListNode? {

    return if (lists == null || lists.isEmpty()) {
      null
    } else sortByPartition(lists, 0, lists.size - 1)

  }

  private fun sortByPartition(lists: Array<ListNode>, start: Int, end: Int): ListNode? {

    if (start == end) { // base case
      return lists[start]
    }

    val middle = start + (end - start) / 2
    val left = sortByPartition(lists, start, middle)
    val right = sortByPartition(lists, middle + 1, end)

    return merge(left, right)
  }

  private fun merge(left: ListNode?, right: ListNode?): ListNode? {

    if (left == null || right == null) { // base case
      return left ?: right
    }

    if (left.`val` < right.`val`) {
      left.next = merge(left.next, right)
      return left
    } else {
      right.next = merge(left, right.next)
      return right
    }

  }
}