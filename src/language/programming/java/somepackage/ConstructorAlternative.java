package language.programming.java.somepackage;

public class ConstructorAlternative {
    private final int value;
    public ConstructorAlternative() {
        value = 3;
    }
    public ConstructorAlternative(int val) {
        this.value = val;
    }
    public static void main(String[] args) {
        ConstructorAlternative c = new ConstructorAlternative();
        ConstructorAlternative c2 = new ConstructorAlternative(10);
        System.out.println(c.value);
        System.out.println(c2.value);
    }
}
