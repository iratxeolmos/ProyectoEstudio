package recuento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class recuentoHorasMap {

	private int horasTotales;
	private Map<Integer,Integer> historialHoras; //Número semana, número de horas estudiadas
	
	public recuentoHorasMap() {
		this.horasTotales=0;
		this.historialHoras = new HashMap<>();
	}	
	
	public void nuevosDatos(Scanner sc) {
		System.out.println("\n¿Qué número de la semana quieres registrar?;");
		int numeroSemana = sc.nextInt();
		
		System.out.println("Introduce las horas estudiadas en la Semana " + numeroSemana + ":");
		int nuevasHoras = sc.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		recuentoHorasMap miEstudio = new recuentoHorasMap();
		
	}
		
	
	
}
