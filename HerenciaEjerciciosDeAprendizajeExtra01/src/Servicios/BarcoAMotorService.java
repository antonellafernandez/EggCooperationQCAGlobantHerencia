package Servicios;

import Entidades.Barco;
import Entidades.BarcoAMotor;
import java.util.Scanner;

class BarcoAMotorService extends BarcoService {

    Scanner leer = new Scanner(System.in);

    public BarcoAMotor crearBarcoAMotor() {
        Barco b = super.crearBarco();

        double potenciaCV = 0;

        while (potenciaCV <= 0) {
            System.out.println("Ingrese potencia en CV: ");
            potenciaCV = leer.nextDouble();
            leer.nextLine();

            if (potenciaCV <= 0) {
                System.out.println("¡Los valores ingresados no son válidos!");
            }
        }

        return new BarcoAMotor(b.getMatricula(), b.getEslora(), b.getAnioFabricacion(), potenciaCV);
    }
}