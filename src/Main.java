public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Cuadrado cuadrado = new Cuadrado(20);
        Triangulo triangulo = new Triangulo(7, 12);

        // Se crean visitantes
        CalculadoraAreaVisitor areaVisitor = new CalculadoraAreaVisitor();
        DibujarFiguraVisitor figuraVisitor = new DibujarFiguraVisitor();

        // Se utiliza el método aceptar para aplicar los visitantes a las figuras
        System.out.println("Áreas calculadas: ");
        circulo.aceptar(areaVisitor);
        cuadrado.aceptar(areaVisitor);
        triangulo.aceptar(areaVisitor);

        System.out.println("\nFiguras creadas: ");
        circulo.aceptar(figuraVisitor);
        cuadrado.aceptar(figuraVisitor);
        triangulo.aceptar(figuraVisitor);
    }
}