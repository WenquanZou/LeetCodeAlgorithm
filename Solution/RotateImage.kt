class RotateImage {
  fun rotate(matrix: Array<IntArray>) {
    val n = matrix.size
    val layer = n / 2

    for (i in 0 until layer) {
      for (j in i until n - i - 1) {
        val tmp = matrix[i][j]
        matrix[i][j] = matrix[n - j - 1][i]
        matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1]
        matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1]
        matrix[j][n - i - 1] = tmp
      }
    }
  }
}