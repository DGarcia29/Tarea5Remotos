package tarea;

public class Hall extends Estancia {

	boolean puertaBlindada;
	public Hall(String n, double m2, int numP, int numV, boolean pBlind) {
		super(n, m2, numP, numV);
		// TODO Auto-generated constructor stub
		this.puertaBlindada = pBlind;
	}
	
	@Override
	public double getMetrosCuadrados() {
		// TODO Auto-generated method stub
		return super.getMetrosCuadrados();
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumPuertas() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumVentanas() {
		// TODO Auto-generated method stub
		return null;
	}

	public String isBlindada() {
		// TODO Auto-generated method stub
		return null;
	}
}
