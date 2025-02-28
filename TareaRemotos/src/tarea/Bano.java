package tarea;

public class Bano extends Estancia {
	//si no tiene ducha, tiene bañera
	String baneraOducha;
	
	public Bano(String n, double m2, int numP, int numV, String baneraODucha) {
		super(n, m2, numP, numV);
		// TODO Auto-generated constructor stub
		this.baneraOducha = baneraODucha;
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

	public String getBanieraDucha() {
		// TODO Auto-generated method stub
		return null;
	}
}
