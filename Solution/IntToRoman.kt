
import java.util.*

class IntToRoman {

  fun intToRoman(num: Int): String {
    val sb = StringBuilder()
    val integers = ArrayList(map.keys)
    var temp = num
    Collections.sort(integers, Collections.reverseOrder())
    for (i in integers) {
      val quotient = temp / i!!
      if (quotient > 0) {
        for (j in 0..quotient - 1) {
          sb.append(map[i])
        }
        temp -= quotient * i
      }
    }
    return sb.toString()
  }

  companion object {
    var map = mapOf(Pair(1, "I"), Pair(10, "X"), Pair(100, "C"), Pair(1000, "M"),
            Pair(5, "V"), Pair(50, "L"), Pair(500, "D"),
            Pair(4, "IV"),Pair(40, "XL"), Pair(400, "CD"),
            Pair(9, "IX"),Pair(90, "XC"), Pair(900, "CM"))
  }
}