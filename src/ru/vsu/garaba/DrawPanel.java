package ru.vsu.garaba;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;


public class DrawPanel extends JPanel {
    final ArrayList<StarCor> c = new ArrayList<>();
    Random rnd = new Random();


    @Override
    public void paint(Graphics g) {
        super.paint(g); //базовое рисование панели
        Graphics2D gr = (Graphics2D) g;
        backgroundPicture(gr, 1100, 800);

        if (c.size() == 0) {
           setList();
        }

        new Star(gr, c);

        new Cloud(gr, getWidth(), getHeight());
        new Cloud(gr, getWidth(), getHeight());
        new Moon(gr, getWidth(), getHeight());

        new Tree(gr, -15, 50, new Color(0x000000));
        new Tree(gr, 15, 100, new Color(0x000000));
        new Tree(gr, 35, 220, new Color(0x000000));
        new Tree(gr, 90, 250, new Color(0x000000));
        new Tree(gr, 180, 420, new Color(0x000000));
        new Tree(gr, 355, 575, new Color(0x000000));
        new Tree(gr, 295, 495, new Color(0x000000));
        new Tree(gr, 405, 635, new Color(0x000000));
        new Tree(gr, 550, 750, new Color(0x000000));
        new Tree(gr, 520, 670, new Color(0x000000));
        new Tree(gr, 730, 930, new Color(0x000000));
        new Tree(gr, 620, 880, new Color(0x000000));
        new Tree(gr, 770, 1020, new Color(0x000000));
        new Tree(gr, 870, 1100, new Color(0x000000));
        new Tree(gr, 950, 1200, new Color(0x000000));
        new Tree(gr, 1100, 1300, new Color(0x000000));
        new Tree(gr, 1300, 1400, new Color(0x000000));
        new Tree(gr, 1400, 1450, new Color(0x000000));
        new Tree(gr, 1450, 1350, new Color(0x000000));

    }

    //    //-----------фон моего неба------------//

    private void backgroundPicture(Graphics2D gr, int screenwidth, int screenheight) {
        GradientPaint primary1 = new GradientPaint(//цвет неба
                300f, 100f, new Color(0, 0, 0, 255),
                1200f, 900f, new Color(9, 9, 127, 223));
        gr.setPaint(primary1);
        gr.fillRect(0, 0, 1800, 900);

    }

    private void setList() {
        for (int i = 0; i < 25; i++) {
            c.add(new StarCor(rnd.nextInt(700), rnd.nextInt(500)));
        }
    }

}





