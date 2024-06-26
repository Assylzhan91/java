public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 5, -2, 12, -4, 12, 54, 67, 91, 43, 14};
        DynaArray result = getPositiveNumbers(array);

        for (int i = 0; i < result.count; i++) {
            System.out.print(result.result[i] + " ");
        }
        System.out.println();
        String str = "Hello";
        System.out.println(str);

    }

    private static DynaArray getPositiveNumbers(int[] array) {
        DynaArray dynaArray = new DynaArray();
        for (int value : array) {
            if (value > 0) {
                dynaArray.addPositiveNum( value);
            }
        }
        return dynaArray;
    }
}
