package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Principal;

import javax.swing.JButton;
import javax.swing.JFrame;

import modelo.PrincipalAreas;
import modelo.PrincipalPerimetros;


/**
 * 
 * @author Mario Monroy
 *
 */
public class FigurasVentana extends JFrame implements ActionListener{
	private JButton btnPerimetros = new JButton("Calcular Perímetros");
	private JButton btnAreas = new JButton("Calcular Áreas");
	
	private Container c = getContentPane();
	
	public FigurasVentana() {
		super.setTitle("Menú Principal");
		super.setSize(350, 300);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
	}
	/**
	 * Metodo para la creacion de los parametros que se mostraran en la ventana
	 */
	public void cargarControles(){
		c.setLayout(null);
		
		btnAreas.setBounds(40, 40, 200, 35);
		btnPerimetros.setBounds(80, 100, 200, 35);
		
		
		c.add(btnAreas);
		c.add(btnPerimetros);
		
		btnAreas.addActionListener(this);
		btnPerimetros.addActionListener(this);
		
	}
/**
 * Metodo para las funciones de los botones
 */
	@Override
	public void actionPerformed(ActionEvent b) {
		Object btn = b.getSource();
		
		if(btn==btnAreas){
			PrincipalAreas vtna = new PrincipalAreas();
			vtna.setVisible(true);
		} else{
			if(btn==btnPerimetros){
				PrincipalPerimetros vtnp = new PrincipalPerimetros();
				vtnp.setVisible(true);
			}
		}
	
	}
}
