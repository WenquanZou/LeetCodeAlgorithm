class FirstMissingPositiveNumber {
  fun firstMissingPositive(nums: IntArray): Int {
    var missing = 1
    var oldmissing = 0
    while (oldmissing != missing) {
      var i = 0
      oldmissing = missing
      while (i < nums.size) {
        if (nums[i] == missing) {
          missing++
        }
        i++
      }
    }

    return missing
  }

}