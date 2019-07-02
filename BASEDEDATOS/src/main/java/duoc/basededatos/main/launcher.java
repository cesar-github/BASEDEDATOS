package duoc.basededatos.main;

import duoc.basededatos.main.base.BaseDeDatos;
import duoc.basededatos.main.dato.Dato;

public class launcher {

	public static void main(String[] args) {
		BaseDeDatos base  = new BaseDeDatos();
		base.agregar(new Dato("DATO n1","Informacion del dato n1"));
		base.agregar(new Dato("DATO n2","Informacion del dato n2"));
		base.agregar(new Dato("DATO n3","Informacion del dato n3"));
		base.agregar(new Dato("DATO n4","Informacion del dato n4"));
		base.agregar(new Dato("DATO n5","Informacion del dato n5"));
		
		System.out.println("LISTANDO: "+ base.listar());
		
		base.eliminar("DATO n4");
		base.modificar(new Dato("DATO n5", "MODIFICANDO DATO n 5"));
		
		System.out.println("LISTANDO: "+ base.listar());
		
		
	}

}
