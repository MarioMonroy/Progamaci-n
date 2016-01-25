package modelo;
/**
 * 
 * @author Mario Monroy
 *
 */
public class TrianguloIsosceles implements Figuras{
/**
 * Metdo para sacar el area y perimetro del tríangulo isosceles
 */
	@Override
	public float area(float lado, float base, float altura, float baset, float alturat, float radio) {
		// TODO Auto-generated method stub
		return (baset * alturat) / 2;
	}

	@Override
	public float perimetro(float lado, float base, float altura, float ladot, float ladot2, float ladot3, float radio) {
		// TODO Auto-generated method stub
		return (2 * ladot) + ladot2;
	}

}
