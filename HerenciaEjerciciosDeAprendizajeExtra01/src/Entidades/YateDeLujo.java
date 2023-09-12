package Entidades;

public class YateDeLujo extends BarcoAMotor {
    private int numeroCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(long matricula, double eslora, int añoFabricacion, double potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, añoFabricacion, potenciaCV);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }
    
    @Override
    public String toString() {
        return "Yate De Lujo - " + super.toString() + ", Número De Camarotes: " + numeroCamarotes + ".";
    }
}