class UniquePathTwo {
  fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
    val n = obstacleGrid.size
    val m = obstacleGrid[0].size
    val dp = Array(n) { IntArray(m) }
    (0 until n)
            .takeWhile { obstacleGrid[it][0] != 1 }
            .forEach { dp[it][0] = 1 }
    (0 until m)
            .takeWhile { obstacleGrid[0][it] != 1 }
            .forEach { dp[0][it] = 1 }
    for (i in 1 until n) {
      (1 until m)
              .filter { obstacleGrid[i][it] != 1 }
              .forEach { dp[i][it] = dp[i - 1][it] + dp[i][it - 1] }
    }
    return dp[n - 1][m - 1]
  }
}