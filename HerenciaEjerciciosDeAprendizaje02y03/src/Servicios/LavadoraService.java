package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;

public class LavadoraService extends ElectrodomesticoService {

    public Lavadora crearLavadora() {
        System.out.println("- Crear Lavadora -");
        Electrodomestico e = super.crearElectrodomestico();

        int carga = 0;

        while (carga <= 0) {
            System.out.println("Ingrese carga: ");
            carga = leer.nextInt();
            leer.nextLine();

            if (carga <= 0) {
                System.out.println("¡La carga ingresada no es válida!");
            }
        }

        return new Lavadora(e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso(), carga);
    }

    @Override
    public int precioFinal(Electrodomestico e) {
        int precio = super.precioFinal(e);

        if (((Lavadora) e).getCarga() > 30) {
            precio += 500;
        }

        return precio;
    }
}