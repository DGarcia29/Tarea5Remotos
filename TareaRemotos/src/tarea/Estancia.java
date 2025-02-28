package tarea;

public class Estancia {

	String nombre;
	double metrosCuadrados;
	int numPuertas;
	int numVentanas;
	
	public Estancia (String n, double m2, int numP, int numV) {
		this.nombre = n;
		this.metrosCuadrados = m2;
		this.numPuertas = numP;
		this.numVentanas = numV;
		
	}
	
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
}
