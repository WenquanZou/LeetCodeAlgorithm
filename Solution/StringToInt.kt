class StringToInt {
  fun myAtoi(str: String): Int {
    var ret: Long = 0
    var isPositive = true
    var isStarted = false

    for (i in 0 until str.length) {
      if (str[i] == ' ') {
        if (!isStarted)
          continue
        else
          break
      } else if (str[i] == '-') {
        if (isStarted) {
          break
        }
        isPositive = false
        isStarted = true
      } else if (str[i] == '+') {
        if (isStarted) {
          break
        }
        isPositive = true
        isStarted = true
      } else if (str[i] in '0'..'9') {
        if (!isStarted) {
          isStarted = true
        }
        ret = ret * 10 + (str[i] - '0')

        if (ret > Integer.MAX_VALUE) {
          return if (isPositive) Integer.MAX_VALUE else Integer.MIN_VALUE
        }
      } else {
        break
      }
    }

    return (if (isPositive) ret else -ret).toInt()
  }
}