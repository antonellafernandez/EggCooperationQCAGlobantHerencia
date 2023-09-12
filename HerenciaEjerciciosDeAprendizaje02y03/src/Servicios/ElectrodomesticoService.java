package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoService {
    
    public Scanner leer = new Scanner(System.in);
    
    public Electrodomestico crearElectrodomestico() {
        System.out.println("Ingrese color: ");
        String color = leer.nextLine();

        color = comprobarColor(color);

        System.out.println("Ingrese consumo energético (letras entre A y F): ");
        char consumoEnergetico = leer.nextLine().toUpperCase().charAt(0);

        comprobarConsumoEnergetico(consumoEnergetico);

        System.out.println("Ingrese peso (kg.): ");
        int peso = leer.nextInt();
        leer.nextLine();

        return new Electrodomestico(1000, color, consumoEnergetico, peso);
    }

    private String comprobarColor(String color) {
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            color = "blanco";
        }
        
        return color;
    }
    
    private char comprobarConsumoEnergetico(char letra) {
        if (letra < 'A' || letra > 'F') {
            letra = 'F';
        }
        
        return letra;
    }

    public int precioFinal(Electrodomestico e) {
        int precio = 0, precioPeso = 0;

        switch (e.getConsumoEnergetico()) {
            case 'A':
                precio = 1000;
                break;
            case 'B':
                precio = 800;
                break;
            case 'C':
                precio = 600;
                break;
            case 'D':
                precio = 500;
                break;
            case 'E':
                precio = 300;
                break;
            default:
                precio = 100;
        }

        int peso = e.getPeso();
        
        if (peso >= 1 && peso <= 19) {
            precioPeso = 100;
        } else if (peso >= 20 && peso <= 49) {
            precioPeso = 500;
        } else if (peso >= 50 && peso <= 79) {
            precioPeso = 800;
        } else if (peso >= 80) {
            precioPeso = 1000;
        }

        return precio + precioPeso;
    }
}