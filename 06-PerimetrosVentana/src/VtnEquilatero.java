import java.awt.Container;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author Mario Monroy
 *
 */
public class VtnEquilatero extends JFrame implements ActionListener{

	
	private JTextField txtN1 = new JTextField();
	private JLabel lbN1 = new JLabel("Ingresa el valor del lado del Tri�ngulo");
	
	
	
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnCalcular = new JButton("Calcular");
	
	private Container c = getContentPane();
	
	private Perimetros op = new Perimetros();
	
	
public VtnEquilatero(){
		
		super.setTitle("Perimetro Tri�ngulo Equil�tero");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
		
	}

	private void cargarControles() {
		/**
	 * tama�o y ubicaci�n de los botones,cajas de texto
		 */
		c.setLayout(null);
		
		lbN1.setBounds(10, 10, 300,30);
		txtN1.setBounds(10, 40, 250, 30);
		
		btnCalcular.setBounds(10, 150, 250, 35);
		
		lbResultado.setBounds(10, 200, 300, 30);
		
		
		
		
		c.add(lbN1);
		c.add(txtN1);	
		
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent arg0) {
		/**
		 * activa el boton resultado
		 */
		Float c = op.trianguloEquilatero(Float.parseFloat(txtN1.getText()));
		lbResultado.setText(String.format("3 * %s = %.2f",
				txtN1.getText(),
				c));

	}

}
