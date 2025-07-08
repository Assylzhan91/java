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
public final class QueueBasedOnArray extends BasedOnArrayDataStorage {

    public QueueBasedOnArray() {
        this(5);
    }

    public QueueBasedOnArray(int size) {
        super(size);
    }

    @Override
    public int get() {
        if (size > 0) {
            int result = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            size--;
            return result;
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }


    @Override
    protected RuntimeException creaRuntimeException() {
        return new RuntimeException("Queue is empty");
    }

    @Override
    protected int getIfNotEmp() {
        int result = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        size--;
        return result;
    }

}
