package somepackage;

import java.util.Arrays;

public class DynaArray {
    int[] result = new int[5];
    int count;

    void addPositiveNum( int  value) {

        if (count == result.length) {
            int[] newArray = new int[result.length * 2];
            System.arraycopy(result, 0, newArray, 0, result.length);
            result = newArray;
        }
        result[count++] = value;
    }

    int[] toArray() {
        return Arrays.copyOf(result, count);
    }

    String asString() {
        final StringBuilder stringBuilder = new StringBuilder().append('[');
        for (int i = 0; i < count; i++) {
            stringBuilder.append(result[i]);
            if (i <  count - 1) {
                stringBuilder.append(',').append(' ');
            }
        }

        return stringBuilder.append(']').toString();
     }
}
