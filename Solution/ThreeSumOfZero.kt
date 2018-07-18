
import java.util.ArrayList
import java.util.HashSet

class ThreeSumOfZero {
  fun threeSum(nums: IntArray): List<List<Int>> {
    val res = HashSet<List<Int>>()
    if (nums.isEmpty()) {
      return ArrayList(res)
    }

    nums.sort()

    for (i in 0 until nums.size - 2) {
      var j = i + 1
      var k = nums.size - 1
      while (j < k) {
        val sum = nums[i] + nums[j] + nums[k]

        when {
          sum == 0 -> res.add(arrayListOf(nums[i], nums[j++], nums[k--]))
          sum > 0 -> k -= 1
          sum < 0 -> j += 1
        }
      }

    }
    return ArrayList(res)

  }
}