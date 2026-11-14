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

	
	public void buscarSemana(Scanner sc) {
		System.out.println("\n¿Qué número de semana quieres consultar?: ");
		int semanaBuscada = sc.nextInt();
		
		if(historialHoras.containsKey(semanaBuscada)) {
			int horas = historialHoras.get(semanaBuscada);
			System.out.println("En esa semana estudiaste " + horas + " horas.\n");
		}else {
			System.out.println("No hay un registro de la semana " + semanaBuscada + ".\n");
		
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		recuentoHorasMap miEstudio = new recuentoHorasMap();
		
		int opcion;
		do {
			System.out.println("\n--- MENÚ RECUENTO DE HORAS ---");
			System.out.println("1. Registrar / Actualizar horas");
			System.out.println("2. Buscar semana");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
				case 1:
					miEstudio.nuevosDatos(sc);
					break;
				case 2:
					miEstudio.buscarSemana(sc);
					break;
				case 3:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción no válida.");
			}
		} while (opcion != 3);

		
		sc.close();
		
	}
		
	
	
}
