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
public class PrincipalPerimetros extends JFrame implements ActionListener{
	
	
	private JButton btnCuadrado = new JButton("Cuadrado");
	private JButton btnRectangulo = new JButton("Rectangulo");
	private JButton btnTriangulo = new JButton("Triángulo");
	private JButton btnCirculo = new JButton("Círculo");
	
	private Container C = getContentPane();
	
	/**
	 * Metodo para la creacion de la ventana
	 */
public PrincipalPerimetros(){
		
		super.setTitle("Menú Principal Perímetros");
		super.setSize(250, 400);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
		
	}
/**
 * Construtor para la creacion de los parametros de la ventana
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
 * Metodo para la funcion de los botonoes
 */
@Override
public void actionPerformed(ActionEvent a) {
	
	Object b = a.getSource();
	
	if(b==btnCuadrado){
		VtnCuadradoP vtn1 = new VtnCuadradoP();
		vtn1.setVisible(true);
	
	} else {
		if(b==btnRectangulo){
			VtnRectanguloP vtn1 = new VtnRectanguloP();
			vtn1.setVisible(true);
	} else{
		if(b==btnTriangulo){
			VtnTrianguloPer vtn1 = new VtnTrianguloPer();
			vtn1.setVisible(true);
	} else {
		if(b==btnCirculo){
			VtnCirculoP vtn1 = new VtnCirculoP();
			vtn1.setVisible(true);
		}
	}
	
}
	
	}
}

}