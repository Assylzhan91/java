package structures;

import java.util.Arrays;

class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();

        System.out.println("dynaArray1: ");
        dynaArray1.add(-23);
        System.out.print(Arrays.toString(dynaArray1.toArray()) + " ");
        System.out.println();
        System.out.print("dynaArray2: ");

        dynaArray1.add(23);
        dynaArray1.add(23);
        dynaArray1.add(23);
        dynaArray1.add(23);
        dynaArray1.add(23);
        dynaArray1.add(1);
        dynaArray1.add(new int[] { 1, 2, 3 });
        DynaArray dynaArray3 = new DynaArray();
        dynaArray3.add(new int[] { 100, 200, 300 });
        dynaArray3.add(1000);
        dynaArray1.add(dynaArray3);
        System.out.print(dynaArray1.asString());
    }
}
