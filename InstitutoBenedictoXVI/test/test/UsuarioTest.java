package test;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import dominio.Clientealta;
import dominio.Usuarioalta;

public class UsuarioTest {

	@Test
	
	public void AltaUsuarios(){
		
		
		String nombre = "carlos";
		String ape_paterno=null;
		String ape_materno= null;
		String email = null;
		String dni = null;
		String telefono = null;
		String cargo = null;
		
		Usuarioalta alta = new Usuarioalta();
		

		boolean datoscorrectos = alta.ValidaDatos(nombre,ape_paterno,ape_materno,email,dni,telefono,cargo); 
		
		if (!datoscorrectos){
			System.out.print("No ingreso datos a los campos");
			
		}
		//Assert.assertTrue("No a ingresado datos relevantes",datoscorrectos);
		
	}
	//fail("Not yet implemented");
		

}
