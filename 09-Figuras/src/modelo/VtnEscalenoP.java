package modelo;
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
public class VtnEscalenoP extends JFrame implements ActionListener{

	
	private JTextField txtN1 = new JTextField();
	private JLabel lbN1 = new JLabel("Ingresa el valor del primer lado del  Triángulo");
	private JTextField txtN2 = new JTextField();
	private JLabel lbN2 = new JLabel("Ingresa el valor del segundo lado del  Triángulo");
	private JTextField txtN3 = new JTextField();
	private JLabel lbN3 = new JLabel("Ingresa el valor del tercer lado del  Triángulo");
	
	
	
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnCalcular = new JButton("Calcular");
	
	private Container c = getContentPane();

	
	/**
	 * Constructor para la creacion de la ventana	
	 */
public VtnEscalenoP(){
		
		super.setTitle("Perimetro Triángulo Escaleno");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
		
	}

	private void cargarControles() {
		/**
	 * tamaño y ubicación de los botones,cajas de texto
		 */
		c.setLayout(null);
		
		lbN1.setBounds(10, 10, 300,30);
		txtN1.setBounds(10, 40, 250, 30);
		lbN2.setBounds(10, 70, 300,30);
		txtN2.setBounds(10, 100, 250, 30);
		lbN3.setBounds(10, 130, 300,30);
		txtN3.setBounds(10, 170, 250, 30);
		
		btnCalcular.setBounds(10, 220, 250, 35);
		
		lbResultado.setBounds(10, 250, 300, 30);
		
		
		
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(lbN3);
		c.add(txtN3);
		
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent arg0) {
		/**
		 * activa el boton resultado
		 */
		TrianguloEscaleno e = new TrianguloEscaleno();
		Float r = e.perimetro(0, 0, 0, Float.parseFloat(txtN1.getText()), Float.parseFloat(txtN2.getText()), Float.parseFloat(txtN3.getText()), 0);
		lbResultado.setText(String.format("%s + %s +%s = %.2f", 
				txtN1.getText(),
				txtN2.getText(),
				txtN3.getText(),
				r));

	}

}
