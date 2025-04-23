package clases;

public class Main {
    public static void main(String[] args) {
        // Instancias
        JmC_Circulo circulo1 = new JmC_Circulo(1, 3.0, "verde");
        JmC_Rectangulo rectangulo1 = new JmC_Rectangulo(1, 3.0, 4.0, "rojo");

     // Cálculos (versión inicial sin métodos)
        double areaRect = calcularAreaRectangulo(rectangulo1);
        double areaCirc = calcularAreaCirculo(circulo1);
        double diferencia = calcularDiferenciaAreas(areaRect, areaCirc);

        // Impresión
        System.out.println("Área rectángulo: " + areaRect);
        System.out.println("Área círculo: " + areaCirc);
        System.out.println("Diferencia: " + diferencia);
        System.out.println("Rectángulo: " + rectangulo1);
        System.out.println("Círculo: " + circulo1);
    }

	public static double calcularDiferenciaAreas(double areaRect, double areaCirc) {
		double diferencia = areaRect - areaCirc;
		return diferencia;
	}

	public static double calcularAreaRectangulo(JmC_Rectangulo rectangulo1) {
		double areaRect = rectangulo1.getLadoA() * rectangulo1.getLadoB();
		return areaRect;
	}

	public static double calcularAreaCirculo(JmC_Circulo circulo1) {
		double areaCirc = circulo1.getRadio() * Math.PI;
		return areaCirc;
	}
}
