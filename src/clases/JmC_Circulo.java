package clases;

/**
 * Clase que representa un círculo con radio, color e ID.
 * @author Juan Campos
 * @version 1.0
 */

public class JmC_Circulo {
	 // Atributos
    private int id;
    private double radio;
    private String color;
	
    /**
	 *Constructor por defecto (generado automáticamente). Crea un círculo con valores predeterminados.
	 */
	public JmC_Circulo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parámetros. (generado automáticamente)
     * @param id Identificador único del círculo (entero).
     * @param radio Longitud del radio (en unidades métricas, ej: cm).
     * @param color Color del círculo (ej: "verde").
	 */
	public JmC_Circulo(int id, double radio, String color) {
		this.id = id;
		this.radio = radio;
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
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
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
	 * Calcula el área del círculo (π * radio²).
     * @return Área en unidades cuadradas (ej: cm²).
	 */
	public double calcularArea() {
	    return Math.PI * this.radio * this.radio;
	}
	
	// toString (generado automáticamente)
	
	@Override
	public String toString() {
		return "JmC_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
	}

    
    
    
}
