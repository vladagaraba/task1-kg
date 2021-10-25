package ru.vsu.garaba;

import java.awt.*;

public class Cloud {
    public Cloud(Graphics2D gr, int screenwidth, int screenheight) {
        drawCloud(gr, screenwidth, screenheight);
    }

    private void drawCloud(Graphics2D gr, int screenwidth, int screenheight) {
        int x1 = 250;
        int y1 = 80;

        gr.setPaint(new Color(0xFF8B8888, true));

        gr.fillArc((int) (screenwidth / 4.4), (int) (screenheight / 7.2727), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//1
        gr.fillArc((int) (screenwidth / 3.4375), (int) (screenheight / 7.2727), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//9
        gr.fillArc((int) (screenwidth / 2.8205), (int) (screenheight / 7.2727), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//8
        gr.fillArc((int) (screenwidth / 2.5), (int) (screenheight / 7.2727), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//7
        gr.fillArc((int) (screenwidth / 3.666), (int) (screenheight / 10.0), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//2
        gr.fillArc((int) (screenwidth / 2.75), (int) (screenheight / 10.0), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//4
        gr.fillArc((int) (screenwidth / 3.1), (int) (screenheight / 12.5), (int) (screenwidth / 13.333), (int) (screenheight / 13.333), 0, 360);//4

        int x2 = 650;
        int y2 = 80;

        gr.setPaint(new Color(0xFF8B8888, true));

        gr.fillArc((int) (screenwidth / 1.69), (int) (screenheight / 7.2727), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//1
        gr.fillArc((int) (screenwidth / 1.527), (int) (screenheight / 7.2727), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//9
        gr.fillArc((int) (screenwidth / 1.392), (int) (screenheight / 7.2727), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//8
        gr.fillArc((int) (screenwidth / 1.309), (int) (screenheight / 7.2727), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//7
        gr.fillArc((int) (screenwidth / 1.571), (int) (screenheight / 10.0), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//2
        gr.fillArc((int) (screenwidth / 1.375), (int) (screenheight / 10.0), (int) (screenwidth / 12.222), (int) (screenheight / 13.333), 0, 360);//4
        gr.fillArc((int) (screenwidth / 1.466), (int) (screenheight / 13.333), (int) (screenwidth / 13.333), (int) (screenheight / 13.333), 0, 360);//4


    }

}
