package recuento;

public class RecuentoHorasEstudio {
	
	int horasPorSemana;
	int horasTotales;
	
	public RecuentoHorasEstudio (int horasPorSemana, int horasTotales) {
		this.horasPorSemana = horasPorSemana;
		this.horasTotales = horasTotales;
		
	}
	
	public void mostrarEstadisticas() {
		System.out.println("Has estudiado " + horasPorSemana + " esta semana y en total del curso " + horasTotales + " horas." );
	}
	
	public static void main(String[] args) {
		RecuentoHorasEstudio miEstudio = new RecuentoHorasEstudio (17, 17);
		miEstudio.mostrarEstadisticas();
		
	}
}
