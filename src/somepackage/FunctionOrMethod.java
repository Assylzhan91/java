package somepackage;

public class FunctionOrMethod {
    int value;
    void changeValue(){
        value = 65;
    }

    public static void main(String[] args) {
        FunctionOrMethod obj = new FunctionOrMethod();
        System.out.println(obj.value);
        obj.changeValue();
        System.out.println(obj.value);
    }
}
