class SortColors {
  fun sortColors(nums: IntArray) {
    var zeroIndex = 0
    var twoIndex = nums.size - 1

    var i = 0
    while (i < nums.size) {
      if (nums[i] == 0) {
        if (i != zeroIndex) {
          swap(nums, i, zeroIndex)
        }
        zeroIndex++
      } else if (nums[i] == 2 && i < twoIndex) {
        swap(nums, i, twoIndex)
        twoIndex--
        i--
      }
      i++
    }
  }

  fun swap(nums: IntArray, a: Int, b: Int) {
    val tmp = nums[a]
    nums[a] = nums[b]
    nums[b] = tmp
  }
}