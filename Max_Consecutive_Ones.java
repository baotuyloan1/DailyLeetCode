public class Max_Consecutive_Ones {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int highestCount = 0;
        int currentCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ++currentCount;
                if (currentCount > highestCount) {
                    highestCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        return highestCount;
    }

    public static void main(String[] args) {
        int[] nums = { 1,1,0,1,1,1};
        int max = findMaxConsecutiveOnes(nums);
        System.out.println(max);
    }
}