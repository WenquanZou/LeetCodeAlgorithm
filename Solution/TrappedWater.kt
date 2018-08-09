class TrappedWater {
  fun trap(height: IntArray): Int {
    val trap = IntArray(height.size)
    var hleft = 0
    for (i in height.indices) {
      if (height[i] > hleft) {
        hleft = height[i]
      } else {
        trap[i] = hleft - height[i]
      }
    }
    var hright = 0
    for (i in height.indices.reversed()) {
      if (height[i] > hright) {
        hright = height[i]
      }
      if (height[i] + trap[i] > hright) {
        trap[i] = hright - height[i]
      }
    }
    var trapsum = 0
    for (t in trap) {
      trapsum += t
    }
    return trapsum
  }

}