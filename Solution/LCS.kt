class LCS {
  fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
      return ""
    }
    val commonPrefix = strs.reduce { acc, s ->
      acc.commonPrefixWith(s)
    }
    return commonPrefix
  }
}