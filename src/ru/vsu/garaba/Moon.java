package ru.vsu.garaba;

import java.awt.*;

public class Moon {

    public Moon(Graphics2D gr, int screenwidth, int screenheight) {

        drawMoon(gr, screenwidth, screenheight);
    }

    private void drawMoon(Graphics2D gr, int screenwidth, int screenheight) {

        gr.setPaint(new Color(0xCDC7AB));//присвоение цвета луне
        gr.fillOval((int) (screenwidth / 31.428), (int) (screenheight / 40.0),
                (int) (screenwidth / 11.0), (int) (screenheight / 8.0));//рисуем луну по координатам


        gr.setPaint(new Color(0x050400));
        gr.fillOval(0, (int) (screenheight / 40.0), (int) (screenwidth / 11.0), (int) (screenheight / 8.0));


        gr.setPaint(new Color(0xC6BDBD));
        gr.fillOval((int) (screenwidth / 1.294), (int) (screenheight / 3.2), (int) (screenwidth / 5.5), (int) (screenheight / 4.0));


    }


}
