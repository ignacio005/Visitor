public class Cuadrado implements Figura {
    private double lado;
    public Cuadrado(double lado){
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this); // Este this hace referencia al objeto de la clase Cuadrado
    }
}
