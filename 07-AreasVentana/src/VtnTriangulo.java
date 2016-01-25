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
public class VtnTriangulo extends JFrame implements ActionListener{
	
	
	private JButton btnEquilatero = new JButton("Equilátero");
	private JButton btnIsosceles = new JButton("Isósceles");
	private JButton btnEscaleno = new JButton("Escaleno");
	
	private Container C = getContentPane();
	
	
public VtnTriangulo(){
		
		super.setTitle("Perimetro Triángulo");
		super.setSize(250, 400);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
		
	}

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

@Override
public void actionPerformed(ActionEvent a) {
	
	Object b = a.getSource();
	
	if(b==btnEquilatero){
		VtnEquilatero vtn1 = new VtnEquilatero();
		vtn1.setVisible(true);
	
	} else {
		if(b==btnIsosceles){
			VtnIsosceles vtn1 = new VtnIsosceles();
			vtn1.setVisible(true);
	} else{
		if(b==btnEscaleno){
			VtnEscaleno vtn1 = new VtnEscaleno();
			vtn1.setVisible(true);
	} 
	
}
	
	}
}

}