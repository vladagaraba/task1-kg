package ru.vsu.garaba;

public class StarCor {
    private int x;
    private int y;

    public StarCor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "StarCor{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
