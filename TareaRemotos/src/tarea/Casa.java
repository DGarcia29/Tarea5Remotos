package tarea;

import java.util.Scanner;

public class Casa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a crear una casa");
		
		//Crear hall
		System.out.println("Indica los datos de hall:");
		System.out.println("Cuántos m2 tiene el hall?");
		double m2hall = sc.nextDouble();
		System.out.println("Cuántas puertas tiene el hall?");
		int numPHall = sc.nextInt();
		System.out.println("Y cuántas ventanas?");
		int numV = sc.nextInt();
		
		Hall hall = new Hall("hall", m2hall, 1, 2, true);
		
		//Crear cocina
		System.out.println("Indica los datos de la cocina");
		System.out.println("Cuántos metros cuadrados tiene la cocina?");
		double m2cocina = sc.nextDouble();
		System.out.println("Cuántas puertas tiene?");
		int pCocina = sc.nextInt();
		System.out.println("Y ventanas?");
		int vCocina = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Tiene tendedero? (si/no)");
		boolean tend;
		double m2tend;
		String respuesta = sc.nextLine();
		if (respuesta.equalsIgnoreCase("si")) {
			tend = true;
			System.out.println("Cuántos m2 tiene?");
			m2tend = sc.nextInt();
		}else {
			tend = false;
			m2tend = 0;
		}
		
		Cocina cocina = new Cocina("Cocina", m2cocina, pCocina , vCocina , tend, m2tend);

		//Crear salon
		

			
		}
	
	
}
	
	


