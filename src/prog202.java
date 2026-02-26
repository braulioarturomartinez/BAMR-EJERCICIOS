// prog202.java
// Programa principal para probar la clase Rectangulo.

import java.util.Scanner;

public class prog202 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("aplicacion para probar la clase Rectangulo");
        System.out.println();
        System.out.println();

        // solicitar los datos del primer rectángulo
        System.out.println("Proporcione los datos del primer rectángulo:");
        System.out.print("Ancho: ");
        double ancho = entrada.nextDouble();
        System.out.print("Alto: ");
        double alto = entrada.nextDouble();

        Rectangulo rect1 = new Rectangulo(ancho, alto);
        System.out.println(rect1);

        // solicitar los datos del segundo rectángulo
        System.out.println("Proporcione los datos del segundo rectángulo:");
        System.out.print("Ancho: ");
        double ancho2 = entrada.nextDouble();
        System.out.print("Alto: ");
        double alto2 = entrada.nextDouble();

        // Crear el segundo rectángulo utilizando el constructor por defecto y luego establecer los valores
        Rectangulo rect2 = new Rectangulo();
        rect2.setAncho(ancho2);
        rect2.setAlto(alto2);

        // Mostrar la informacion de ambos rectángulos
        System.out.println("Información del primer rectángulo:");
        System.out.printf(format: "%s, Área = %.2f, Perímetro = %.2f%n", rect1, rect1.getArea(), rect1.getPerimetro());

        System.out.println("Información del segundo rectángulo:");
        System.out.printf(format: "%s, Área = %.2f, Perímetro = %.2f%n", rect2, rect2.getArea(), rect2.getPerimetro());

        entrada.close();
    }

}
