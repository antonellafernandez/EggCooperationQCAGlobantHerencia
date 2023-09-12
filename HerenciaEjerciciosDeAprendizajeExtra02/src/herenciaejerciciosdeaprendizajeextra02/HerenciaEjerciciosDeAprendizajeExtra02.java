package herenciaejerciciosdeaprendizajeextra02;

/*

2. Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:

• Método calcularSuperficie(): calcula la superficie del edificio.

• Método calcularVolumen(): calcula el volumen del edifico.

Estos métodos serán abstractos y los implementarán las siguientes clases:

• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.

Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.

*/

import Entities.Building;
import Entities.OfficeBuilding;
import Entities.SportsCenter;
import Services.OfficeBuildingService;
import Services.SportsCenterService;
import java.util.ArrayList;
import java.util.Scanner;

public class HerenciaEjerciciosDeAprendizajeExtra02 {
    
    public static ArrayList<Building> buildings = new ArrayList();
    
    public static OfficeBuildingService obs = new OfficeBuildingService();
    public static SportsCenterService scs = new SportsCenterService();

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int opcion = -1;

        while (opcion != 0) {
            System.out.println('\n' + "==================== MENÚ ====================" + '\n'
                    + "0 - Exit" + '\n'
                    + "1 - Create Office Building" + '\n'
                    + "2 - Calculate Office Buildings People Amount" + '\n'
                    + "3 - Create Sports Center" + '\n'
                    + "4 - Calculate Sports Center Types" + '\n'
                    + "5 - Calculate Buildings Surface Area And Volume" + '\n'
                    + "==============================================" + '\n');

            opcion = leer.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("¡Goodbye!");
                    break;
                case 1:
                    OfficeBuilding ob = obs.createOfficeBuilding();
                    System.out.println("¡The Office Building has been created successfully!");
                    buildings.add(ob);
                    break;
                case 2:
                    if (buildings.size() != 0) {
                        for (Building b : buildings) {
                            if (b instanceof OfficeBuilding) {
                                obs.peopleAmount((OfficeBuilding) b);
                            }
                        }
                    } else {
                        System.out.println("No buildings have been created yet.");
                    }
                    break;
                case 3:
                    SportsCenter sc = scs.createSportsCenter();
                    System.out.println("¡The Sports Center has been created successfully!");
                    buildings.add(sc);
                    break;
                case 4:
                    calculateSportsCenterTypes();
                    break;
                case 5:
                    calculateSurfaceAreasAndVolumes();
                    break;
                default:
                    System.out.println("The option entered is not valid.");
            }
        }
    }

    public static void calculateSportsCenterTypes() {
        System.out.println('\n' + "Calculate Sports Center Types" + '\n');

        if (buildings.size() != 0) {
            int roofed = 0, opened = 0;
            
            for (Building b : buildings) {
                if (b instanceof SportsCenter) {
                    String type = ((SportsCenter) b).getType();
                    if (type.equals("OPENED")) {
                        opened++;
                    } else {
                        roofed++;
                    }
                }
            }
            
            System.out.println(opened + "Sports Centers are 'OPENED'.");
            System.out.println(roofed + "Sports Centers are 'ROOFED'.");
        } else {
            System.out.println("No buildings have been created yet.");
        }
    }
    
    public static void calculateSurfaceAreasAndVolumes() {
        System.out.println('\n' + "Calculate Buildings Surface Area And Volume");

        if (buildings.size() != 0) {
            for (Building b : buildings) {
                System.out.println('\n' + b.toString() + '\n');

                double surfaceArea = 0, volume = 0;

                if (b instanceof OfficeBuilding) {
                    surfaceArea = obs.calculateSurfaceArea(b);
                    volume = obs.calculateVolume(b);
                } else if (b instanceof SportsCenter) {
                    surfaceArea = scs.calculateSurfaceArea(b);
                    volume = scs.calculateVolume(b);
                }

                System.out.println("Building Surface Area = " + surfaceArea + "m²."
                        + '\n' + "Building Volume = " + volume + "m³.");
            }
        } else {
            System.out.println("No buildings have been created yet.");
        }
    }
}