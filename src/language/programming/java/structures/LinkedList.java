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
public class LinkedList {

    Item first;
    Item last;

    public void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = last = item;
        } else {
            last.next = item;
            last = item;
        }
    }

    public void clear() {
        first = last = null;
    }

    public int[] toArray() {
        DynaArray dynaArray = new DynaArray();
        Item current = first;
        while (current != null) {
            dynaArray.add(current.value);
            current = current.next;
        }
        return dynaArray.toArray();
    }

    public String asString() {
        Item current = first;
        final StringBuilder stringBuilder = new StringBuilder().append('[');
        while (current != null) {
            stringBuilder.append(current.value);
            current = current.next;
            if (current != null) {
                stringBuilder.append(", ");
            }
        }

        return stringBuilder.append(']').toString();
    }

    /**
     * @Assylzhan Baimuratov
     **/
    private static class Item {
        private final int value;
        private Item next;

        private Item(int value) {
            this.value = value;
        }
    }


}
