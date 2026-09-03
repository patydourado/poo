package exemplos;

public class ExExcecao {

	public static void main(String[] args) {
		int numerador = 10;
		int denominador = 0;
		
		try {
			int resultado = numerador/denominador;
			System.out.print("Resultado: " + resultado);
		}catch(ArithmeticException e) {
			System.err.println("Mensagem do sistema" + e.getMessage());
			System.out.println("Não é possível realizar uma divisão por zero");
		}
	}
}
