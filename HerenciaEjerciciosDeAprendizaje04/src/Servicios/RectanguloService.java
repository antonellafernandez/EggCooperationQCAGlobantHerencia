package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloService {
    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese base del rectángulo: ");
        double b = leer.nextDouble();
        leer.nextLine();
        
        System.out.println("Ingrese base del rectángulo: ");
        double a = leer.nextDouble();
        leer.nextLine();
        
        return new Rectangulo(b, a);
    }
}