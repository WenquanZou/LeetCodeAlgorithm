class MinimumSubstringWindow {
  fun minWindow(s: String, t: String): String {
    if (t.isEmpty() || s.isEmpty()) {
      return ""
    }
    val map = IntArray(128)
    for (i in 0 until t.length) {
      map[t[i].toInt()]++
    }

    var min = Integer.MAX_VALUE
    var result = ""
    var counter = t.length

    var slow = 0
    var fast = 0
    while (fast < s.length) {
      if (--map[s[fast].toInt()] >= 0) {
        counter--
      }
      fast++

      while (counter == 0) {
        if (fast - slow < min) {
          min = fast - slow
          result = s.substring(slow, fast)
        }

        if (++map[s[slow].toInt()] > 0) {
          counter++
        }
        slow++
      }
    }

    return result
  }
}