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
 * language.programming.java.module_10_inhertance_and_polymorphism.LateBinding$Parent
 * language.programming.java.module_10_inhertance_and_polymorphism.LateBinding$Child
 * language.programming.java.module_10_inhertance_and_polymorphism.LateBinding$Child2
 */

package language.programming.java.module_10_inhertance_and_polymorphism;
import java.util.Scanner;

/**
 * @Assylzhan Baimuratov
 **/
public class LateBinding {

    public static void main(String[] args) throws Exception{
        String fullClassName = new Scanner(System.in).nextLine();
        Parent parent = (Parent) Class.forName(fullClassName).getDeclaredConstructor().newInstance();
        parent.doSomething();
    }

    public static class Parent{
        public void doSomething(){
            System.out.println("Parent.doSomething");
        }
    }

    private static class Child extends Parent{
        @Override
        public void doSomething(){
            System.out.println("Child.doSomething");
        }
    }

    private static class Child2 extends Parent{
        @Override
        public void doSomething(){
            System.out.println("Child2.doSomething");
        }
    }
}
