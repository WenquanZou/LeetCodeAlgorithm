
import java.util.*

class IntToRoman {

  fun intToRoman(num: Int): String {
    var num = num
    val roman = arrayOf(charArrayOf('A', 'I', 'V', 'X'), charArrayOf('A', 'X', 'L', 'C'), charArrayOf('A', 'C', 'D', 'M'), charArrayOf('A', 'M', 'A', 'A'))
    val nine2Roman = intArrayOf(0, 1, 11, 111, 12, 2, 21, 211, 2111, 13)
    val sb = StringBuilder()
    var r = 0
    while (num > 0) {
      var idx = nine2Roman[num % 10]
      while (idx > 0) {
        sb.append(roman[r][idx % 10])
        idx /= 10
      }
      num /= 10
      r++
    }
    return sb.reverse().toString()
  }
}