package modelo;
/**
 * 
 * @author Mario Monroy
 *
 */
public class TrianguloEscaleno implements Figuras {
/**
 * Metodos para sacar el area y perimetro del triangulo escaleno
 */
	@Override
	public float area(float lado, float base, float altura, float baset, float alturat, float radio) {
		// TODO Auto-generated method stub
		return (baset * alturat) / 2;
	}

	@Override
	public float perimetro(float lado, float base, float altura, float ladot, float ladot2, float ladot3, float radio) {
		// TODO Auto-generated method stub
		return ladot + ladot2 + ladot3;
	}

}
