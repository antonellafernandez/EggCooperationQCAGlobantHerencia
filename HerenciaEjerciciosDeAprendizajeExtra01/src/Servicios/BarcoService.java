package Servicios;

import Entidades.Barco;
import java.util.Scanner;

public class BarcoService {

    public Scanner leer = new Scanner(System.in);

    public Barco crearBarco() {
        long matricula = 0;
        double eslora = 0.0;
        int añoFabricacion = 0;

        while (matricula <= 0 || eslora <= 0 || añoFabricacion <= 0) {
            System.out.println("Ingrese matrícula, eslora y año de fabricación: ");
            matricula = leer.nextLong();
            eslora = leer.nextDouble();
            añoFabricacion = leer.nextInt();

            if (matricula <= 0 || eslora <= 0 || añoFabricacion <= 0) {
                System.out.println("¡Los valores ingresados no son válidos!");
            }
        }

        return new Barco(matricula, eslora, añoFabricacion);
    }
}