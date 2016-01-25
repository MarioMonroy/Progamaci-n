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
public class PrincipalAreas extends JFrame implements ActionListener{
	
	
	private JButton btnCuadrado = new JButton("Cuadrado");
	private JButton btnRectangulo = new JButton("Rectangulo");
	private JButton btnTriangulo = new JButton("Triángulo");
	private JButton btnCirculo = new JButton("Círculo");
	
	private Container C = getContentPane();
	
	/**
	 * Contructor para la creacion de la ventana
	 */
public PrincipalAreas(){
		
		super.setTitle("Menú Principal Áreas");
		super.setSize(250, 400);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
		
	}
/**
 * Constructor para la creacion de los parametros de la ventana
 */
private void cargarControles() {

	C.setLayout(null);
	btnCuadrado.setBounds(10, 50, 100, 35);
	btnRectangulo.setBounds(20, 100, 100, 35);
	btnTriangulo.setBounds(30, 150, 100, 35);
	btnCirculo.setBounds(40, 200, 100, 35);
	
	
	C.add(btnCuadrado);
	C.add(btnRectangulo);
	C.add(btnTriangulo);
	C.add(btnCirculo);
	
	btnCuadrado.addActionListener(this);
	btnRectangulo.addActionListener(this);
	btnTriangulo.addActionListener(this);
	btnCirculo.addActionListener(this);
	
}
/**
 * Metodo para la funcion de los botones
 */
@Override
public void actionPerformed(ActionEvent a) {
	
	Object b = a.getSource();
	
	if(b==btnCuadrado){
		VtnCuadradoA vtn1 = new VtnCuadradoA();
		vtn1.setVisible(true);
	
	} else {
		if(b==btnRectangulo){
			VtnRectanguloA vtn1 = new VtnRectanguloA();
			vtn1.setVisible(true);
	} else{
		if(b==btnTriangulo){
			VtnTriangulo vtn1 = new VtnTriangulo();
			vtn1.setVisible(true);
	} else {
		if(b==btnCirculo){
			VtnCirculoA vtn1 = new VtnCirculoA();
			vtn1.setVisible(true);
		}
	}
	
}
	
	}
}

}