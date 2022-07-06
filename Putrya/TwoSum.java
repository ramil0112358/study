import java.util.*;

// Сложность O(n^2)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if((nums[i] + nums[j] == target) && (nums[i] != nums[j])) return new int[]{i,j};
            }
        } return new int[]{-1, -1};
    }
}

// Сложность O(n)

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (hm.containsValue(target - nums[i])) return new int[]{hm.get(target - nums[i]), i};
            else hm.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
