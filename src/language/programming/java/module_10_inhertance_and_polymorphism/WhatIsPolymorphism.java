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

import language.programming.java.structures.DataStructure;
import language.programming.java.structures.LinkedList;

/**
 * @Assylzhan Baimuratov
 **/
public class WhatIsPolymorphism {
    public static void main(String[] args) {
        DataStructure dataStructure = getAllProductsSelectedByUser();
        createOrder(dataStructure);
    }

    private static DataStructure getAllProductsSelectedByUser() {
        DataStructure dataStructure = new LinkedList();
        for (int i = 0; i < 10; i++) {
            dataStructure.add(i);
        }
        return dataStructure;
    }

    private static void createOrder(DataStructure dataStructure) {
        if (dataStructure.size() > 5) {
            if (dataStructure.contains(7)) {
                System.out.println("price with discount: 50%");
            } else {
                System.out.println("price with discount: 10%");
            }
        } else {
            System.out.println("price without discount");
        }
    }
}
