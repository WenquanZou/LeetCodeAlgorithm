class IsPalindromeNumber {

  fun isPalindrome(x: Int): Boolean {

    if ((x % 10 == 0 && x != 0) || x < 0) {
      return false
    }

    var rightHalf = 0
    var leftHalf = x

    while (leftHalf > rightHalf) {
      rightHalf = rightHalf * 10 + leftHalf % 10
      leftHalf /= 10
    }

    return rightHalf == leftHalf || rightHalf /10 == leftHalf
  }
}