/*
 * Learning JAVA Programming Language
 *
 * Copyright 2024 Learning Java
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package language.programming.java.structures;

/**
 * @Assylzhan Baimuratov
 **/
public class StackBasedOnArray implements DataStorage {
    private int[] array;
    private int size;

    public StackBasedOnArray() {
        this(5);
    }

    public StackBasedOnArray(int size) {
        array = new int[size];
    }

    @Override
    public void add(int value) {
        if (size == array.length) {
            grow(array.length == 0 ? 5 : array.length * 2);
        }
        array[size++] = value;
    }

    private void grow(int newLength) {
        int[] newArray = new int[newLength];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public int get() {
        if (size > 0) {;
            return array[--size];
        } else {
            return 0;
        }
    }

    @Override
    public int size() {
        return size;
    }
}
