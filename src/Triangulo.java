public class Triangulo implements Figura {
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this); // Este this hace referencia al objeto de la clase Triangulo
    }
}
