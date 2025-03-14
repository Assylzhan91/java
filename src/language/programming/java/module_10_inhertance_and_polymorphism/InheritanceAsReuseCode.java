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

import javax.swing.*;
import java.awt.*;

/**
 * @Assylzhan Baimuratov
 **/
public class InheritanceAsReuseCode {
    public static void main(String[] args) {
        new ApplicationWindow().setVisible(true);

    }
    private static class ApplicationWindow extends JFrame {
        public ApplicationWindow() throws HeadlessException {
            setTitle("Assylzhan");
            setPreferredSize(new Dimension(500, 300));
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            pack();

            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            setLocation(dimension.width / 2 - this.getSize().width / 2, dimension.height / 2 - this.getSize().height / 2);
        }
    }
}
