class ThreeSumOfCloset {
  fun threeSumClosest(nums: IntArray, target: Int): Int {

    if (nums.isEmpty()) {
      return 0
    }
    nums.sort()

    var i = 0
    var diff = Integer.MAX_VALUE
    var res = 0
    while (i < nums.size - 2) {
      var l = i + 1
      var r = nums.size - 1
      while (l < r) {
        val tmp = nums[i] + nums[l] + nums[r]
        val absDiff = Math.abs(tmp-target)
        if (absDiff < diff) {
          diff = absDiff
          res = tmp
        }

        when {
          tmp > target -> r -= 1
          tmp < target -> l += 1
          else -> return tmp
        }
      }
      i++
    }
    return res
  }

}