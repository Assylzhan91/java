import java.util.Arrays;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();
        DynaArray dynaArray2 = new DynaArray();
        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray1.result) + " ");
        System.out.println(dynaArray1.count);

        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray2.result) + " ");
        System.out.println(dynaArray2.count);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(23);
        dynaArray1.addPositiveNum(1);
        System.out.println("--------------------------------------");

        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray1.result) + " ");
        System.out.println(dynaArray1.count);

        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray2.result) + " ");
        System.out.println(dynaArray2.count);

    }
}
