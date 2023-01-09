package org.example.Client.GUIBoard;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.example.Client.GUIBoard.AbstractGUIBoard;
import org.example.Client.Square;

public class ClassicGUIBoard extends AbstractGUIBoard {

    public ClassicGUIBoard() {
        int count = 0;
        double size = 800 / 8;
        for (int j = 0; j < 8; j++) {
            count++;
            for (int i = 0; i < 8; i++) {
                Rectangle rectangle = new Rectangle(size, size, size, size);
                rectangle.setFill(Color.WHITESMOKE);
                if (count % 2 == 0) {
                    rectangle = new Square(i, 7-j, size);
                }
                add(rectangle, i, j);
                count++;
            }

            //getChildren().stream().filter(f -> f.getClass()== Square.class && ((Square) f).getRow())
        }
    }
}