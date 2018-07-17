class Power {

  private fun fastPow(x: Double, n: Long): Double {
    if (n == 0.toLong()) {
      return 1.0
    }
    val half = fastPow(x, n / 2)
    return if (n % 2 == 0.toLong()) {
      half * half
    } else {
      half * half * x
    }
  }

  fun myPow(x: Double, n: Int): Double {
    var x = x
    var N = n.toLong()
    if (N < 0) {
      x = 1 / x
      N = -N
    }

    return fastPow(x, N)
  }
}