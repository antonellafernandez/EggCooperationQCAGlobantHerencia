package Entidades;

public class Barco {
    protected long matricula;
    protected double eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(long matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int añoFabricacion) {
        this.anioFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Eslora: " + eslora + ", Año De Fabricación: " + anioFabricacion;
    }
}