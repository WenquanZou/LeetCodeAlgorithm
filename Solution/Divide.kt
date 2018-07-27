class Divide {
  fun divide(dividend: Int, divisor: Int): Int {
    if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE
    val sign = if (dividend xor divisor < 0) -1 else 1
    var absDividend = Math.abs(dividend.toLong())
    val absDivisor = Math.abs(divisor.toLong())
    var ans: Long = 0
    while (absDivisor <= absDividend) {
      var product = absDivisor
      var factor: Long = 1
      while (product shl 1 <= absDividend) {
        product = product shl 1
        factor = factor shl 1
      }
      absDividend -= product
      ans += factor
    }
    return (sign * ans).toInt()
  }
}