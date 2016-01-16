/**
 * 
 * @author MarioAlbertoMonroyGarcia
 *
 */
public class Alumno {
	private String nombre;
	private String apellidop;
	private String apellidom;
	private String edad;
	private String telefono;
	private String direccion;
	private String correo;
	private String codigopostal;
	private String sexo;
	private String peso;
	/**
	 * Constructor sin parametros
	 */
	public Alumno(){}
/**
 * 
 * @param nombre nombre de la persona 
 * @param apellidop apellido paterno de la persona
 * @param apellidom apellido materno de la persona
 * @param edad edad de la persona
 * @param telefono telefono de la persona
 * @param direccion direccion de la persona
 * @param correo correo de la persona
 * @param codigopostal codigo postal de la persona
 * @param sexo sexo de la persona
 * @param peso peso de la persona
 */
	public Alumno(String nombre, String apellidop, String apellidom, String edad, String telefono, String direccion,
			String correo, String codigopostal, String sexo, String peso) {
		super();
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.codigopostal = codigopostal;
		this.sexo = sexo;
		this.peso = peso;
	}
/**
 * 
 * @return retorna el nombre
 */
	public String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre introduce el nombre de la persona en formato String
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return retorna el apellido paterno de la persona
 */
	public String getApellidop() {
		return apellidop;
	}
/**
 * 
 * @param apellidop introduce el apellido de la persona en formato String
 */
	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}
/**
 * 
 * @return retorna el apellido materno de la persona
 */
	public String getApellidom() {
		return apellidom;
	}
/**
 * 
 * @param apellidom introduce el apellido materno de la persona en formato String
 */
	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}
/**
 * 
 * @return retorna la edad de la persona
 */
	public String getEdad() {
		return edad;
	}
/**
 * 
 * @param edad introduce la edad de la persona en formato String
 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
/**
 * 
 * @return retorna el telefono de la persona
 */
	public String getTelefono() {
		return telefono;
	}
/**
 * 
 * @param telefono introduce el telefono de la persona en formato String
 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
/**
 * 
 * @return retorna la direccion de la persona
 */
	public String getDireccion() {
		return direccion;
	}
/**
 * 
 * @param direccion introduce la direccion de la persona en formato String
 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
/**
 * 
 * @return retorna el correo de la persona
 */
	public String getCorreo() {
		return correo;
	}
/**
 * 
 * @param correo introduce el correo de la persona en formato String
 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
/**
 * 
 * @return retorna el codigo de la persona
 */
	public String getCodigopostal() {
		return codigopostal;
	}
/**
 * 
 * @param codigopostal introduce el codigo de la persona en formato String
 */
	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}
/**
 * 
 * @return retorna el sexo de la persona
 */
	public String getSexo() {
		return sexo;
	}
/**
 * 
 * @param sexo introduce el sexo de la persona en formato String
 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
/**
 * 
 * @return retorna el peso de la persona
 */
	public String getPeso() {
		return peso;
	}
/**
 * 
 * @param peso introduce el peso de la persona en formato String
 */
	public void setPeso(String peso) {
		this.peso = peso;
	}

	
	
	
}
