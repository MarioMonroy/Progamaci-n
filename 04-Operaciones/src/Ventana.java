import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author MarioAlbertoMonroyGarcia
 *
 */
public class Ventana extends JFrame implements ActionListener{
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JLabel lbN1 = new JLabel("Número 1");
	private JLabel lbN2 = new JLabel("Número 2");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnSumar = new JButton("+");
	private JButton btnRestar = new JButton("-");
	private JButton btnMultiplicar = new JButton("*");
	private JButton btnDivision = new JButton("/");
	
	private Container c = getContentPane();
	private Operaciones op = new Operaciones();
	
	/**
	 * constructor con las caracteristicas de la ventana
	 */
	public Ventana(){
		super.setTitle("Operaciones");
		super.setSize(340, 480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	/**
	 * Método que contiene los paramtros que se mostraran en la ventana
	 */
	private void cargarControles(){
		c.setLayout(null);
		lbN1.setBounds(10, 10, 300, 30);
		txtN1.setBounds(10, 40, 300, 30);
		lbN2.setBounds(10, 80, 300, 30);
		txtN2.setBounds(10, 110, 300, 30);
		
		btnSumar.setBounds(10, 150, 60, 35);
		btnRestar.setBounds(80, 150, 60, 35);
		btnMultiplicar.setBounds(150, 150, 60, 35);
		btnDivision.setBounds(220, 150, 60, 35);
		
		lbResultado.setBounds(10, 190, 300, 30);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnSumar);
		c.add(btnRestar);
		c.add(btnMultiplicar);
		c.add(btnDivision);
		c.add(lbResultado);
		btnSumar.addActionListener(this);
		btnRestar.addActionListener(this);
		btnMultiplicar.addActionListener(this);
		btnDivision.addActionListener(this);
		
	}
	/**
	 * Método donde se realizan las operaciones matematicas
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		int s = op.sumar(Integer.parseInt(txtN1.getText()), 
				Integer.parseInt(txtN2.getText()));
		lbResultado.setText(String.format("%s + %s = %d", 
				txtN1.getText(),
				txtN2.getText(),
				s));
		int r = op.restar(Integer.parseInt(txtN1.getText()), 
				Integer.parseInt(txtN2.getText()));
		lbResultado.setText(String.format(" %s - %s = %d", 
				txtN1.getText(),
				txtN2.getText(),
				r));
		int m = op.multiplicar(Integer.parseInt(txtN1.getText()), 
				Integer.parseInt(txtN2.getText()));
		lbResultado.setText(String.format("%s * %s = %d", 
				txtN1.getText(),
				txtN2.getText(),
				m));
		int d = op.division(Integer.parseInt(txtN1.getText()), 
				Integer.parseInt(txtN2.getText()));
		lbResultado.setText(String.format("%s / %s = %d", 
				txtN1.getText(),
				txtN2.getText(),
				d));

	}
}
