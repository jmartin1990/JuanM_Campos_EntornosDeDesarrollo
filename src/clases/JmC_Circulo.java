package clases;

public class JmC_Circulo {
    private int id;
    private double radio;
    private String color;
	
    /**
	 *Constructor por defecto (generado automáticamente)
	 */
	public JmC_Circulo() {
		// TODO Auto-generated constructor stub
	}

	/** Constructor con argumentos (generado automáticamente)
	 * @param id
	 * @param radio
	 * @param color
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

	// toString (generado automáticamente)
	
	@Override
	public String toString() {
		return "JmC_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
	}

    
    
    
}
