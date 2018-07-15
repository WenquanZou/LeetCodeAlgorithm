class FirstUniqueChar {

  fun firstUniqChar(s: String): Int {
    val chArr = s.toCharArray()
    val keep = IntArray(26)
    for (ch in chArr) {
      keep[ch.toInt() - 97]++
    }
    return chArr.indices.firstOrNull { keep[chArr[it].toInt() - 97] <= 1 }
            ?: -1
  }
}