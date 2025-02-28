package tarea;

public class Habitacion extends Estancia{

	int numPuertasArm;
	boolean accesoAseo;
	public Habitacion(String n, double m2, int numP, int numV, int pArm, boolean aseo) {
		super(n, m2, numP, numV);
		// TODO Auto-generated constructor stub
		this.numPuertasArm = pArm;
		this.accesoAseo = aseo;
	}
	
	@Override
	public double getMetrosCuadrados() {
		return super.getMetrosCuadrados();
				
	}

}
