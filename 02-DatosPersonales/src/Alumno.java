/**
 * 
 * @author GerardoVite
 *
 */
public class Alumno {
	private String nombre;
	private String apPat;
	private String apMat;
	private String edad;
	private String telefono;
	private String fechaNac;
	private String rfc;
	private String codPostal;
	private String calle;
	private String colonia;
	
	/**
	 * 
	 * @return Retorna el Apellido Paterno de la persona
	 */
	
	public String getApPat() {
		return apPat;
	}
	
	/**
	 * 
	 * @param apPat Introduce el Apellido Paterno de la persona en formato String
	 */

	public void setApPat(String apPat) {
		this.apPat = apPat;
	}

	/**
	 * 
	 * @return Retorna el Apellido Materno de la persona
	 */
	
	public String getApMat() {
		return apMat;
	}
	
	/**
	 * 
	 * @param apMat Envia el Apellido Materno de la persona
	 */

	public void setApMat(String apMat) {
		this.apMat = apMat;
	}
	/**
	 * 
	 * @return Retorna la Fecha de Nacimiento de la persona
	 */

	public String getFechaNac() {
		return fechaNac;
	}

	/**
	 * 
	 * @param fechaNac Envia la fecha de nacimiento de la persona
	 */
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	/**
	 * 
	 * @return Retorna el RFC de la persona
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * 
	 * @param rfc Introduce el RFC formato de la persona en formato String
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * 
	 * @return Retorna el Codigo Postal de la persona
	 */
	public String getCodPostal() {
		return codPostal;
	}

	/**
	 * 
	 * @param codPostal Introduce el Codigo Postal de la persona en formato String
	 */
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	/**
	 * 
	 * @return Retorna la calle de la persona
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * 
	 * @param calle Introduce el nombre de la calle de la persona en formato String
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * 
	 * @return Retorna la colonia de la persona
	 */
	public String getColonia() {
		return colonia;
	}

	/**
	 * 
	 * @param colonia Introduce la colonia de la persona en formato String
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	/**
	 * 
	 * @param nombre de la persona en formato String
	 * @param apPat de la persona en formato String
	 * @param apMat de la persona en formato String
	 * @param edad de la persona en formato String
	 * @param telefono de la persona en formato String
	 * @param fechaNac de la persona en formato String
	 * @param rfc de la persona en formato String
	 * @param codPostal de la persona en formato String
	 * @param calle de la persona en formato String
	 * @param colonia de la persona en formato String
	 */
	public Alumno(String nombre, String apPat, String apMat, String edad, String telefono, String fechaNac, String rfc,
			String codPostal, String calle, String colonia) {
		super();
		this.nombre = nombre;
		this.apPat = apPat;
		this.apMat = apMat;
		this.edad = edad;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
		this.rfc = rfc;
		this.codPostal = codPostal;
		this.calle = calle;
		this.colonia = colonia;
	}

	public Alumno(){}

	/**
	 * 
	 * @return Retorna el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre Introduce el nombre la persona en formato String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return Retorna la edad de la persona
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param edad Introduce la edad de la persona en formato String
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @return Retorna la edad de la persona
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * 
	 * @param telefono Introduce el nombre de la persona en formato String
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Alumno(String nombre, String edad, String telefono) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}
}
