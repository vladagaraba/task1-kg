package ru.vsu.garaba;


import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
        mw.setSize(1100, 800);
        mw.setLocationRelativeTo(null);
        //mw.setResizable(false);
        mw.setDefaultCloseOperation(
                WindowConstants.DISPOSE_ON_CLOSE);// чтобы закрывалась программа
        mw.setVisible(true);// делаем видимым

    }
}
