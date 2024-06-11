import java.util.Arrays;

public class DynaArrayDebugDemonstration {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();

        dynaArray.addPositiveNum(1);
        dynaArray.addPositiveNum(2);
        dynaArray.addPositiveNum(3);
        dynaArray.addPositiveNum(4);
        dynaArray.addPositiveNum(5);
        dynaArray.addPositiveNum(6);

         System.out.println(Arrays.toString (dynaArray.result));
        System.out.println(dynaArray.count);
    }
}
