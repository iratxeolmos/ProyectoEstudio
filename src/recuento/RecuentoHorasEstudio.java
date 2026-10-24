package recuento;

import java.util.Scanner;

public class RecuentoHorasEstudio {
	
	
	private int horasPorSemana;
	private int horasTotales;
	private int[] historialHoras;
	
	public RecuentoHorasEstudio () {
		this.horasPorSemana = 0;
		this.horasTotales = 0;
		this.historialHoras = new int[0];
		
	}
	
	//si ponía public static void no podía usar "this"
	public void nuevosDatos(Scanner sc) {
		System.out.println("Introduce las horas que has estudiado esta semana: ");
		int nuevasHoras = sc.nextInt();
		
		this.horasPorSemana = nuevasHoras;
		this.horasTotales += nuevasHoras;
		
		int[] nuevoArray = new int[this.historialHoras.length + 1];
		
		for (int i = 0; i < this.historialHoras.length; i++) {
			nuevoArray[i] = this.historialHoras[i];
		}
		
		nuevoArray[nuevoArray.length - 1] = nuevasHoras;
		this.historialHoras = nuevoArray;
		
	}
	
	public void mostrarEstadisticas() {
		System.out.println("Has estudiado " + horasPorSemana + " horas esta semana y en total del curso " + horasTotales + " horas." );
		
		System.out.print("Historial guardado en el array: [");
		for (int i = 0; i < this.historialHoras.length; i++) {
			System.out.print(historialHoras[i]);
			if(i < historialHoras.length - 1){
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		RecuentoHorasEstudio miEstudio = new RecuentoHorasEstudio ();
		
		miEstudio.nuevosDatos(sc);
		miEstudio.mostrarEstadisticas();
		
		sc.close();
		
	}
}

