package duoc.basededatos.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basededatos.main.base.BaseDeDatos;
import duoc.basededatos.main.dato.Dato;

public class BasededatosAgregar {

	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
		this.base.agregar(new Dato("Dato 1","Informacion del dato n1"));
	}

	@Test
	public void cuandoAgrega1EntoncesRetornaTrue() {
		boolean retorno = this.base.agregar(new Dato("Dato 2","Informacion del dato n2"));
		assertTrue(retorno);
	}
	
	@Test
	public void cuandoAgrega1ExistenteEntoncesRetornaFalse() {
		boolean retorno = this.base.agregar(new Dato("Dato 1","Informacion del dato n1"));
		assertFalse(retorno);
	}
	
	
		
	@Test
	public void cuandoAgrega1entoncesRetornaListazise2() {
		this.base.agregar(new Dato("Dato n6","Informacion del dato n6"));
		int largo = this.base.listar().size();
		assertTrue("Es " + largo + " pero deberia ser 0", largo == 2);
	}

}
