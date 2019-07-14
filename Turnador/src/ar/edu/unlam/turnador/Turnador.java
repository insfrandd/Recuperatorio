package ar.edu.unlam.turnador;

public class Turnador {
	
	private Integer cantidadMaximaDeTurnos;
	private Turno turno;
	private Integer turnosDados;
	private Integer turnosAtendidos;	

	public Turnador(Integer cantidadMaximaDeTurnos) {
		this.cantidadMaximaDeTurnos = cantidadMaximaDeTurnos;
		this.turno = new Turno();
		this.turnosDados = 0;
		this.turnosAtendidos = 0;
		
	}
	
	public Integer obtenerTurnoActual(){
		//*System.out.print(this.turno.getTurno() + "\n");
		return this.turno.getTurno();
		
	}
	
	public Integer entregarTurno(){
		this.turnosDados = this.turnosDados + 1;
		this.turno.aumentarTurno();
		return this.turno.getTurno();		
	}
	
	public Integer atenderSiguiente(){
		this.turno.aumentarTurno();
		this.turnosAtendidos = this.turnosAtendidos + 1;
		if (this.turno.getTurno() == this.cantidadMaximaDeTurnos) {
			this.turno.setTurnoInicial();
		}
		this.turno.setTurno(this.turnosAtendidos);
		//*System.out.println("Se dio el turno: " + this.turno.getTurno() + "\n");
		return this.turno.getTurno();
		
	}
	
	public Integer contarTurnosEntregados(){
		//*		System.out.println("Turnos dados = " + this.turnosDados + "\n");
		//*		System.out.println("Turnos en Espera = " + (this.turnosDados - this.turnosAtendidos)  + "\n");
		return (this.turnosDados);			
	}
	
	public Integer contarTurnosAtendidos(){
		//*		System.out.println("Turnos Atendidos = " + turnosAtendidos + "\n");
		return (turnosAtendidos);			
	}
	

}
