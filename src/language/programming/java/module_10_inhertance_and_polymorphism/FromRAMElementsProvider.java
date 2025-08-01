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

package language.programming.java.module_10_inhertance_and_polymorphism;

/**
 * @Assylzhan Baimuratov
 **/
public class FromRAMElementsProvider implements ArrayElementsProvider{

    private final int[] array;

    private int index;

    public FromRAMElementsProvider(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasMoreElements() {
        return index < array.length;
    }

    @Override
    public int nextElement() {
        return array[index++];
    }
}
