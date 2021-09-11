class Solution {



  public boolean isPalindrome(int x) {

    if (x < 0){
      return false;
    }

    String numberAsString = Integer.toString(x);

    for (int i = 0; i < numberAsString.length(); i++)
    {
      if (! (numberAsString.charAt(i) == numberAsString.charAt(numberAsString.length() - 1 - i))) {
        return false;
      }
    }

    return true;
  }
}