

// creamos la clase de tipo objeto 
public class Empleado {

	// creamos los siguientes atributos privados
	private String Nombre;
	private String Apellidos;
	private String Direccion;
	int Dni=0;
	double Salario;
	private String sexo;
	
	//Agregamos las constantes de visibilidad protected 
	
	protected double SALARIO_MINIMO = 980000;
	protected double DESCUENTO_EPS = 4;
	protected double DESCUENTO_FP = 4;
	
	// con todos los atributos agregamos el constructor 
public Empleado(String Nombre, String Apellidos, String Direccion, int Dni, int Salario, String sexo) {
		
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Direccion = Direccion;
		this.Dni = Dni;
		this.Salario = Salario;
		this.sexo = sexo;		
	}
	// b.	Con los atributos Nombre, Apellidos, Direccion , DNI, Salario 
	
public Empleado(String Nombre, String Apellidos, String Direccion, int Dni, int Salario) {
	
	this.Nombre = Nombre;
	this.Apellidos = Apellidos;
	this.Direccion = Direccion;
	this.Dni = Dni;
	this.Salario = Salario;
}

// c.	Constructor con los atributos Direccion , DNI, sexo 

public Empleado(String Direccion, int Dni, String sexo) {
	
	this.Direccion = Direccion;
	this.Dni = Dni;
	this.sexo= sexo;
}
	
	// D. constructor 
	
	public Empleado(String Nombre, String Apellidos, int Dni, int Salario, String sexo) {
		
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Dni = Dni;
		this.Salario = Salario;
		this.sexo = sexo;
	}
		// vacio 
		public Empleado() {}


	//creamos los metodos constructores 
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
	
	

	
	
	
	
	
	
	

