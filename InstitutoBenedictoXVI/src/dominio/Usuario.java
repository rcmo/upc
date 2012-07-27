package dominio;

public class Usuario extends Persona{
	
	private String fechapase;
	
	public Usuario(){
		super("","","","","","","","","");
		}

	public Usuario(String dni, String nombres, String apellido_paterno,
			String apellido_materno, String telefono, String correo,
			String direccion, String distrito, String departamento) {
		super(dni, nombres, apellido_paterno, apellido_materno, telefono, correo,
				direccion, distrito, departamento);
		// TODO Auto-generated constructor stub
		
	}
	
	

}
