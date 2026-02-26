//Rectangulo. java
// Clase que representa un rectángulo.

public class Rectangulo {
    //Atributos
    private double ancho;
    private double alto;

    //Constructores
    public Rectangulo( double ancho, double alto) {
        setAncho(ancho);
        setAlto(alto);
    }

    public Rectangulo() {
        this(1.0, 1.0); // Llama al constructor con parámetros por defecto


        // Métodos de acceso (getters y setters)
        public void setAncho(double ancho) {
            if (ancho > 0.0) {
                this.ancho = ancho;
            } else {
                this.ancho = 1.0; // Valor por defecto si el ancho no es válido
            }


        public double setAlto(double alto) {
            if (alto > 0.0) {
                this.alto = alto;
            } else {
                this.alto = 1.0; // Valor por defecto si el alto no es válido
            }

        
            public double getAncho() {
            return ancho;
        }

        public double getAlto() {
            return alto;
        }

        // Métodos para calcular el área 
        public double getArea() {
            return ancho * alto;
        }

        // Método para calcular el perímetro
        public double getPerimetro() {
            return 2 * (ancho + alto);
}

// Sobrescribir el método toString para mostrar la información del rectángulo
@Override
public String toString() {
    return String.format("Rectángulo: Ancho = %.2f, Alto = %.2f, Área = %.2f, Perímetro = %.2f",
            ancho, alto);
}
