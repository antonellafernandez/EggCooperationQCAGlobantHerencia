package Services;

import Entities.Building;
import Entities.OfficeBuilding;
import java.util.HashMap;
import java.util.Scanner;

public class OfficeBuildingService implements IBuildingService {
    
    public Scanner read = new Scanner(System.in);
    
    public OfficeBuilding createOfficeBuilding() {
        System.out.println('\n' + "Create Office Building" + '\n');
        
        double length = 0, width = 0, heigth = 0;
        int floors = -1;
        
        while (length <= 0 || width <= 0 || heigth <= 0 || floors < 0) {
            System.out.println("Enter length (m), width (m), heigth (m) and number of floors for the building: ");
            length = read.nextDouble();
            width = read.nextDouble();
            heigth = read.nextDouble();
            floors = read.nextInt();
            read.nextLine();
            
            if (length <= 0 || width <= 0 || heigth <= 0 || floors < 0) {
                System.out.println("¡The values entered are not valid!");
            }
        }

        HashMap<Integer, HashMap<Integer, Integer>> buildingDistribution = new HashMap<>();
        
        for (int i = 0; i <= floors; i++) {
            HashMap<Integer, Integer> floorDistribution = new HashMap<>();
            
            int offices = 0;
            
            while (offices <= 0) {
                System.out.println("Enter number of offices at the #" + i + " floor:");
                offices = read.nextInt();
                read.nextLine();
                
                if (offices <= 0) {
                    System.out.println("¡The value entered is not valid!");
                } else {
                    for (int j = 1; j <= offices; j++) {
                        int people = 0;
                        
                        while (people <= 0) {
                            System.out.println("Enter number of people available at the #" + j + " office: ");
                            people = read.nextInt();
                            
                            if (people <= 0) {
                                System.out.println("¡The value entered is not valid!");
                            } else {
                                floorDistribution.put(j, people);
                            }
                        }
                    }
                }
            }
            buildingDistribution.put(i, floorDistribution);
        }
        
        return new OfficeBuilding(length, width, heigth, buildingDistribution);
    }

    @Override
    public double calculateSurfaceArea(Building b) {
        double l = ((OfficeBuilding) b).getLength(), w = ((OfficeBuilding) b).getWidth(), h = ((OfficeBuilding) b).getHeigth();
        return 2 * (w * l + l * h + l * w);
    }

    @Override
    public double calculateVolume(Building b) {
        return ((OfficeBuilding) b).getHeigth() * ((OfficeBuilding) b).getLength() * ((OfficeBuilding) b).getWidth();
    }
    
    public void peopleAmount(OfficeBuilding ob) {
        System.out.println('\n' + "Calculate People Amount" + '\n');

        HashMap<Integer, HashMap<Integer, Integer>> od = ob.getBuildingDistribution();
        int totalPeopleInBuilding = 0;
        
        for (Integer floor : od.keySet()) {
            int totalPeopleOnFloor = 0;

            HashMap<Integer, Integer> floorInfo = od.get(floor);

            for (int people : floorInfo.values()) {
                totalPeopleOnFloor += people;
            }
            
            totalPeopleInBuilding += totalPeopleOnFloor;
            System.out.println("Floor #" + floor + " has a capacity of " + totalPeopleOnFloor + " people.");
        }

        System.out.println("The building has a capacity of " + totalPeopleInBuilding + " people.");
    }
}