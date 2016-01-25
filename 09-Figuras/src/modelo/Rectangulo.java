package modelo;
/**
 * 
 * @author Mario Monroy
 *
 */
public class Rectangulo implements Figuras {
/**
 * Metodos para sacar el area y el perimetro del rectangulo
 */
	@Override
	public float area(float lado, float base, float altura, float baset, float alturat, float radio) {
		// TODO Auto-generated method stub
		return base * altura;
	}

	@Override
	public float perimetro(float lado, float base, float altura, float ladot, float ladot2, float ladot3, float radio) {
		// TODO Auto-generated method stub
		return 2 * (base + altura);
	}

}
