// Clase Punto que representa un punto en el plano cartesiano
// Contiene atributos para las coordenadas x e y, así como métodos para acceder y modificar estos atributos. 

public class Punto { 
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular la distancia entre este punto y otro punto
    public double distancia(Punto otro) 
    {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);

}
//sobrescribir el metodo toString para mostrar el punto de forma legible
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
