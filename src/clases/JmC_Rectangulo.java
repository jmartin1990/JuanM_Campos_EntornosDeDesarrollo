package clases;

/**
 * Clase que representa un rectángulo con lados A y B, color e ID.
 * @author Juan Campos
 * @version 1.0
 */

//Atributos

public class JmC_Rectangulo {
	private int id;
    private double ladoA;
    private double ladoB;
    private String color;
	
    /**
	 * Constructor por defecto (generado automáticamente). Crea un rectángulo con valores predeterminados.
	 */
    
	public JmC_Rectangulo() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor con parámetros. (generado automáticamente)
     * @param id Identificador único del rectángulo (entero).
     * @param ladoA Longitud del lado A (en unidades métricas, ej: cm).
     * @param ladoB Longitud del lado B (en unidades métricas, ej: cm).
     * @param color Color del rectángulo (ej: "rojo").
	 */
	
	public JmC_Rectangulo(int id, double ladoA, double ladoB, String color) { /*AQUI AUNQUE EL METOD TIENE EL MISMO NOMBRE LE PASO COMO PARAMETRO ALGO COMO UN ID YA NO ES LO MISMO METODO YA QUE ESTOY HACIENDO UNA SOBRECARGA ME METODOS Y AY NO SERIA LO MISMO*/
		this.id = id;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.color = color;
	}

	// Getters y setters (generados automáticamente)
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the ladoA
	 */
	public double getLadoA() {
		return ladoA;
	}

	/**
	 * @param ladoA the ladoA to set
	 */
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	/**
	 * @return the ladoB
	 */
	public double getLadoB() {
		return ladoB;
	}

	/**
	 * @param ladoB the ladoB to set
	 */
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Calcula el área del rectángulo (ladoA * ladoB).
     * @return Área en unidades cuadradas (ej: cm²). 
	 */
	
	public double calcularArea() {
	    return this.ladoA * this.ladoB;
	}

	// toString (generado automáticamente)
	@Override
	public String toString() {
		return "JmC_Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
	}
    
	
    
}
