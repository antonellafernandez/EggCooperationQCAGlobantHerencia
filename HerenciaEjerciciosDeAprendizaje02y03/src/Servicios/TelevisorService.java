package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;

public class TelevisorService extends ElectrodomesticoService {

    public Televisor crearTelevisor() {
        System.out.println("- Crear Televisor -");
        Electrodomestico e = super.crearElectrodomestico();

        int resolucion = 0;

        while (resolucion <= 0) {
            System.out.println("Ingrese resolucion: ");
            resolucion = leer.nextInt();
            leer.nextLine();

            if (resolucion <= 0) {
                System.out.println("¡La resolución ingresada no es válida!");
            }
        }

        char entrada = 'A';
        boolean sintonizadorTDT = true;

        while (entrada != 'S' && entrada != 'N') {
            System.out.println("Ingrese S/N sintonizador TDT: ");
            entrada = leer.nextLine().toUpperCase().charAt(0);

            if (entrada != 'S' && entrada != 'N') {
                System.out.println("¡La opción ingresada no es válida!");
            } else if (entrada == 'N') {
                sintonizadorTDT = false;
            }
        }

        return new Televisor(e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso(), resolucion, sintonizadorTDT);
    }

    @Override
    public int precioFinal(Electrodomestico e) {
        int precio = super.precioFinal(e);

        if (((Televisor) e).getResolucion() > 40) {
            precio += precio * 30 / 100;
        }

        if (((Televisor) e).isSintonizadorTDT()) {
            precio += 500;
        }

        return precio;
    }
}