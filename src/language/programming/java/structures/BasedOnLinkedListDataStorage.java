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
public abstract class  BasedOnLinkedListDataStorage extends BaseDataStorage {

    protected Item first;


    @Override
    public final void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = item;
        } else {
            addNextItem(item);
        }
        size++;
    }

    protected abstract void addNextItem(Item item);

    @Override
    public int get() {
        if (size > 0) {
            int result = first.value;
            first = first.next;
            size--;
            return result;
        }else {
            return 0;
        }
    }



    /**
     * @Assylzhan Baimuratov dfsfsdfds
     * sfsdfs fsdf sdfs
     * @hello how's going dude
     **/
    protected static class Item {
        protected int value;
        protected Item next;

        protected Item(int value) {
            this.value = value;
        }
    }
}
