package duoc.basededatos.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basededatos.main.base.BaseDeDatos;
import duoc.basededatos.main.dato.Dato;

public class BasededatosModificar {
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
	public void cuandoModificaEntoncesRetornaTrue() {
		boolean resultado = this.base.modificar(new Dato("DATO n3", "MODIFICANDO DATO n 3"));
		assertTrue(resultado);
	}
	@Test
	public void cuandoNoModificaEntoncesRetornaFalse() {
		boolean resultado = this.base.modificar(new Dato("DATO n6", "MODIFICANDO DATO n 6"));
		assertFalse(resultado);
	}
}
