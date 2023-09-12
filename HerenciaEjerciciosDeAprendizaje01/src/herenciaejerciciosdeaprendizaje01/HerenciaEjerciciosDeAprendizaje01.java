package herenciaejerciciosdeaprendizaje01;

/*

1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.

La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.

Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:

*/

public class HerenciaEjerciciosDeAprendizaje01 {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Corbata", "Helado", 10, "Labrador");
        perro1.alimentarse();
        
        Animal gato1 = new Gato("Merluza", "Maruchan", 15, "Atigrado");
        gato1.alimentarse();
        
        Animal conejo1 = new Conejo("Buggs Bunny", "Zanahorias", 20, "Blanco");
        conejo1.alimentarse();
    }
}