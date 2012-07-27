package dominio;



public class Prospecto extends Persona {

	private String fechacontacto;
	
	
	public Prospecto(){
		super("","","","","","","","","");
		}
	
	public Prospecto(String dni,String nombres, String apellido_paterno, String apellido_materno, String telefono, String fechacontacto, String correo, String direccion, String distrito, String departamento){
		super(dni,nombres, apellido_paterno, apellido_materno,telefono, correo,direccion,distrito, departamento);
		
		setFechaContacto(fechacontacto);

	}

	public String getFechaContacto() {
		return fechacontacto;
	}
	public void setFechaContacto(String fechacontacto) {
		this.fechacontacto = fechacontacto;
	}



}
