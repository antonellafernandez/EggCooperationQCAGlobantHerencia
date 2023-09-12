package Servicios;

import Entidades.Barco;
import Entidades.Velero;
import java.util.Scanner;

class VeleroService extends BarcoService {

    public Scanner leer = new Scanner(System.in);

    public Velero crearVelero() {
        Barco b = super.crearBarco();

        int numeroMastiles = 0;

        while (numeroMastiles <= 0) {
            System.out.println("Ingrese número de mástiles: ");
            numeroMastiles = leer.nextInt();
            leer.nextLine();

            if (numeroMastiles <= 0) {
                System.out.println("¡Los valores ingresados no son válidos!");
            }
        }

        return new Velero(b.getMatricula(), b.getEslora(), b.getAnioFabricacion(), numeroMastiles);
    }
}