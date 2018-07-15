

fun main(args : Array<String>) {
  val d = EditDistance()
  print(d.minDistance("horse", "ros"))
}

class EditDistance {

  fun minDistance(word1: String, word2: String): Int {
    val m = word1.length
    val n = word2.length
    var d = Array(m + 1) { IntArray(n + 1) }

    //initialize d
    for (i in 1..m) {
      d[i][0] = i
    }

    for (j in 1..n) {
      d[0][j] = j
    }

    for (j in 1..n) {
      for (i in 1..m) {
        var c = 1
        if (word1[i-1] == word2[j-1]) {
          c = 0
        }
        d[i][j] = minOf(d[i-1][j] + 1, d[i][j-1] + 1, d[i-1][j-1] + c)
      }
    }

    return d[m][n]
  }
}
