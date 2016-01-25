package modelo;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * 
 * 
 * @author Mario Monroy
 *
 */
public class VtnTrianguloPer extends JFrame implements ActionListener{
	
	
	private JButton btnEquilatero = new JButton("Equilátero");
	private JButton btnIsosceles = new JButton("Isósceles");
	private JButton btnEscaleno = new JButton("Escaleno");
	
	private Container C = getContentPane();
	
	/**
	 * Constructor para la creacion de la ventana y sus dimensiones
	 */
public VtnTrianguloPer(){
		
		super.setTitle("Perimetro Triángulo");
		super.setSize(250, 400);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
		
	}
/**
 * Constructor para las dimensiones de los parametros de la ventana
 */
private void cargarControles() {

	C.setLayout(null);
	btnEquilatero.setBounds(10, 50, 100, 35);
	btnIsosceles.setBounds(10, 100, 100, 35);
	btnEscaleno.setBounds(10, 150, 100, 35);
	
	
	C.add(btnEquilatero);
	C.add(btnIsosceles);
	C.add(btnEscaleno);
	
	btnEquilatero.addActionListener(this);
	btnIsosceles.addActionListener(this);
	btnEscaleno.addActionListener(this);
	
}

/**
 * Metodo para las funciones de los botones
 */
@Override
public void actionPerformed(ActionEvent a) {
	
	Object b = a.getSource();
	
	if(b==btnEquilatero){
		VtnEquilateroP vtn1 = new VtnEquilateroP();
		vtn1.setVisible(true);
	
	} else {
		if(b==btnIsosceles){
			VtnIsoscelesP vtn1 = new VtnIsoscelesP();
			vtn1.setVisible(true);
	} else{
		if(b==btnEscaleno){
			VtnEscalenoP vtn1 = new VtnEscalenoP();
			vtn1.setVisible(true);
	} 
	
}
	
	}
}

}