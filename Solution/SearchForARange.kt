class SearchForARange {

  fun binarySearch(nums: IntArray, target: Int, isLeft: Boolean): Int {
    var left = 0
    var right = nums.size

    while(left < right) {
      val mid = (left + right) /2
      if (nums[mid] > target || (isLeft && nums[mid] == target) ) {
        right = mid
      } else {
        left = mid + 1
      }
    }

    return left
  }
  fun searchRange(nums: IntArray, target: Int): IntArray {
    val start = binarySearch(nums, target, true)

    if (start == nums.size || nums[start] != target) {
      return intArrayOf(-1, -1)
    }
    val end = binarySearch(nums, target, false) - 1

    return intArrayOf(start, end)
  }
}