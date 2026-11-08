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
		
		if(historialHoras.containsKey(numeroSemana)) {
			int horasAntiguas = historialHoras.get(numeroSemana);
			horasTotales -= horasAntiguas;
			System.out.println("Se han actualizado las horas de la Semana " + numeroSemana);
			
			this.historialHoras.put(numeroSemana, nuevasHoras);
			this.horasTotales += nuevasHoras;
			
			System.out.println("Guardadas con éxito las hora de la semana " + numeroSemana);
		}
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		recuentoHorasMap miEstudio = new recuentoHorasMap();
		
	}
		
	
	
}
