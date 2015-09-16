package coche.action;

import coche.DTO.Coche;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

public class CocheAction extends ActionSupport{
	Coche coche;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	
	public String execute() throws Exception {
		
		return SUCCESS;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	@Override
	public void validate() {
		
		if(coche.getMarca().equals("Ford")){
			addActionError("Ford no sirve, es americano!!!");
		}
		else {
			if(coche.getMatricula().length() < 8){
				addActionError("La matricula no puede tener menos de 8 caracteres!!!");
			}
		}
		
		if(coche.getMarca().equals("Ferrari")){
			addActionMessage("No Creo Que Tengas un Ferrari");
		}
		
		super.validate();
	}

	/**
	 * @return the coche
	 */
	public Coche getCoche() {
		return coche;
	}

	/**
	 * @param coche the coche to set
	 */
	@TypeConversion(converter="coche.conversor.ConversorCoche")
	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	
	
	
	
}

