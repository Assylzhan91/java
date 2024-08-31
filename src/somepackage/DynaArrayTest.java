package somepackage;

import structures.DynaArray;

import java.util.Arrays;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();
        DynaArray dynaArray2 = new DynaArray();
        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray1.toArray()) + " ");

        System.out.print("dynaArray2: ");
        System.out.print(Arrays.toString(dynaArray2.toArray()) + " ");
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(1);
        System.out.print(dynaArray1.asString());

    }
}
