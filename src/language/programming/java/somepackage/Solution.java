package language.programming.java.somepackage;

import language.programming.java.structures.DynaArray;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 5, -2, 12, -4, 12, 54, 67, 91, 43, 14};
        DynaArray result = getPositiveNumbers(array);

        System.out.println(result.asString());
        String str = "Hello";
        System.out.println(str);

    }

    private static DynaArray getPositiveNumbers(int[] array) {
        DynaArray dynaArray = new DynaArray();
        for (int value : array) {
            if (value > 0) {
                dynaArray.add( value);
            }
        }
        return dynaArray;
    }
}
