import javax.swing.JOptionPane;
/**
 * 
 * @author Gerardo_Vite
 *
 */
public class Saludo {

	/**
	 * 
	 * @param args Introduce el nombre y la edad en formato String, muestra en un mensaje dicha informacion 
	 */
	public static void main(String[] args) {
		String nombre="Gerardo";
		String edad="40";
		//System.out.println("Hola: " + nombre);
		//System.out.printf("Hola: %s", nombre);
		JOptionPane.showMessageDialog(null, String.format("Hola: %s tu edad es: %s años de edad", nombre, edad));
	}

}
