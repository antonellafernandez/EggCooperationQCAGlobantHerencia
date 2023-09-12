package Services;

import Entities.Building;
import Entities.SportsCenter;
import java.util.Scanner;

public class SportsCenterService implements IBuildingService {
    
    public Scanner read = new Scanner(System.in);
    
    public SportsCenter createSportsCenter() {
        System.out.println('\n' + "Create Sports Center" + '\n');
        
        double length = 0, width = 0, heigth = 0;
        
        while (length <= 0 || width <= 0 || heigth <= 0) {
            System.out.println("Enter length (m), width (m), heigth (m) and number of floors for the building: ");
            length = read.nextDouble();
            width = read.nextDouble();
            heigth = read.nextDouble();
            read.nextLine();
            
            if (length <= 0 || width <= 0 || heigth <= 0) {
                System.out.println("¡The values entered are not valid!");
            }
        }
        
        System.out.println("Enter the building name: ");
        String name = read.nextLine().toUpperCase();
        
        String type = "A";
        
        while (!type.equals("OPENED") && !type.equals("ROOFED")) {
            System.out.println("Enter 'OPENED' or 'ROOFED' for the building type: ");
            type = read.nextLine().toUpperCase();
            
            if (!type.equals("OPENED") && !type.equals("ROOFED")) {
                System.out.println("¡The option entered is not valid!");
            }
        }
        
        return new SportsCenter(length, width, heigth, name, type);
    }

    @Override
    public double calculateSurfaceArea(Building b) {
        double l = ((SportsCenter) b).getLength(), w = ((SportsCenter) b).getWidth(), h = ((SportsCenter) b).getHeigth();
        String type = ((SportsCenter) b).getType();
        
        double surfaceArea = 2 * (w * l + l * h + l * w);

        if (type.equals("OPENED")) {
            surfaceArea -= w * l;
        }
        return surfaceArea;
    }

    @Override
    public double calculateVolume(Building b) { 
        return ((SportsCenter) b).getHeigth() * ((SportsCenter) b).getLength() * ((SportsCenter) b).getWidth();
    }
}
