public class DynaArray {
    int[] result = new int[5];
    int count;

    void addPositiveNum( int value) {
        if (count == result.length) {
            int[] newArray = new int[result.length * 2];
            System.arraycopy(result, 0, newArray, 0, result.length);
            result = newArray;
        }
        result[count++] = value;
    }
}
