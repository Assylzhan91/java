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

package language.programming.java.oop;

/**
 * @Assylzhan Baimuratov
 **/
public class OOP {

    public static void main(String[] args) {
        Class1 class1 = new Class1(new Class2(20));
        class1.doSomething();
    }

    private interface Interface {
        void doSomething ();
    }

    private static class Class1  {
        private final Interface object;

        public Class1(Interface object) {
            this.object = object;
        }

        public void doSomething() {
            object.doSomething();
        }
    }

    private static class Class2  implements Interface {
        int value;
        public Class2(int value) {
            this.value = value;
        }

        @Override
        public void doSomething() {
            System.out.println(value);
        }
    }
}
