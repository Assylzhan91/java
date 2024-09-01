package structures;

import java.util.Arrays;

class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();
        DynaArray dynaArray2 = new DynaArray();
        System.out.print("dynaArray1: ");
        dynaArray1.addPositiveNum(-23);
        System.out.print(Arrays.toString(dynaArray1.toArray()) + " ");
        System.out.println();
        System.out.print("dynaArray2: ");
        System.out.print(Arrays.toString(dynaArray2.toArray()) + " ");
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(1);
        dynaArray1.addPositiveNum(new int[] { 1, 2, 3 });
        DynaArray dynaArray3 = new DynaArray();
        dynaArray3.addPositiveNum(new int[] { 100, 200, 300 });
        dynaArray3.addPositiveNum(1000);
        dynaArray1.addPositiveNum(dynaArray3);
        System.out.print(dynaArray1.asString());
    }
}
