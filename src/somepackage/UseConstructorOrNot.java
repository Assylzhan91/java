package somepackage;

public class UseConstructorOrNot {
    private int[] result;

    private int count = 4;

    public UseConstructorOrNot() {
        System.out.println(Runtime.getRuntime().availableProcessors());
        if(Runtime.getRuntime().availableProcessors() > 2){
            result = new int[20];
        } else if(System.getProperty("os.name").contains("Windows")){
            result = new int[10];
        }else {
            result = new int[count];
        }
    }
}
