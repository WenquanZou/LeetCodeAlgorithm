class RomanToInt {

  fun romanToInt(s: String): Int {
    var max = 0
    var result = 0
    for (i in s.length - 1 downTo 0) {
      val cur = map.get(s[i])!!
      if (cur >= max) {
        max = cur
        result += cur
      } else {
        result -= cur
      }
    }

    return result
  }

  companion object {
    var map = mapOf(Pair('I', 1), Pair('X', 10), Pair('C', 100), Pair('M', 1000),
            Pair('V', 5), Pair('L', 50), Pair('D', 500))
  }
}