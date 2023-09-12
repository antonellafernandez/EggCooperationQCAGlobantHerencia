package Entidades;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int precio, String color, char consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Carga = " + carga + "kg.";
    } 
}