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
public class DataStorageTest {
    public static void main(String[] args) {
        DataStorage dataStorageQueue = new QueueBasedOnArray(); // new Stack() or new Queue()
        DataStorage dataStorageStack = new StackBasedOnArray(); // new Stack() or new Queue()

        for (int i = 0; i < 5; i++) {
            dataStorageStack.add(i);
        }

        //System.out.println("queue array " + dataStorage2.size());
        // 4 3 2 1 0 for Stack
        // 0 1 2 3 4 for Queue
        while (dataStorageStack.size() > 0) {
            System.out.print(dataStorageStack.get() + " ");
        }

        System.out.println();
    }

}
