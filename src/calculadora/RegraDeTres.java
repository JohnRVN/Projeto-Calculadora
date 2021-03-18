package calculadora;

import static calculadora.Calculadora.*;

public class RegraDeTres {
	public static float executar(float valorReferencia1, float valorReferencia2, float valorReferencia3) {
		return dividir(multiplicar(valorReferencia3, valorReferencia2), valorReferencia1); 
	}
	
	public static void main(String[] args) {
		System.out.println(RegraDeTres.executar(1500, 75, 500));
	}
}


/*
 *  ValorReferencia1 est� para ValorReferencia2
 *  Assim como
 *  ValorReferencia3 est� para Resultado 
 *  
 *  ValoReferencia * Resultado  = ValorReferencia3 * ValorReferencia2
 *  
 *  Resultado = (ValorReferencia3 * ValorReferencia2)/ValorReferencia
 *  
 *  
 *  50 est� para 200
 *  Assim como
 *  10 est� para X 
 *  
 *  ValoReferencia * Resultado  = ValorReferencia3 * ValorReferencia2
 *  
 *  Resultado = (ValorReferencia3 * ValorReferencia2)/ValorReferencia
 *    
 */

