import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++)
    {
      if (hashMap.containsKey(nums[i])){
        return new int[] {i, hashMap.get(nums[i])};
      }

      hashMap.put(target-nums[i], i);

    }

    return nums;
  }
}