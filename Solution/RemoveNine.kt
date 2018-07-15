class RemoveNine {

  fun newInteger(n: Int): Int {
    return Integer.parseInt(Integer.toString(n, 9))
  }
}