class RegExpMatching {

  fun isMatch(text: String, pattern: String): Boolean {
    if (pattern.isEmpty()) return text.isEmpty()
    val first_match = !text.isEmpty() && (pattern[0] == text[0] || pattern[0] == '.')

    return if (pattern.length >= 2 && pattern[1] == '*') {
      isMatch(text, pattern.substring(2)) || first_match && isMatch(text.substring(1), pattern)
    } else {
      first_match && isMatch(text.substring(1), pattern.substring(1))
    }
  }
}