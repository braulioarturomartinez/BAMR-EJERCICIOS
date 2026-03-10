// Base.java
//Clase base para la jerarquía de clases

public class base {

    //Atributos 
    public     int publico;
    private    int privado;
    protected  int protegido;
                int paquete; //sin modificador de acceso, es decir, tiene acceso dentro del mismo paquete
    
                //Constructor
    public base(int publico, int privado, int protegido, int paquete) {
        set Publico(publico);
        set Privado(privado);
        set Protegido(protegido);
        set Paquete(paquete);

        //met
        public void setPublico() {
            this.publico = publico;
    }
    
        public void setPrivado() {
            this.privado = privado;
    }

        public void setProtegido() {
            this.protegido = protegido;
    }

        public void setPaquete() {
            this.paquete = paquete;
    }

    public int getPublico() {
        return publico;
    }

    public int getPrivado() {
        return privado;
    }

    public int getProtegido() {
        return protegido;
    }

    public int getPaquete() {
        return paquete;
    }

    //sobrescritura de método toString() para mostrar los valores de los atributos
    @Override
    public String toString() {
        String resultado = String.format(
            format: "Base publico=%d, privado=%d, protegido=%d, paquete=%d", 
            publico, privado, protegido, paquete);

        return resultado;
    }
