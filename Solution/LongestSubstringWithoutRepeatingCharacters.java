public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    if (s.length()==0||s.length()==1) {
      return s.length();
    }
    int max = 1;
    int start = 0;
    for (int i = 1; i< s.length();i++) {
      for (int k = start; k<i; k++) {
        if (s.charAt(i)==s.charAt(k)){
          start=k+1;
        }
      }
      if (max <= i-start){
        max = i-start+1;
      }
    }
    return max;

  }
}
