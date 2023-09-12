package Entities;

public class SportsCenter extends Building {
    private String name, type; // Roofed or Opened

    public SportsCenter() {
    }
    
    public SportsCenter(double length, double width, double heigth, String name, String type) {
        super(length, width, heigth);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SportsCenter " + super.toString() + ", Name = " + name + ", Type = " + type + ".";
    }
}