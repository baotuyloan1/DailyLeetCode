public class Squares_of_a_Sorted_Array {

    public static int[] sortedSquares(int[] nums) {
        int i = -1;
        while ((i + 1) < nums.length && nums[i + 1] < 0) {
            i++;
        }
        int j = -1;
        if (i < nums.length - 1) {
            j = i + 1;
        }
        int[] result = new int[nums.length];
        for (int k = 0; k < result.length; k++) {
            // i and j valid
            if (i > -1 && j > -1 && j < nums.length) {
                int ii = nums[i] * nums[i];
                int jj = nums[j] * nums[j];
                if (ii < jj) {
                    result[k] = ii;
                    i--;
                    continue;
                } else {
                    result[k] = jj;
                    j++;
                    continue;
                }
            }
            // only i valid
            else if (i > -1) {
                int ii = nums[i] * nums[i];
                result[k] = ii;
                i--;
                continue;
            } else {// only j valid
                int jj = nums[j] * nums[j];
                result[k] = jj;
                j++;
            }

        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = { -7, -3, -2, -1 };
        int[] result = sortedSquares(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}
