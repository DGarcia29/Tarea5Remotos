package tarea;

public class Salon extends Estancia {
	
	int numTomasRed;
	boolean terraza;
	double m2terraza;

	public Salon(String n, double m2, int numP, int numV, int tRed, boolean t, double m2t ) {
		super(n, m2, numP, numV);
		// TODO Auto-generated constructor stub
		this.numTomasRed = tRed;
		this.terraza = t;
		this.m2terraza = m2t;
	}
	
	@Override
	public double getMetrosCuadrados() {
		double metrosTotales = super.getMetrosCuadrados() + m2terraza;
		return metrosTotales;
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

	public String getTomasRed() {
		// TODO Auto-generated method stub
		return null;
	}

	public String isTerraza() {
		// TODO Auto-generated method stub
		return null;
	}

}
