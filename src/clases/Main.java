package clases;

public class Main {
    public static void main(String[] args) {
        // Instancias
        JmC_Circulo circulo1 = new JmC_Circulo(1, 3.0, "verde");
        JmC_Rectangulo rectangulo1 = new JmC_Rectangulo(1, 3.0, 4.0, "rojo");

        // Cálculos
        double areaRectangulo = calcularAreaRectangulo(rectangulo1);
        double areaCirculo = calcularAreaCirculo(circulo1);
        double diferencia = calcularDiferenciaAreas(areaRectangulo, areaCirculo);

        // Resultados
        imprimirResultados(rectangulo1, circulo1, diferencia);
    }

    public static double calcularAreaRectangulo(JmC_Rectangulo r) {
        return r.getLadoA() * r.getLadoB();
    }

    public static double calcularAreaCirculo(JmC_Circulo c) {
        return Math.PI * c.getRadio() * c.getRadio();
    }

    public static double calcularDiferenciaAreas(double area1, double area2) {
        return area1 - area2;
    }

    public static void imprimirResultados(JmC_Rectangulo r, JmC_Circulo c, double dif) {
        System.out.println("=== RESULTADOS ===");
        System.out.println("Área del rectángulo (" + r.getColor() + "): " + calcularAreaRectangulo(r));
        System.out.println("Área del círculo (" + c.getColor() + "): " + calcularAreaCirculo(c));
        System.out.println("Diferencia de áreas: " + dif);
        System.out.println("Datos rectángulo: " + r);
        System.out.println("Datos círculo: " + c);
    }
}
