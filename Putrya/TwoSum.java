import java.util.Arrays;


public class TwoSum {
    public static void main(String[] args) {
        Solution test = new Solution();
       int[] a =  test.twoSum(new int[]{1,5,11,15,2,8}, 3);
        System.out.println(Arrays.toString(a));

    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if((nums[i] + nums[j] == target) && (nums[i] != nums[j])) return new int[]{i,j};
            }
        }
        return new int[]{-1, -1};
    }
    }


