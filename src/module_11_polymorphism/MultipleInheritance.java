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

package module_11_polymorphism;

/**
 * @Assylzhan Baimuratov
 **/
public class MultipleInheritance {

    private interface Interface1{
        void method1();
    }
    private interface Interface2{
        void method1();
        void method2();
    }
    private interface Interface3{
        void method1();
    }
    private static class Parent {}
    private static class Child extends Parent implements Interface1, Interface2, Interface3 {
        @Override
        public void method1() {
            
        }

        @Override
        public void method2() {

        }
    }
}
