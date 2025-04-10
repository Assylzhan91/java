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
public abstract class DataStructure {

    public abstract void add(int value);

    public abstract void add(int[] array);

    public abstract void add(DynaArray dynaArray);

    public abstract void add(LinkedList list);

    public abstract int size();

    public abstract void clear();

    public abstract int[] toArray();

    public abstract boolean remove(int value);

    public abstract boolean contains(int value);

}
