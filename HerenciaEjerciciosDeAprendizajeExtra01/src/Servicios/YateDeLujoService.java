package Servicios;

import Entidades.BarcoAMotor;
import Entidades.YateDeLujo;
import java.util.Scanner;

class YateDeLujoService extends BarcoAMotorService {

    Scanner leer = new Scanner(System.in);

    public YateDeLujo crearYateDeLujo() {
        BarcoAMotor bm = super.crearBarcoAMotor();

        int numeroCamarotes = 0;

        while (numeroCamarotes <= 0) {
            System.out.println("Ingrese número de camarotes: ");
            numeroCamarotes = leer.nextInt();
            leer.nextLine();

            if (numeroCamarotes <= 0) {
                System.out.println("¡Los valores ingresados no son válidos!");
            }
        }

        return new YateDeLujo(bm.getMatricula(), bm.getEslora(), bm.getAnioFabricacion(), bm.getPotenciaCV(), numeroCamarotes);
    }
}