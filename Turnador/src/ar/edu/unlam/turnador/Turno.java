package ar.edu.unlam.turnador;

public class Turno {
	
	private Integer numeroDeTurno;
	
	public Turno(){
		this.numeroDeTurno = 0;		
	}
	
	public Integer getTurno(){
		return this.numeroDeTurno;
	}
	
	public void setTurno(Integer numeroDeTurno){
		this.numeroDeTurno = numeroDeTurno;
	}
	
	public Integer aumentarTurno(){
		this.numeroDeTurno = this.numeroDeTurno + 1 ;
		return this.numeroDeTurno;
	}
	
	public Integer setTurnoInicial(){
		this.numeroDeTurno = 0;	
		return this.numeroDeTurno;
	}

}
