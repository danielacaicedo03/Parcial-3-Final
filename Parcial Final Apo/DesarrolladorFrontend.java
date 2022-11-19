// creamos la clase de tipo objeto 
public class DesarrolladorFrontend extends Empleado implements OperacionEmpleado {


		//variable entero
		int aniosExperienciaBootstrap;
		
		//variable boolean
		boolean experienciaCloud;
		
		//constante de visibilidad "privada"
		private double AUMENTOVARIABLE = 3;

		//getter and setter)
		public int getAniosExperienciaBootstrap() {
			return aniosExperienciaBootstrap;
		}

		public void setAniosExperienciaBootstrap(int aniosExperienciaBootstrap) {
			this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
		}

		public boolean isExperienciaCloud() {
			return experienciaCloud;
		}

		public void setExperienciaCloud(boolean experienciaCloud) {
			this.experienciaCloud = experienciaCloud;
		}

		// constructor por defecto
		public DesarrolladorFrontend() {
		}

		//método constructor con los atributos
		public DesarrolladorFrontend(int aniosExperienciaBootstrap, boolean experienciaCloud) {
			this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
			this.experienciaCloud = experienciaCloud;
		}

		public char[] devolverSalario() {
			
			return null;
		}

		public double getAUMENTOVARIABLE() {
			return AUMENTOVARIABLE;
		}

		public void setAUMENTOVARIABLE(double aUMENTOVARIABLE) {
			AUMENTOVARIABLE = aUMENTOVARIABLE;
		}

		@Override
		public double devolversalario() {
			
			Salario = SALARIO_MINIMO + AUMENTOVARIABLE;
			Salario = DESCUENTO_EPS + DESCUENTO_FP;
			Salario = Salario/100;
			return Salario;
		}

		

		
		
		
	}