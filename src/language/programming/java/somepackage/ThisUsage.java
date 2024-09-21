package language.programming.java.somepackage;

public class ThisUsage {
    public int[] result;
    public ThisUsage() {
        this(5);
    }

    public ThisUsage(int size) {
        result = new int[size];
    }
}
