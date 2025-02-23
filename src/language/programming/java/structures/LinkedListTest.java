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

import java.util.Arrays;

/**
 * @Assylzhan Baimuratov
 **/
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }
        System.out.println(list.asString());
        list.isRemoved(3);
        // [0, 1, 2, 3]
        System.out.println(list.asString());

        list.isRemoved(0);
        // [1, 2, 3]
        System.out.println(list.asString());

        list.isRemoved(2);
        // [1, 3]
        System.out.println(list.asString());

        list.isRemoved(1);
        // [3]
        System.out.println(list.asString());

        list.isRemoved(3);
        //[]
        System.out.println(list.asString());
        ///////////////////////////////////////////
        list.add(0);
        list.add(1);

        list.isRemoved(1);
        // [0]
        System.out.println(list.asString());
    }

}
