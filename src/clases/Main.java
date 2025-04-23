package clases;

public class Main {
    public static void main(String[] args) {
        // Instancias
        JmC_Circulo circulo1 = new JmC_Circulo(1, 3.0, "verde");
        JmC_Rectangulo rectangulo1 = new JmC_Rectangulo(1, 3.0, 4.0, "rojo");

     // Cálculos (versión inicial sin métodos)
        double areaRect = rectangulo1.getLadoA() * rectangulo1.getLadoB();
        double areaCirc = circulo1.getRadio() * Math.PI;
        double diferencia = areaRect - areaCirc;

        // Impresión
        System.out.println("Área rectángulo: " + areaRect);
        System.out.println("Área círculo: " + areaCirc);
        System.out.println("Diferencia: " + diferencia);
        System.out.println("Rectángulo: " + rectangulo1);
        System.out.println("Círculo: " + circulo1);
    }
}
