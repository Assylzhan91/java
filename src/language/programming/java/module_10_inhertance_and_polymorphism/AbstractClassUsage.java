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
public class AbstractClassUsage {
    public static void main(String[] args) {
        Example child = new Child();
        child.doSomething();
    }

    private static abstract class Example {
        abstract void doSomething();
    }

    private static class Child extends Example {
        @Override
        void doSomething() {

        }
    }
}
