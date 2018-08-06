class MultiplyString {
  fun multiply(num1: String, num2: String): String {
    val n1 = num1.length
    val n2 = num2.length
    val products = IntArray(n1 + n2)
    for (i in n1 - 1 downTo 0) {
      for (j in n2 - 1 downTo 0) {
        val d1 = num1[i] - '0'
        val d2 = num2[j] - '0'
        products[i + j + 1] += d1 * d2
      }
    }
    var carry = 0
    for (i in products.indices.reversed()) {
      val tmp = (products[i] + carry) % 10
      carry = (products[i] + carry) / 10
      products[i] = tmp
    }
    val sb = StringBuilder()
    for (num in products) sb.append(num)
    while (sb.isNotEmpty() && sb[0] == '0') sb.deleteCharAt(0)
    return if (sb.isEmpty()) "0" else sb.toString()
  }

}