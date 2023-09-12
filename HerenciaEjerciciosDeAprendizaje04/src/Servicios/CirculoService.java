package Servicios;

import Entidades.Circulo;
import java.util.Scanner;

public class CirculoService {
    public Circulo crearCirculo() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese radio del círculo: ");
        double r = leer.nextDouble();
        leer.nextLine();
        
        double d = r * 2;

        return new Circulo(r, d);
    }
}