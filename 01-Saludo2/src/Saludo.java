import javax.swing.JOptionPane;
/**
 * 
 * @author MarioAlbertoMonroyGarcia
 *
 */
public class Saludo {
	public static void main(String[] args) {
		String nombre = "Mario";
		Object edad = "21";
		//System.out.println("Hola: " + nombre );
		//System.out.printf("Hola: %s", nombre);
		JOptionPane.showMessageDialog(null, String.format("Hola: %s tu edad es %s años de edad", nombre, edad ));
	}
}
