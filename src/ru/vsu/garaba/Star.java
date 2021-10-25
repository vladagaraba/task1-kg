package ru.vsu.garaba;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;


public class Star {


    public Star(Graphics2D gr, ArrayList<StarCor> c) {
        drawStar(gr, c);
    }

    private void drawStar(Graphics2D gr, ArrayList<StarCor> c) {


        for (StarCor starCor : c) {
            //int star = getRandomNumeral(70, 1000);//расположение звезд в пределе от 50 до 900 по x
            gr.setPaint(new Color(0xBDB6AE));//присвоение цвета звезды
            gr.fillOval(starCor.getX(), starCor.getY(), 8, 8);
        }

    }

    private int getRandomNumeral(int min, int max)//рандомное расположение
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }


}
