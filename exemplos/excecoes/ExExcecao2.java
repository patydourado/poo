package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exemplifica o uso de capturas de múltiplas exceções e 
 * demonstra o uso do finally
 */
public class ExExcecao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Digite o numerador");
			int numerador = teclado.nextInt();
			
			System.out.println("Digite o denominador");
			int denominador = teclado.nextInt();
			
			int resultado = numerador/denominador;
			System.out.print("Resultado: " + resultado);
		}catch(ArithmeticException e) {
			System.err.println("Mensagem do sistema" + e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("Tipos incompatíveis. Digite um número inteiro");
		}finally {
			teclado.close();
		}
		
		System.out.println("Impressão após o bloco try catch");
	}
