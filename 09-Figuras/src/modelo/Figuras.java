package modelo;
/**
 * 
 * @author Mario Monroy
 *
 */
public interface Figuras {
	/**
	 * 
	 * @param lado lado del cuadrado
	 * @param base base del recatngulo
	 * @param altura altura del rectangulo
	 * @param baset base del triangulo
	 * @param alturat altura del triangulo
	 * @param radio radio del circulo
	 * @return regresa el area de la figura
	 */
	public float area(float lado, float base, float altura, float baset, float alturat, float radio);
	/**
	 * 
	 * @param lado lado del cuadrado
	 * @param base base del rectangulo
	 * @param altura altura del rectangulo
	 * @param ladot lado 1 del triangulo
	 * @param ladot2 lado 2 del triangulo
	 * @param ladot3 lado 3 del triangulo
	 * @param radio radio del circulo
	 * @return retorna el perimetro de la figura
	 */
	public float perimetro(float lado, float base, float altura, float ladot, float ladot2, float ladot3, float radio);

}
