package tarea;

public class Bano extends Estancia {
	//si no tiene ducha, tiene bañera
	boolean ducha;
	
	public Bano(String n, double m2, int numP, int numV, boolean d) {
		super(n, m2, numP, numV);
		// TODO Auto-generated constructor stub
		this.ducha = d;
	}
	
	@Override
	public double getMetrosCuadrados() {
		// TODO Auto-generated method stub
		return super.getMetrosCuadrados();
	}
}
