package duoc.basededatos.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basededatos.main.base.BaseDeDatos;
import duoc.basededatos.main.dato.Dato;

public class BasededatosEliminar {

	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
		this.base.agregar(new Dato("DATO n1","Informacion del dato n1"));
		this.base.agregar(new Dato("DATO n2","Informacion del dato n2"));
		this.base.agregar(new Dato("DATO n3","Informacion del dato n3"));
		this.base.agregar(new Dato("DATO n4","Informacion del dato n4"));
		this.base.agregar(new Dato("DATO n5","Informacion del dato n5"));
		
		
	}

	@Test
	public void cuandoElimina1EntoncesRetorna4() {
		this.base.eliminar("DATO n3");
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 4",largo == 4);
	}
	@Test
	public void cuandoElimina1EntoncesRetornaTrue() {
		boolean respuesta = this.base.eliminar("DATO n3");
		assertTrue(respuesta);
	}
	@Test
	public void cuandoNoEliminaEntoncesRetornaFalse() {
		boolean respuesta = this.base.eliminar("DATO n6");
		assertFalse(respuesta);
	}

}
