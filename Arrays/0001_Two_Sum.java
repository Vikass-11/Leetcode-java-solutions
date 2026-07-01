import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // return indices
                }
            }
        }
        return null; // no solution found
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10]; // input size fixed to 10
        for (int i = 0; i < 10; i++) {
            nums[i] = scan.nextInt();
        }
        int target = scan.nextInt();

        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, target);

        if (result != null) {
            System.out.println("[" + result[0] + "," + result[1] + "]");
        } else {
            System.out.println("No solution found");
        }
    }
}