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
    private int count = 0;

    public void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = last = item;
        } else {
            last.next = item;
            last = item;
        }
        count++;
    }

    public void clear() {
        first = last = null;
        count = 0;
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


    public boolean isRemoved(int value) {
        Pair pair = findPair(value);

        if (pair != null) {
            if (pair.current == first && pair.current == last) {
                clear();
            } else if (pair.current == first) {
                first = pair.current.next;
            } else {
                pair.previous.next = pair.current.next;
                if (pair.current == last) {
                    last = pair.previous;
                }
            }
            count--;
            return true;
        }

        return false;
    }

    private Pair findPair(int value) {
        Item previous = first;
        Item current = first;
        while (current != null) {
            if (current.value == value) {
                return new Pair(previous, current);
            } else {
                previous = current;
                current = current.next;
            }
        }
        return null;
    }

    public int size() {
        return count;
    }

    public boolean contains(int value) {
       return findPair(value) != null;
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


    private static class Pair {
        private Item previous;
        private Item current;

        private Pair(Item previous, Item current) {
            this.previous = previous;
            this.current = current;
        }
    }
}
