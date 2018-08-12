class UniquePath {
  fun uniquePaths(m: Int, n: Int): Int {
    val dp = IntArray(n)
    for (i in 0 until n) {
      dp[i] = 1
    }
    for (i in 1 until m) {
      for (j in 1 until n) {
        dp[j] += dp[j - 1]
      }
    }
    return dp[n - 1]
  }
}