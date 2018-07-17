class Power {

  fun pow(x: Double, n: Int): Double {
    var a = x
    var number = n
    if (number == 0)
      return 1.0
    if (number < 0) {
      number = -number
      a = 1 / a
    }
    return if (number % 2 == 0) pow(a * a, number / 2) else a * pow(a * a, number / 2)
  }
}