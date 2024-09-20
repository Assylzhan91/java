package structures;

import java.util.Arrays;

class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();
        dynaArray1.add(3);
        dynaArray1.add(5);
        dynaArray1.add(4);
        /*System.out.println(Arrays.toString(dynaArray1.toArray()));*/
        dynaArray1.remove(5);
        System.out.println(dynaArray1.asString());
        dynaArray1.remove(4);
        System.out.println(dynaArray1.asString());
        /*dynaArray1.add(0);
        dynaArray1.add(1);
        dynaArray1.add(2);
        dynaArray1.add(3);
        dynaArray1.add(4);

        int[] array1 = dynaArray1.toArray();
        System.out.println(Arrays.toString(array1));
        System.out.println(dynaArray1.asString());
        array1[0] = -1;
        System.out.println(Arrays.toString(array1));
        System.out.println(dynaArray1.asString());*/
    }
}
