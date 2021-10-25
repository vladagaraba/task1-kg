package ru.vsu.garaba;

import java.awt.*;

public class Tree {
    public Tree(Graphics2D gr, int x1, int x2, Color color) {
        drawTree(gr, x1, x2, color);
    }

    private void drawTree(Graphics2D gr, int x1, int x2, Color color) {
        int width = x2 - x1;
        int middle = x1 + width / 2;
        double height = width;

        int[] x = {x1, (int) (middle - width / 3.7), (int) (middle - width / 2.4),
                (int) (middle - width / 5.3), (int) (middle - width / 3.4), middle - width / 8,
                (int) (middle - width / 4.4), middle, (int) (middle + width / 4.4), middle + width / 8,
                (int) (middle + width / 3.4), (int) (middle + width / 5.3), (int) (middle + width / 2.4),
                (int) (middle + width / 3.7), x2};
        int[] y = {1100, 800 - (int) (height / 4.5), 560 - (int) (height / 4.5), 560 - (int) (height / 2.25),
                560 - (int) (height / 2.25), 560 - (int) (height / 1.5), 560 - (int) (height / 1.5),
                560 - (int) height, 560 - (int) (height / 1.5), 560 - (int) (height / 1.5),
                560 - (int) (height / 2.25), 560 - (int) (height / 2.25), 560 - (int) (height / 4),
                560 - (int) (height / 4), 560};

        gr.setPaint(color);
        gr.fillPolygon(x, y, 15);

        gr.setPaint(new Color(0x000505));
        gr.setStroke(new BasicStroke(2));



    }


}
