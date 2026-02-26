//CuentaBancaria.java
// Clase que representa una cuenta bancaria

public class CuentaBancaria {

//atributos
private int numeroCuenta;
private String titularcuenta;
private double saldocuenta;
private static double tasaInteresAnual;

//constructores
public CuentaBancaria(int numeroCuenta, String titularcuenta, double saldocuenta) {
    setNumeroCuenta(numeroCuenta);
    setTitularcuenta(titularcuenta);
    setSaldocuenta(saldocuenta);

}

public CuentaBancaria() {
    this(numeroCuenta = 0, titularcuenta = "", saldocuenta = 0) ;
}
//métodos de acceso getters y setters
public void setNumeroCuenta(int numeroCuenta) {
    if (numeroCuenta > 0) {
        this.numeroCuenta = numeroCuenta;
    } else {
        this.numeroCuenta = 0; // Valor predeterminado para números de cuenta no válidos

    }
}
