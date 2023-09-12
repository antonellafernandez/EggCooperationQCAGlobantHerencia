package Entidades;

import Interfaces.ICalculosFormas;

public class Circulo implements ICalculosFormas {
    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public double calcularArea() {
        return Math.round(PI * Math.pow(radio, 2));
    }
    
    @Override
    public double calcularPerimetro() {
        return Math.round(PI * diametro);
    }
}