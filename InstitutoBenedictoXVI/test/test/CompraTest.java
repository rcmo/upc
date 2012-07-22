package test;

import org.junit.Test;

import controlador.CompraControlador;

import dominio.Cliente;
import dominio.Empresa;
import dominio.Moneda;

public class CompraTest {
	
	
	@Test
	public void testMetodosGenerales() {
		
		Empresa proveedor = CompraControlador.registrarEmpresa("20100070970", "Lau Chun", Empresa.Rubro.UTILES, "Calle Morelli # 181", "ventas@lauchun.com", "618000", "Lima", "Peru", Empresa.Estado.ACTIVA, "");		
		Moneda monedaSoles = new Moneda("S", "Soles");
	}

}
