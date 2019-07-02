package duoc.basededatos.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basededatos.main.base.BaseDeDatos;
import duoc.basededatos.main.dato.Dato;

public class BasededatosListar {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@Test
	public void cuandoNoAgregaEntoncesRetornaListaSize0() {
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 0", largo == 0);
	}
	@Test
	public void cuandoAgrega1EntoncesRetornaListaSize1() {
		this.base.agregar(new Dato("DATO n2","Informacion del dato n2"));
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 1", largo == 1);
	}
	@Test
	public void cuandoAgrega5EntoncesRetornaListaSize5() {
		this.base.agregar(new Dato("DATO n1","Informacion del dato n1"));
		this.base.agregar(new Dato("DATO n2","Informacion del dato n2"));
		this.base.agregar(new Dato("DATO n3","Informacion del dato n3"));
		this.base.agregar(new Dato("DATO n4","Informacion del dato n4"));
		this.base.agregar(new Dato("DATO n5","Informacion del dato n5"));
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 5", largo == 5);
	}

}
