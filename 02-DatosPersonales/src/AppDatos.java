import javax.swing.JOptionPane;
/**
 * 
 * @author Gerardo_Vite
 *
 */
public class AppDatos {

	/**
	 * 
	 * @param args Se muestra la informacion en formato String en un mensaje de dialogo 
	 */
	public static void main(String[] args) {
		Alumno al = new Alumno("Gerardo","Vite","San Juan", "23", "5543476325", "13/05/1992", "VISG920513TY4", "55748", "Benito Juarez", "San Martin Azcatepec");
		JOptionPane.showMessageDialog(null, String.format("Nombre %S \n Apellido Paterno %s \n Apellido Materno %s \n Edad %s \n Telefono %s \n Fecha nacimiento %s \n CURP %s \n Codigo Postal %s \n Calle %s \n %s Colonia \n", al.getNombre(), al.getApPat(), al.getApMat(), al.getEdad(), al.getTelefono(), al.getFechaNac(), al.getRfc(), al.getCodPostal(), al.getCalle(), al.getColonia()));

	}

}
