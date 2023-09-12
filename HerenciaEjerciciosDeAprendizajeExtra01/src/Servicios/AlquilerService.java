package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoAMotor;
import Entidades.Velero;
import Entidades.YateDeLujo;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AlquilerService {
    public Scanner leer = new Scanner(System.in);
    
    public VeleroService vs = new VeleroService();
    public BarcoAMotorService bms = new BarcoAMotorService();
    public YateDeLujoService ys = new YateDeLujoService();
    
    public Alquiler crearAlquiler() {
        System.out.println("Ingrese nombre del cliente: ");
        String nombre = leer.nextLine().toUpperCase();
        
        long dni = 0;
        
        while (dni <= 0) {
            System.out.println("Ingrese DNI del cliente: ");
            dni = leer.nextLong();
            leer.nextLine();
            
            if (dni <= 0) {
                System.out.println("¡El DNI ingresado no es válido!");
            }
        }
        
        System.out.println("Para la fecha de alquiler: ");
        LocalDate fechaAlquiler = ingresarFecha();
     
        LocalDate fechaDevolucion = null;
        int diasOcupacion = -1;

        while (diasOcupacion < 0) {
            System.out.println("Para la fecha de devolución: ");
            fechaDevolucion = ingresarFecha();

            Period periodoOcupacion = Period.between(fechaAlquiler, fechaDevolucion);
            diasOcupacion = periodoOcupacion.getDays();

            if (diasOcupacion < 0) {
                System.out.println("¡La fecha de devolución ingresada no es válida!");
            }
        }

        int posAmarre = 0;

        while (posAmarre <= 0) {
            System.out.println("Ingrese la posición del amarre: ");
            posAmarre = leer.nextInt();
            leer.nextLine();
            
            if (posAmarre <= 0) {
                System.out.println("¡El valor ingresado no es válido!");
            }
        }
        
        int opcion = 0;
        
        Barco b = null;
        
        while (opcion <= 0 || opcion > 3) {
            System.out.println("Elija el tipo de barco a alquilar: " + '\n'
                    + "1 - Velero" + '\n'
                    + "2 - Barco A Motor" + '\n'
                    + "3 - Yate De Lujo");

            opcion = leer.nextInt();
            leer.nextLine();
            
            switch (opcion) {
                case 1: 
                    b = vs.crearVelero();
                    break;
                case 2:
                    b = bms.crearBarcoAMotor();
                    break;
                case 3:
                    b = ys.crearYateDeLujo();
                    break;
                default:
                    System.out.println("¡La opción ingresada no es válida!");
            }
        }

        return new Alquiler(nombre, dni, fechaAlquiler, fechaDevolucion, posAmarre, b);
    }
    
    private LocalDate ingresarFecha() {
        boolean existe = false;
        LocalDate fecha = null;

        while (!existe) {
            try {
                System.out.println("Ingrese año, mes y día: ");
                int aa = leer.nextInt();
                int mm = leer.nextInt();
                int dd = leer.nextInt();

                fecha = LocalDate.of(aa, mm, dd);
                existe = true;
            } catch (DateTimeException e) {
                System.out.println("La fecha ingresada no es válida.");
            }
        }
        
        return fecha;
    }
    
    public double calcularAlquiler(Alquiler a) {
        Period periodoOcupacion = Period.between(a.getFechaAlquiler(), a.getFechaDevolucion());
        int diasOcupacion = periodoOcupacion.getDays();

        return diasOcupacion * calcularValorModulo(a);
    }

    private double calcularValorModulo(Alquiler a) {
        Barco b = a.getBarco();
        double valorModulo = 10 * b.getEslora();
        
        if (b instanceof Velero) {
            valorModulo += ((Velero) b).getNumeroMastiles();
        } else if (b instanceof BarcoAMotor) {
            valorModulo += ((BarcoAMotor) b).getPotenciaCV();
        } else if (b instanceof YateDeLujo) {
            valorModulo += ((YateDeLujo) b).getPotenciaCV() + ((YateDeLujo) b).getNumeroCamarotes();
        }
        
        return valorModulo;
    }
}