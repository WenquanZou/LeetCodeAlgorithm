
import java.util.ArrayList

class GenerateParentheses {
  fun generateParenthesis(n: Int): List<String> {
    val ans = ArrayList<String>()
    if (n == 0) {
      ans.add("")
    } else {
      for (c in 0 until n)
        for (left in generateParenthesis(c))
          generateParenthesis(n - 1 - c).mapTo(ans) { "($left)$it" }
    }
    return ans
  }
}