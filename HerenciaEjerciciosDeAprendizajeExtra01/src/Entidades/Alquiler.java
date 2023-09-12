package Entidades;

import java.time.LocalDate;

public class Alquiler {
    private String nombre;
    private long dni;
    private LocalDate fechaAlquiler, fechaDevolucion;
    private int posAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, long dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "======== Alquiler ========" + '\n'
                + "Nombre: " + nombre + '\n'
                + "DNI: " + dni + '\n'
                + "Fecha Alquiler: " + fechaAlquiler + '\n'
                + "Fecha Devolución: " + fechaDevolucion + '\n'
                + "Posición Amarre: " + posAmarre + '\n'
                + "Barco: " + barco.toString() + '\n';
    }
}