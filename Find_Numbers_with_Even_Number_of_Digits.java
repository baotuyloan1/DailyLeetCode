public class Find_Numbers_with_Even_Number_of_Digits {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int numberDigit = (int) Math.log10(nums[i]) + 1;
            if (numberDigit % 2 == 0) {
                ++count;
            }
        }
        return count;
    }

    

    public static int findNumbers1(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentCount = 1;
            int numberDigit = calculateNumberDigit(nums[i], currentCount);
            if (numberDigit % 2 == 0) {
                ++count;
            }
        }
        return count;
    }

    private static int calculateNumberDigit(int i, int currentCount) {
        if (i / 10 > 0) {
           return  calculateNumberDigit(i / 10, ++currentCount);
        }
        return currentCount;
    }

    public static void main(String[] args) {
        int[] nums = { 555, 901, 482, 1771 };
        int count = findNumbers1(nums);
        System.out.println(count);
    }

}
