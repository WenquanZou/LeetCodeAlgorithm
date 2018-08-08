class MedianOfTwoArrays {
  fun findMedianSortedArrays(nums1: IntArray, num2: IntArray): Double {
    var arrayA = nums1
    var arrayB = num2
    var m = arrayA.size
    var n = arrayB.size
    if (m > n) { // to ensure m<=n
      val temp = arrayA
      arrayA = arrayB
      arrayB = temp
      val tmp = m
      m = n
      n = tmp
    }
    var iMin = 0
    var iMax = m
    val halfLen = (m + n + 1) / 2
    while (iMin <= iMax) {
      val i = (iMin + iMax) / 2
      val j = halfLen - i
      if (i < iMax && arrayB[j - 1] > arrayA[i]) {
        iMin = iMin + 1 // i is too small
      } else if (i > iMin && arrayA[i - 1] > arrayB[j]) {
        iMax = iMax - 1 // i is too big
      } else { // i is perfect
        var maxLeft = 0
        if (i == 0) {
          maxLeft = arrayB[j - 1]
        } else if (j == 0) {
          maxLeft = arrayA[i - 1]
        } else {
          maxLeft = Math.max(arrayA[i - 1], arrayB[j - 1])
        }
        if ((m + n) % 2 == 1) {
          return maxLeft.toDouble()
        }

        var minRight = 0
        if (i == m) {
          minRight = arrayB[j]
        } else if (j == n) {
          minRight = arrayA[i]
        } else {
          minRight = Math.min(arrayB[j], arrayA[i])
        }

        return (maxLeft + minRight) / 2.0
      }
    }
    return 0.0
  }
}