package somepackage;

import somepackage.package2.Class1;
import structures.DynaArray;

public class FullClassNameTest {
    public static void main(String[] args) {
        DynaArray array1 = new DynaArray();
        Class1 array2 = new Class1();
        somepackage.first.Class1 class1 = new somepackage.first.Class1();
    }
}
