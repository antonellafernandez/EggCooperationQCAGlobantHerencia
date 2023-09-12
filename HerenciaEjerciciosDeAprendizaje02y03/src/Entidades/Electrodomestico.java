package Entidades;

import java.util.Scanner;

public class Electrodomestico {
    Scanner leer = new Scanner(System.in);
    
    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Electrodomestico | Precio = $" + precio + ", Color = " + color + ", Consumo Energético = " + consumoEnergetico + ", Peso = " + peso + "kg.";
    } 
}