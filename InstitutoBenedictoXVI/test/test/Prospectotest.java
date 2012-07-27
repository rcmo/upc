package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.Prospecto;

public class Prospectotest {
	@Test
	public void testProspecto(){
	
		Prospecto prospecto1 = new Prospecto();
		
		prospecto1.setDni("45538817");
		prospecto1.setNombres("Eduardo");
		prospecto1.setApellido_Paterno("Rodriguez");
		prospecto1.setApellido_Materno("Valladares");
		prospecto1.setTelefono("4984384");
		prospecto1.setFechaContacto("05/02/2012");
		prospecto1.setCorreo("tito.rodriguev@hotmail.com");
		prospecto1.setDireccion("callao n4 lote");
		prospecto1.setDistrito("Bellavista");
		prospecto1.setDepartamento("Callao");
		
		
		assertEquals("45538817", prospecto1.getDni());
		assertEquals("Eduardo", prospecto1.getNombres());
		assertEquals("Rodriguez", prospecto1.getApellido_Paterno());
		assertEquals("Valladares", prospecto1.getApellido_Materno());
		assertEquals("4984384", prospecto1.getTelefono());
		assertEquals("05/02/2012", prospecto1.getFechaContacto());
		assertEquals("tito.rodriguev@hotmail.com", prospecto1.getCorreo());
		assertEquals("callao n4 lote", prospecto1.getDireccion());
		assertEquals("Bellavista", prospecto1.getDistrito());
		assertEquals("Callao", prospecto1.getDepartamento());
		
		
		
	}

	
	
	
	
	
	
}
