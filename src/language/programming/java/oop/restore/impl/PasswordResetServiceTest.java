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
import language.programming.java.oop.restore.PasswordResetService;

/**
 * @Assylzhan Baimuratov
 **/
public final class PasswordResetServiceTest {
    private final PasswordResetService service;

    public static void main(String[] args) {
        PasswordResetServiceTest passwordResetServiceTest = new PasswordResetServiceTest(
                new PasswordResetService(
                        new FormRAMAccountRepository(),
                        new ShowAccessAccountNotFoundByEmailHandler(),
                        new DisableAccountNotActiveHandler(),
                        new DefaultNumberVerificationCodeGenerator(),
                        new StubEmailService()
                )
        );
        passwordResetServiceTest.test("test@gmail.com");
        passwordResetServiceTest.test("test1@gmail.com");
        passwordResetServiceTest.test("test2@gmail.com");
    }

    public PasswordResetServiceTest(PasswordResetService service) {
        this.service = service;
    }

    public void test(String email) {
        System.out.println(email + "->" + service.reset(email));
    }

}
