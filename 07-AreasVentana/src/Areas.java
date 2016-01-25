/**
 * 
 * @author Mario Monroy
 *
 */
public class Areas {

	public float cuadrado(float lado){
		return lado * lado * lado * lado ;
	}
	public float rectangulo(float lado, float lado2){
		return (lado * lado2);
	}
	public float trianguloEquilatero(float lado, float lado2){
		return (lado * lado2)/2 ;
	}
	public float trianguloIsoceles(float lado, float lado2){
		return 2 * lado2 + lado ;
	}
	public float trianguloEscaleno(float lado, float lado2, float lado3){
		return (lado + lado2 + lado3)/2 ;
	}
	public float circulo( float radio){
				
		return (float)((float) 3.1416*Math.pow(radio, 2));
	}
	
}