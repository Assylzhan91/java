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

package temp;

/**
 * @Assylzhan Baimuratov
 **/
public class SuperMethod {
    private static class Parent {
        void method1 (){
            System.out.println("Parent");
        }
        void method2 (){

        }
    }

    private static class Child extends Parent {
        @Override
        void method1() {
            System.out.println("Child");
            super.method1();
        }


        void method3() {
            method1();
            System.out.println("method3");
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        
        child.method3();

    }
}
