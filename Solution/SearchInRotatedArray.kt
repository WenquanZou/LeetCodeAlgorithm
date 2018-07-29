class SearchInRotatedArray {
  fun search(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size
    while (low < high) {
      val mid = (low + high) / 2
      val num = when {
        nums[mid] < nums[0] == target < nums[0] -> nums[mid]
        target < nums[0] -> Int.MIN_VALUE
        else -> Int.MAX_VALUE
      }

      when {
        num < target -> low = mid + 1
        num > target -> high = mid
        else -> return mid
      }
    }
    return -1
  }
}