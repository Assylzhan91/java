package language.programming.java.structures;

class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();
        dynaArray1.add(3);
        dynaArray1.add(5);
        dynaArray1.add(4);

        System.out.println(dynaArray1.contains(3));
        System.out.println(dynaArray1.contains(0));
        System.out.println(dynaArray1.contains(4));
        System.out.print("size " + dynaArray1.size());
        System.out.println(dynaArray1);
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
