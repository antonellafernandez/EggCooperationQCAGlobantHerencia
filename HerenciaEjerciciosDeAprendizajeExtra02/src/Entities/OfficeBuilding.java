package Entities;

import java.util.HashMap;

public class OfficeBuilding extends Building {
    private HashMap<Integer, HashMap<Integer, Integer>> buildingDistribution;

    public OfficeBuilding() {
    }

    public OfficeBuilding(double length, double width, double heigth, HashMap<Integer, HashMap<Integer, Integer>> buildingDistribution) {
        super(length, width, heigth);
        this.buildingDistribution = buildingDistribution;
    }

    public HashMap<Integer, HashMap<Integer, Integer>> getBuildingDistribution() {
        return buildingDistribution;
    }

    public void setBuildingDistribution(HashMap<Integer, HashMap<Integer, Integer>> buildingDistribution) {
        this.buildingDistribution = buildingDistribution;
    }
    
    @Override
    public String toString() {
        return "Office " + super.toString() + buildingDistribution + ".";
    }
}