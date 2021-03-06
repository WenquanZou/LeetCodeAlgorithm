class LongestPalindromicSubstring {
  fun longestPalindrome(s: String): String {
    var start = 0
    var end = 0
    for (i in 0 until s.length) {
      val len1 = expandAroundCenter(s, i, i)
      val len2 = expandAroundCenter(s, i, i + 1)
      val len = Math.max(len1, len2)
      if (len > end - start) {
        start = i - (len - 1) / 2
        end = i + len / 2
      }
    }
    return s.substring(start, end + 1)
  }

  private fun expandAroundCenter(s: String, left: Int, right: Int): Int {
    var L = left
    var R = right
    while (L >= 0 && R < s.length && s[L] == s[R]) {
      L--
      R++
    }
    return R - L - 1
  }
}