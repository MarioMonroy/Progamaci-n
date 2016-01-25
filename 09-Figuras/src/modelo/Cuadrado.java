package modelo;
/**
 * 
 * @author Mario Monroy
 *
 */
public class Cuadrado implements Figuras {
/**
 * Metodos para sacar el area y perimetro del cuadrado
 */
	@Override
	public float area(float lado, float base, float altura, float baset, float alturat, float radio) {
		// TODO Auto-generated method stub
		return lado * lado * lado * lado;
	}

	@Override
	public float perimetro(float lado, float base, float altura, float ladot, float ladot2, float ladot3, float radio) {
		// TODO Auto-generated method stub
		return lado * 4;
	}

}
