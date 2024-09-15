package somepackage;

public class ConstructorAlternative {
    private int value;
    {
        value = 3;
    }
    public static void main(String[] args) {
        ConstructorAlternative c = new ConstructorAlternative();
        System.out.println(c.value);
    }
}
