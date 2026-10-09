package exercicios;

public class Calculadora {

    // Atributo estático e privado para registrar o total de operações realizadas
    private static int contadorOperacoes = 0;

    // Método estático para adição
    public static int adicionar(int a, int b) {
        contadorOperacoes++;
        return a + b;
    }

    // Método estático para subtração
    public static int subtrair(int a, int b) {
        contadorOperacoes++;
        return a - b;
    }

    // Método estático para multiplicação
    public static int multiplicar(int a, int b) {
        contadorOperacoes++;
        return a * b;
    }

    // Método estático para divisão
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida."); //Exemplo de tratamento de exceção (não é o conteúdo central deste exercício). Apenas um exemplo.
        }else {
        	contadorOperacoes++;
        	return a / b;
        }
        
    }

    // Método de acesso (getter) necessário devido ao encapsulamento (private)
    public static int getContadorOperacoes() {
        return contadorOperacoes;
    }
}
