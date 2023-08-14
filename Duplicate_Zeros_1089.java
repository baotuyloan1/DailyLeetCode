public class Duplicate_Zeros_1089 {
    public static void duplicateZeros(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                //shift
                for (int j = size - 2; j > i; j--) {
                    arr[j+1] = arr[j];
                }
                if(i+1 < size )
                arr[i+1] = 0;
                i++;
            }

        }
    }

    public static void main(String[] args) {
        int[] input = { 1,2,3 };
        duplicateZeros(input);
        for (int i : input) {
            System.out.println(i);
        }
    }

}