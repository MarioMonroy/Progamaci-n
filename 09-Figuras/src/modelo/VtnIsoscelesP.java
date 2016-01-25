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
public class VtnIsoscelesP extends JFrame implements ActionListener{

	
	private JTextField txtN1 = new JTextField();
	private JLabel lbN1 = new JLabel("Lado 1 del Triángulo");
	private JTextField txtN2 = new JTextField();
	private JLabel lbN2 = new JLabel("Lado 2 del Triángulo");
	
	
	
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnCalcular = new JButton("Calcular");
	
	private Container c = getContentPane();
	
	
	
	/**
	 * Constructor para la creacion y dimensiones de la ventana
	 */
public VtnIsoscelesP(){
		
		super.setTitle("Perimetro Triángulo Isósceles");
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
		
		btnCalcular.setBounds(10, 150, 250, 35);
		
		lbResultado.setBounds(10, 200, 300, 30);
		
		
		
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent arg0) {
		/**
		 * activa el boton resultado
		 */
		TrianguloIsosceles i = new TrianguloIsosceles();
		Float r = i.perimetro(0, 0, 0, Float.parseFloat(txtN1.getText()), Float.parseFloat(txtN2.getText()), 0, 0);
		lbResultado.setText(String.format("(2 * %s) + %s = %.2f", 
				txtN1.getText(), 
				txtN2.getText(), 
				r));
	}

}
