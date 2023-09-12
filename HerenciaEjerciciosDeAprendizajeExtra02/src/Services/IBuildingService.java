package Services;

import Entities.Building;

public interface IBuildingService {
    public double calculateSurfaceArea(Building b);
    public double calculateVolume(Building b);
}