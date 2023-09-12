package herenciaejerciciosdeaprendizaje04;

/*

4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.

Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.

Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.

Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

*/

import Entidades.Circulo;
import Entidades.Rectangulo;
import Servicios.CirculoService;
import Servicios.RectanguloService;
import java.util.ArrayList;
import java.util.Scanner;
import Interfaces.ICalculosFormas;

public class HerenciaEjerciciosDeAprendizaje04 {
    public static void main(String[] args) {
        CirculoService cs = new CirculoService();
        RectanguloService rs = new RectanguloService();
        
        Circulo c = cs.crearCirculo();
        
        System.out.println('\n' + "ÁreaC = " + c.calcularArea() + '\n'
            + "PerímetroC = " + c.calcularPerimetro() + '\n');
        
        Rectangulo r = rs.crearRectangulo();
        
        System.out.println('\n' + "ÁreaR = " + r.calcularArea() + '\n'
            + "PerímetroR = " + r.calcularPerimetro());
    }
}