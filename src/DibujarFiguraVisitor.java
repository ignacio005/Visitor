public class DibujarFiguraVisitor implements Visitor {
    @Override
    public void visitar(Circulo circulo) {
        System.out.println("Se ha dibujado un círculo de radio " + circulo.getRadio() + ".");
    }
    @Override
    public void visitar(Cuadrado cuadrado) {
        System.out.println("Se ha dibujado un cuadrado de lado " + cuadrado.getLado() + ".");
    }
    @Override
    public void visitar(Triangulo triangulo) {
        System.out.println("Se ha dibujado un triángulo de base " + triangulo.getBase() + " y de altura " + triangulo.getAltura() + ".");
    }
}
