public class Main
{
  public static void main(String[] args)
  {
    Solution solution = new Solution();
    int[] ints = new int[]{2,7,11,15};
    int[] pog = solution.twoSum(ints, 9);
    System.out.println(pog[0] + ", "+ pog[1]);
  }
}
