package Entities;

public class Building {
    protected double length, width, heigth;

    public Building() {
    }

    public Building(double length, double width, double heigth) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Building | Length = " + length + "m., Width = " + width + "m., Heigth = " + heigth + "m.";
    }
}