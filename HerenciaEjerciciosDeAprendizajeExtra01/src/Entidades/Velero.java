package Entidades;

public class Velero extends Barco {
    private int numeroMastiles;

    public Velero() {
    }

    public Velero(long matricula, double eslora, int añoFabricacion, int numeroMastiles) {
        super(matricula, eslora, añoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero | " + super.toString() + ", Número De Mástiles: " + numeroMastiles + ".";
    }
}