/**
 * 
 * @author Mario Monroy
 *
 */
public class Perimetros {

	public float cuadrado(float lado){
		return lado + lado + lado + lado ;
	}
	public float rectangulo(float lado, float lado2){
		return 2 * (lado + lado2);
	}
	public float trianguloEquilatero(float lado){
		return 3 * lado ;
	}
	public float trianguloIsoceles(float lado, float lado2){
		return (2 * lado) + lado2 ;
	}
	public float trianguloEscaleno(float lado, float lado2, float lado3){
		return lado + lado2 + lado3 ;
	}
	public float circulo(double radio){
		
		return (float) (3.1416 * radio);
	}
	
}