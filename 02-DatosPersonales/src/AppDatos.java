import javax.swing.JOptionPane;
/**
 * 
 * @author MarioAlbertoMonroyGarcia
 *
 */
public class AppDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno al = new Alumno("Mario", "Monroy", "Garcia","21", "5541245", "Beliz", "sadd@hotmail.com", "55600", "masculino", "70");
		
		JOptionPane.showMessageDialog(null, String.format("Hola: %s \ntu apellido paterno es: %s \ntu apellido materno es: %s \ntu edad es: %s \ntu telefono es: %s \ntu direccion es: %s \ntu correo es: %s \ncodigo postal: %s \ntu sexo es: %s \ntu peso es: %s", al.getNombre(), al.getApellidop(), al.getApellidom(),al.getEdad(), al.getTelefono(), al.getDireccion(), al.getCorreo(), al.getCodigopostal(), al.getSexo(), al.getPeso()));
	}

}
