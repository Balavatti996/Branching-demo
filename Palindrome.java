public class Palindrome {
  public static void main(String[] args) {
    String str = "racecar";
    boolean isPalindrome = isPalindrome(str);

    if (isPalindrome) {
      System.out.println(str + " is a palindrome.");
    } else {
      System.out.println(str + " is not a palindrome.");
    }
  }

  public static boolean isPalindrome(String str) {
    int n = str.length();
    for (int i = 0; i < n / 2; i++) {
      if (str.charAt(i) != str.charAt(n - i - 1)) {
        return false;
      }
    }
    return true;
  }
}

