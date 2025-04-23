package clases;


/**
 * Clase principal que demuestra el cálculo de áreas de figuras geométricas.
 * @author Juan Martínez Campos
 * @version 1.0 
 */

public class Main {
    // Constantes para evitar números mágicos (9.8)
    private static final int ID_FIGURA = 1;
    private static final double RADIO_CIRCULO = 3.0;
    private static final double LADO_A_RECTANGULO = 3.0;
    private static final double LADO_B_RECTANGULO = 4.0;
    private static final String COLOR_VERDE = "verde";
    private static final String COLOR_ROJO = "rojo";

    /**
     * Método principal que ejecuta el programa.
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Instancias con constantes
        JmC_Circulo circulo1 = new JmC_Circulo(ID_FIGURA, RADIO_CIRCULO, COLOR_VERDE);
        JmC_Rectangulo rectangulo1 = new JmC_Rectangulo(
            ID_FIGURA, 
            LADO_A_RECTANGULO, 
            LADO_B_RECTANGULO, 
            COLOR_ROJO
        );
        
        // Cálculos
        double areaRectangulo = rectangulo1.calcularArea(); // Usa el método de JmC_Rectangulo
        double areaCirculo = circulo1.calcularArea(); // Usa el método de JmC_Circulo
        double diferencia = calcularDiferenciaAreas(areaRectangulo, areaCirculo);

        // Resultados
        imprimirResultados(rectangulo1, circulo1, diferencia);
    }

    /**
     * Calcula la diferencia entre dos áreas.
     * @param area1 Primera área (en unidades cuadradas).
     * @param area2 Segunda área (en unidades cuadradas).
     * @return Diferencia (area1 - area2). 
     */
    public static double calcularDiferenciaAreas(double area1, double area2) {
        return area1 - area2;
    }

    /**
     * Imprime los resultados de los cálculos.
     * @param r Rectángulo a mostrar.
     * @param c Círculo a mostrar.
     * @param dif Diferencia de áreas. 
     */
    public static void imprimirResultados(JmC_Rectangulo r, JmC_Circulo c, double dif) {
        System.out.println("=== RESULTADOS ===");
        System.out.println("Área del rectángulo (" + r.getColor() + "): " + r.calcularArea()); // Estaba llamando a los métodos obsoletos calcularAreaRectangulo(r)
        System.out.println("Área del círculo (" + c.getColor() + "): " + c.calcularArea());     // Estaba llamando a los métodos obsoletos calcularAreaCirculo(c)),
        System.out.println("Diferencia de áreas: " + dif);
        System.out.println("Datos rectángulo: " + r);
        System.out.println("Datos círculo: " + c);
    }
}
