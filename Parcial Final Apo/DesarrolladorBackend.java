import java.util.ArrayList;
// clase publica con herencia de la clase empleado
public class DesarrolladorBackend extends Empleado{
	private String skill;
	private ArrayList<String> listaLenguajes = new ArrayList<String>();
// atributos 
	
private int aniosExperienciaBootstrap;
private boolean experienciaCloud;

// agregamos las constantes 

private double AUMENTO_VARIABLE = 5;

// metodo get and set 
/**
 * @return the aniosExperienciaBootstrap
 */
public int getAniosExperienciaBootstrap() {
	return aniosExperienciaBootstrap;
}

/**
 * @param aniosExperienciaBootstrap the aniosExperienciaBootstrap to set
 */
public void setAniosExperienciaBootstrap(int aniosExperienciaBootstrap) {
	this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
}

/**
 * @return the experienciaCloud
 */
public boolean isExperienciaCloud() {
	return experienciaCloud;
}

/**
 * @param experienciaCloud the experienciaCloud to set
 */
public void setExperienciaCloud(boolean experienciaCloud) {
	this.experienciaCloud = experienciaCloud;
}

/**
 * @return the aUMENTO_VARIABLE
 */
public double getAUMENTO_VARIABLE() {
	return AUMENTO_VARIABLE;
}

/**
 * @param aUMENTO_VARIABLE the aUMENTO_VARIABLE to set
 */
public void setAUMENTO_VARIABLE(double aUMENTO_VARIABLE) {
	AUMENTO_VARIABLE = aUMENTO_VARIABLE;
}
// constructor por defecto 

public DesarrolladorBackend() {
}

public DesarrolladorBackend(String skill, ArrayList<String> listaLenguajes) {
	this.setSkill(skill);
	this.setListaLenguajes(listaLenguajes);
}
	
	public double devolverSalario() {
		
		Salario = SALARIO_MINIMO + AUMENTO_VARIABLE;
		Salario = DESCUENTO_EPS + DESCUENTO_FP;
		Salario = Salario/100;
		return Salario;
		
	}

	public ArrayList<String> getListaLenguajes() {
		return listaLenguajes;
	}

	public void setListaLenguajes(ArrayList<String> listaLenguajes) {
		this.listaLenguajes = listaLenguajes;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}




 
				
	
	
	
}



