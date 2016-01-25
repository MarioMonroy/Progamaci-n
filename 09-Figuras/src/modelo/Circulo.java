package modelo;
/**
 * 
 * @author Mario Monroy
 *
 */
public class Circulo implements Figuras {
/**
 * Metodos para sacar el area y perimetro del circulo
 */
	@Override
	public float area(float lado, float base, float altura, float baset, float alturat, float radio) {
		// TODO Auto-generated method stub
		float p = (float)(Math.PI);
		return p * (radio * radio);
	}

	@Override
	public float perimetro(float lado, float base, float altura, float ladot, float ladot2, float ladot3, float radio) {
		// TODO Auto-generated method stub
		float p = (float)(Math.PI);
		return p * (radio * 2);
		
	}

}
