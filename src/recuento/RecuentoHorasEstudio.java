package recuento;

import java.util.Scanner;

public class RecuentoHorasEstudio {
	
	
	private int horasPorSemana;
	private int horasTotales;
	
	public RecuentoHorasEstudio (int horasPorSemana, int horasTotales) {
		this.horasPorSemana = horasPorSemana;
		this.horasTotales = horasTotales;
		
	}
	
	//si puenia public static void no podía usar "this"
	public void nuevosDatos(Scanner sc) {
		System.out.println("Introduce las horas que has estudiado esta semana: ");
		int nuevasHoras = sc.nextInt();
		
		this.horasPorSemana = nuevasHoras;
		this.horasTotales += nuevasHoras;
		
	}
	
	public void mostrarEstadisticas() {
		System.out.println("Has estudiado " + horasPorSemana + " horas esta semana y en total del curso " + horasTotales + " horas." );
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		RecuentoHorasEstudio miEstudio = new RecuentoHorasEstudio (17, 17);
		
		miEstudio.nuevosDatos(sc);
		miEstudio.mostrarEstadisticas();
		
		sc.close();
		
	}
}

