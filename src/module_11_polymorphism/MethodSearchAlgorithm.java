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
public class MethodSearchAlgorithm {
    public static void main(String[] args) {
        GrandParent grandParent = new Child();
        grandParent.method1();
        grandParent.method2();
        System.out.println(grandParent);
        System.out.println(grandParent.getClass());
    }

    private static class GrandParent  /* extends from Object */ {
        void method1() {
            System.out.println("GrandParent method1");
        }
        void method2() {
            System.out.println("GrandParent method2");
        }
    }
    private static class Parent extends GrandParent {
        @Override
        void method1() {
           System.out.println("Parent method1");
        }

        @Override
        public String toString(){
            return "Parent String";
        }
    }

    private static class Child extends Parent {
        @Override
        public String toString(){
            return "Child String";
        }
    }
}
