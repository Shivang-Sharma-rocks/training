package may_20_2026;

public class pivot {
    public static void main(String[] args) {
        int nums[] = {1, 7, 3, 6, 5, 6};
        int pivotIndex = findPivotIndex(nums);
        System.out.println("Pivot index: " + pivotIndex);
    }

    private static int findPivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
