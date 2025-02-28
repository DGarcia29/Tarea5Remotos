package tarea;

public class Cocina extends Estancia {

	boolean tendedero;
	double m2tendedero;
	
	public Cocina(String n, double m2, int numP, int numV, boolean t, double m2tend) {
		super(n, m2, numP, numV);
		// TODO Auto-generated constructor stub
		this.tendedero = t;
		this.m2tendedero = m2tend;
	}
	
	@Override
	public double getMetrosCuadrados() {
		double metrosTotales = super.getMetrosCuadrados() + m2tendedero;
		return metrosTotales;
		
	}

}
