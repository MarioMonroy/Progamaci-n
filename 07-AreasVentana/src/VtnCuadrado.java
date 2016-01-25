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
public class VtnCuadrado extends JFrame implements ActionListener{

	
	private JTextField txtN1 = new JTextField();
	
	private JLabel lbN1 = new JLabel("Ingresa el número del lado del cuadrado");
	
	
	
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnCalcular = new JButton("Calcular");
	
	private Container c = getContentPane();
	
	private Areas op = new Areas();
	
	
public VtnCuadrado(){
		
		super.setTitle("Área Cuadrado");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
		
	}

	private void cargarControles() {
		/**
		 * tamaño, posición de botones,cajas de texto
		*/
		c.setLayout(null);
		
		lbN1.setBounds(10, 10, 300,30);
		txtN1.setBounds(10, 40, 250, 30);
		
		btnCalcular.setBounds(10, 120, 250, 35);
		
		lbResultado.setBounds(10, 220, 300, 30);
		
		
		
		
		c.add(lbN1);
		c.add(txtN1);	
		
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent arg0) {
/**
 * muestra el resultado de la operación
 */
		Float r = op.cuadrado(Float.parseFloat(txtN1.getText()));
		lbResultado.setText(String.format("%s * %s * %s * %s = %.2f", 
				txtN1.getText(),
				txtN1.getText(),
				txtN1.getText(),
				txtN1.getText(),
				r));
	}

}
