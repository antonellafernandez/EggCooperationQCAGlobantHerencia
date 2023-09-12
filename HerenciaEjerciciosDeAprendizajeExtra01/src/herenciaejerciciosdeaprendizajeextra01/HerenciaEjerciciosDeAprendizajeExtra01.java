package herenciaejerciciosdeaprendizajeextra01;

/*

1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.

Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.

Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:

• Número de mástiles para veleros.

• Potencia en CV para barcos a motor.

• Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.

Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.

*/

import Entidades.Alquiler;
import Servicios.AlquilerService;
import java.util.HashMap;
import java.util.Scanner;

public class HerenciaEjerciciosDeAprendizajeExtra01 {

    public static Scanner leer = new Scanner(System.in);
    public static HashMap<Alquiler, Double> alquileres = new HashMap<>();

    public static void main(String[] args) {
        AlquilerService as = new AlquilerService();

        int opcion = -1;

        while (opcion != 0) {
            System.out.println("==================== MENÚ ====================" + '\n'
                    + "0 - Salir" + '\n'
                    + "1 - Crear Alquiler" + '\n'
                    + "2 - Mostrar Alquileres" + '\n'
                    + "==============================================");

            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                case 1:
                    Alquiler a = as.crearAlquiler();
                    boolean existe = alquileres.containsKey(a);

                    if (existe) {
                        System.out.println("Lo sentimos, el amarre ya ha sido alquilado.");
                    } else {
                        double valorAlquiler = as.calcularAlquiler(a);
                        System.out.println("El amarre se ha alquilado con éxito." + '\n'
                                + "El valor del alquiler es de $" + valorAlquiler);
                        alquileres.put(a, valorAlquiler);
                    }
                    break;
                case 2:
                    if (alquileres.size() == 0) {
                        System.out.println("No hay alquileres para mostrar.");
                    } else {
                        mostrarAlquileres();
                    }
                    break;
                default:
                    System.out.println("¡La opción ingresada no es válida!");
            }
        }
    }

    public static void mostrarAlquileres() {
        for (HashMap.Entry<Alquiler, Double> entry : alquileres.entrySet()) {
            Alquiler a = entry.getKey();
            double valorA = entry.getValue();
            System.out.println(a.toString() + '\n'
                + "Valor Alquiler: $" + valorA + '\n'
                + "==========================");
        }
    }
}