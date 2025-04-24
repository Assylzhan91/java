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
public class WhyInstanceOfIsBadPractice {
    public static void main(String[] args) {
        Parent parent = new Child();
        Parent parent2 = new Child2();
        parent.doSomething();
        parent2.doSomething();
        /*Parent parent = new Child();
        if (parent instanceof Child) {
            System.out.println("parent instanceof Child");
        }else if (parent instanceof Child2) {
            System.out.println("parent instanceof Child2");
        }*/
    }

    private interface  Parent {
        void doSomething();
    }
    private static class Child implements Parent {
        @Override
        public void doSomething() {
            System.out.println("Child doSomething");
        }
    }
    private static class Child2 implements Parent {

        @Override
        public void doSomething() {
            System.out.println("Child2 doSomething");
        }
    }
}
