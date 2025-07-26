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
public class JavaBean {
    private String field1;
    private String exampleField2;
    private boolean logicalField3;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getExampleField2() {
        return exampleField2;
    }

    public void setExampleField2(String exampleField2) {
        this.exampleField2 = exampleField2;
    }

    public boolean isLogicalField3() {
        return logicalField3;
    }

    public void setLogicalField3(boolean logicalField3) {
        this.logicalField3 = logicalField3;
    }
}
