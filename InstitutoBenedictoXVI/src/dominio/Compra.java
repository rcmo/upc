


package dominio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class Compra {
public enum Estado {EN_PROCESO, ENVIADA, CONFIRMADA, ENTREGADA, PAGADA}
	
	private int codigo;
	private Proveedor habitacion;
	private List<Producto> material = new ArrayList<Producto>();
	private Estado estado;
	private Date fechaGeneracion;
	private Date fechaEntrega;	
	private Double monto;
	
	
}








    