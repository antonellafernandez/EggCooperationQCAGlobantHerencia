package Entidades;

public class BarcoAMotor extends Barco {
    protected double potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(long matricula, double eslora, int añoFabricacion, double potenciaCV) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "Barco A Motor | " + super.toString() + ", Potencia: " + potenciaCV + "CV.";
    }
}