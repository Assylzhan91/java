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

package language.programming.java.somepackage;

import language.programming.java.structures.LinkedList;

/**
 * @Assylzhan Baimuratov
 **/
public class GCExampleTest {
    public static void main(String[] args) {
        String result = generate();
        System.out.println(result);
    }

    private static String generate() {
        LinkedList list = new LinkedList();
        for (int i = 0; i <= 5; i++) {
            list.add(i);
        }
        return list.asString();
    }


}
