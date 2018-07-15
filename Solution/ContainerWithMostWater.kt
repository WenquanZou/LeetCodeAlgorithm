class ContainerWithMostWater {

  fun maxArea(height: IntArray): Int {
    var maxArea = 0
    var left = 0
    var right = height.size - 1
    var width = height.size - 1
    while (left < right) {
      maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * width)
      if (height[left] < height[right]) {
        left++
      } else {
        right--
      }
      width--
    }
    return maxArea
  }
}