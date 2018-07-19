import java.util.Stack

class ValidParenthesis {
  fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    for (i in 0 until s.length) {
      val c = s[i]
      if (map.containsKey(c)) {
        if (map[c] != stack.pop()) {
          return false
        }
      } else {
        stack.push(c)
      }
    }
    return true
  }

  companion object {
    val map = mapOf(Pair(')','('), Pair(']','['), Pair('}','{'))
  }

}