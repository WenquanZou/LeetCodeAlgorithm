class CountAndSay {

  fun countAndSay(n: Int): String {
    return if (n == 1) "1" else count(countAndSay(n - 1))
  }

  private fun count(s: String): String {
    val sb = StringBuilder()
    var k = 0
    for (j in 0 until s.length) {
      if (s[j] != s[k]) {
        sb.append(j - k)
        sb.append(s[k])
        k = j
      }
      if (j == s.length - 1) {
        sb.append(j - k + 1)
        sb.append(s[k])
      }
    }
    return sb.toString()
  }
}