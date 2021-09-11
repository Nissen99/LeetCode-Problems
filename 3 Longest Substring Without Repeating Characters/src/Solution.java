class Solution
{

  public int lengthOfLongestSubstring(String s)
  {

    if (s.length() <= 1)
      return s.length();

    int biggest = 0;

    StringBuilder building = new StringBuilder();

    for (int i = 0; i < s.length(); i++)
    {
      if (!building.toString().contains("" + s.charAt(i)))
      {
        building.append(s.charAt(i));

        if (building.length() > biggest)
        {
          biggest = building.length();
        }
      }
      else
      {
        building = new StringBuilder(
            building.substring(building.toString().indexOf(s.charAt(i)) + 1));
        building.append(s.charAt(i));
      }
    }
    return biggest;
  }

}