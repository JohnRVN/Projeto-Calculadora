package calculadora;
	
	import java.util.Scanner;

public class OperacoesBasicas {

	public static void main(String[] args) {
		
		float a = 0, b = 0, resp = 0;
		String operacao = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("----------Calculadora----------\n");
		System.out.print("Digite o primeiro valor: ");
		a = scan.nextFloat();
		System.out.println("\nSelecione a Opera��o Desejada\n\n");
		System.out.print("*******************************\n"
				+        "(+) = Soma"
				+        "\n(-) = Subtra��o"
				+        "\n(*) = Multiplica��o"
				+        "\n(/) = Divis�o"
	            +        "\n*******************************"
				+        "\n\nOpera��o: ");
		operacao = scan.next();
		
		System.out.println("\n-------------------------------\n");
		
		switch(operacao) {
		case "+":
			System.out.println("Opera��o Soma Selecionado.\n");
			System.out.print("Digite o segundo valor: ");
			b = scan.nextFloat();
			resp = a + b;
			System.out.print("\nRESULTADO: " + resp);
			break;
		
		case "-":
			System.out.println("Opera��o Subtra��o Selecionado.\n");
			System.out.print("Digite o segundo valor: ");
			b = scan.nextFloat();
			resp = a - b;
			System.out.print("\nRESULTADO: " + resp);
			break;
			
		case "*":
			System.out.println("Opera��o Multiplica��o Selecionado.\n");
			System.out.print("Digite o segundo valor: ");
			b = scan.nextFloat();
			resp = a * b;
			System.out.print("\nRESULTADO: " + resp);
			break;
			
		case "/":
			System.out.println("Opera��o Divis�o Selecionado.\n");
			System.out.print("Digite o segundo valor: ");
			b = scan.nextFloat();
			resp = a / b;
			System.out.print("\nRESULTADO: " + resp);
			break;
		}
		
	}
}
