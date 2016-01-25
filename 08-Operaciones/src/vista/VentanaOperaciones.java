package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Division;
import modelo.Multiplicacion;
import modelo.Resta;
import modelo.Suma;
/**
 * 
 * @author Mario Alberto Monroy Garcia
 *
 */
public class VentanaOperaciones extends JFrame implements ActionListener{
	private JTextField txtN1 = new JTextField();
	private JLabel lbN1 = new JLabel("Número 1");
	private JTextField txtN2 = new JTextField();
	private JLabel lbN2 = new JLabel("Número 2");
	
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnSuma = new JButton("+");
	private JButton btnResta = new JButton("-");
	private JButton btnMultiplicacion = new JButton("x");
	private JButton btnDivision = new JButton("÷");
	
	private Container c = getContentPane();
	
	/**
	 * Constructor para las dimensiones de la ventana
	 */
	public  VentanaOperaciones() {
		
		super.setTitle("Operaciones");
		super.setSize(350, 400);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
	}
	/**
	 * Constructor para las dimensiones de los parametros de la ventana y agregarlos a la ventana
	 */
	public void cargarControles(){
		c.setLayout(null);
		lbN1.setBounds(10, 10, 300, 35);
		txtN1.setBounds(10, 40, 310, 35);
		lbN2.setBounds(10, 70, 300, 35);
		txtN2.setBounds(10, 100, 310, 35);

		
		
		btnSuma.setBounds(10, 150, 150, 35);
		btnResta.setBounds(170, 150, 150, 35);
		btnMultiplicacion.setBounds(10, 200, 150, 35);
		btnDivision.setBounds(170, 200, 150, 35);
		
		lbResultado.setBounds(10, 250, 250, 35);
		
		
		c.add(txtN1);
		c.add(lbN1);
		c.add(txtN2);
		c.add(lbN2);
		
		c.add(btnSuma);
		c.add(btnResta);
		c.add(btnMultiplicacion);
		c.add(btnDivision);
		
		c.add(lbResultado);
		
		btnSuma.addActionListener(this);
		btnResta.addActionListener(this);
		btnMultiplicacion.addActionListener(this);
		btnDivision.addActionListener(this);
	}
/**
 * Metodo para las funciones de los botones
 */
	@Override
	public void actionPerformed(ActionEvent a) {
		Object btn = a.getSource();
		
		if(btn==btnSuma){
			Suma s = new Suma();
			float r = s.Operacion(Float.parseFloat(txtN1.getText()), Float.parseFloat(txtN2.getText()));
			lbResultado.setText(String.format("%s + %s = %.2f",
					txtN1.getText(),
					txtN2.getText(),
					r));
		
		} else {
			if(btn==btnResta){
				Resta re = new Resta();
				float r = re.Operacion(Float.parseFloat(txtN1.getText()), Float.parseFloat(txtN2.getText()));
				lbResultado.setText(String.format("%s - %s = %.2f",
						txtN1.getText(),
						txtN2.getText(),
						r));
			} else{
				if(btn==btnMultiplicacion){
					Multiplicacion m = new Multiplicacion();
					float r = m.Operacion(Float.parseFloat(txtN1.getText()), Float.parseFloat(txtN2.getText()));
					lbResultado.setText(String.format("%s * %s = %.2f",
							txtN1.getText(),
							txtN2.getText(),
							r));
			} else {
				if(btn==btnDivision){
					Division d = new Division();
					float r = d.Operacion(Float.parseFloat(txtN1.getText()), Float.parseFloat(txtN2.getText()));
					lbResultado.setText(String.format("%s / %s = %.2f",
							txtN1.getText(),
							txtN2.getText(),
							r));
				}
			}
		}
	}		
		
}

}
