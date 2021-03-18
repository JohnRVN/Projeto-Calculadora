package calculadora;

import java.util.Scanner;

public class OperacoesBasicas {

	public static void main(String[] args) {
		float a = 0, b = 0;
		a = digitarNumero();
		exibirMenuOpcoesOperacoes();
		String operacao = digitarTexto();
		exibirMenuDigitarSegundoNumero(operacao);
		b = digitarNumero();
		String resultado = executarOperacaoSelecionada(operacao, a, b);
		exibirResultado(resultado);
	}
	
	public static void exibirMenuDigitarPrimeiroNumero() {
		System.out.println("----------Calculadora----------\n");
		System.out.print("Digite o primeiro valor: ");
	}
	
	public static void exibirMenuDigitarSegundoNumero(String operacao) {
		System.out.println("\n-------------------------------\n");
		
		System.out.println("Opera��o " + operacao + " Selecionado.\n");
		System.out.print("Digite o segundo valor: ");
	}
	
	public static void exibirMenuOpcoesOperacoes() {
		System.out.println("\nSelecione a Opera��o Desejada\n\n");
		System.out.print("*******************************\n"
				+        "(+) = Soma"
				+        "\n(-) = Subtra��o"
				+        "\n(*) = Multiplica��o"
				+        "\n(/) = Divis�o"
	            +        "\n*******************************"
				+        "\n\nOpera��o: ");
	}
	
	public static void exibirResultado(String resp) {
		System.out.print("\nRESULTADO: " + resp);
	}
	
	public static String executarOperacaoSelecionada(String operacao, float a, float b) {
		float resp = 0;
		switch(operacao) {
		case "+":
			resp = Calculadora.somar(a, b);
			break;
		case "-":
			resp = Calculadora.subtrair(a, b);
			break;
		case "*":
			resp = Calculadora.multiplicar(a, b);
			break;
		case "/":
			resp = Calculadora.dividir(a, b);
			break;
		}
		
		return String.valueOf(resp);
	}
	
	public static float digitarNumero() {
		Scanner scan = new Scanner(System.in);
		float resultado = scan.nextFloat();
		scan.close();
		return resultado;
	}
	
	public static String digitarTexto() {
		Scanner scan = new Scanner(System.in);
		String resultado = scan.next();
		scan.close();
		return resultado;
	}
}
