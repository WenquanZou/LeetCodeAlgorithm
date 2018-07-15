
import java.util.Arrays

class FrequencySort {
  fun frequencySort(s: String): String {
    if (s.isEmpty()) return s
    val table = IntArray(128)
    val temp = IntArray(128)
    val arr = s.toCharArray()
    for (c in arr) {
      table[c.toInt()] += 1
      temp[c.toInt()] += 1
    }
    Arrays.sort(temp)
    val sb = StringBuilder()
    for (i in temp.indices.reversed()) {
      val count = temp[i]

      if (count != 0) {
        for (j in table.indices) {
          if (table[j] == count) {
            val c = j.toChar()
            table[j] = 0
            for (k in 0 until count) {
              sb.append(c)
            }
          }
        }
      }
      if (count == 0) break

    }
    return sb.toString()
  }
}