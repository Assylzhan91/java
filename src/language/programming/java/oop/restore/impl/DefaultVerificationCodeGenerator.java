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

package language.programming.java.oop.restore.impl;

import language.programming.java.oop.restore.VerificationCodeGenerator;

import java.util.Random;

/**
 * @Assylzhan Baimuratov
 **/
public class DefaultVerificationCodeGenerator implements VerificationCodeGenerator {
    private final Random random = new Random();
    private int length;

    public DefaultVerificationCodeGenerator(int length) {
        this.length = length;
    }

    public DefaultVerificationCodeGenerator() {
        this(10);
    }

    @Override
    public String generator() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
