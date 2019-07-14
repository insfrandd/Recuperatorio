package ar.edu.unlam.turnador;

import org.junit.Assert;
import org.junit.Test;

public class TurnadorTest {
	
	@Test
	public void testearQueSeCreeUnMontacargasConUnPesoMaximo() {
		Turnador miTurno = new Turnador(2);
		miTurno.obtenerTurnoActual();
		
		miTurno.entregarTurno();
		miTurno.atenderSiguiente();
		
		miTurno.entregarTurno();
		miTurno.atenderSiguiente();
		
		miTurno.entregarTurno();
		miTurno.atenderSiguiente();

		miTurno.entregarTurno();
		miTurno.entregarTurno();
		miTurno.entregarTurno();
		miTurno.atenderSiguiente();
		
		miTurno.obtenerTurnoActual();
		
		
		miTurno.contarTurnosAtendidos();
		
		Integer resultadoEsperado = 6;
		Integer resultadoObtenido = miTurno.contarTurnosEntregados();
		
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);

	}

}
