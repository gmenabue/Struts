package coche.DTO;

public class Coche {

	String marca;
	String matricula;
	
	
	public Coche(String marca, String matricula) {
		super();
		this.marca = marca;
		this.matricula = matricula;
	}


	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}


	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}


	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}


	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", matricula=" + matricula + "]";
	}
	
	
}
