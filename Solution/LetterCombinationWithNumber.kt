import java.util.*

fun main(args : Array<String>) {
  val d = LetterCombinationWithNumber()
  print(d.letterCombinations("23"))
}

class LetterCombinationWithNumber {

  fun letterCombinations(digits: String): List<String> {
    val result = LinkedList<String>()
    if (digits.isEmpty()) {
      return result
    }

    result.add("")
    while (result.peek().length != digits.length) {
      val remove = result.remove()
      val map = keys[digits[remove.length] - '0']
      for (c in map.toCharArray()) {
        result.addLast(remove + c)
      }
    }
    return result
  }

  companion object {
    val keys = arrayOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
  }


}