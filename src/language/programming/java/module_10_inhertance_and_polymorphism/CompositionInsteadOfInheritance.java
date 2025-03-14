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

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * @Assylzhan Baimuratov
 **/
public class CompositionInsteadOfInheritance {
    private JFrame frame;

    public static void main(String[] args) {
        new CompositionInsteadOfInheritance();
    }

    public CompositionInsteadOfInheritance() {
        frame = new JFrame();
        frame.setTitle("Assylzhan2");
        frame.setPreferredSize(new Dimension(500, 300));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dimension.width / 2 - frame.getSize().width / 2, dimension.height / 2 - frame.getSize().height / 2);
        frame.setVisible(true);
    }
}
