package exercicio;

public class TesteCalculadora {

    public static void main(String[] args) {
        // Chamada direta dos métodos estáticos sem instanciar Calculadora
        int soma = Calculadora.adicionar(10, 5);
        int subtracao = Calculadora.subtrair(20, 8);
        int multiplicacao = Calculadora.multiplicar(4, 3);
        int divisao = Calculadora.dividir(50, 0);

        // Exibindo os resultados das operações
        System.out.println("10 + 5 = " + soma);
        System.out.println("20 - 8 = " + subtracao);
        System.out.println("4 * 3  = " + multiplicacao);
        System.out.println("50 / 2 = " + divisao);

        System.out.println("-----------------------------------");

        // Acesso ao contador total de operações através do getter estático
        System.out.println("Total de operações realizadas: " + Calculadora.getContadorOperacoes());
    }
}
