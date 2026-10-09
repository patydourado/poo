package exercicios.encapsulamento;

/*
 * Classe criada para testar a classe ContaBancaria.java
 * Conteúdo central: encapsulamento e construtores
 * obs: Código parcialmente gerado pelo Gemini
 */
public class TesteComEncapsulamento {

	public class Aplicacao {

	    public static void main(String[] args) {
	        System.out.println("=== CRIANDO A CONTA BANCÁRIA ===");
	        
	        // Instanciação usando o construtor parametrizado
	        ContaBancaria conta = new ContaBancaria("Maria Silva", "12345-X");
	        
	        System.out.println("Titular: " + conta.getTitular());
	        System.out.println("Número da Conta: " + conta.getNumeroConta());
	        System.out.println("Saldo Inicial: R$ " + conta.getSaldo());

            if (conta.isAtiva()) {
                status = "Ativa";
            } else {
                status = "Inativa";
            }

            System.out.println("Status da Conta: " + status);

            //Segunda forma de escrita (Uso do operador ternário)
	        //System.out.println("Status da Conta: " + (conta.isAtiva() ? "Ativa" : "Inativa"));

	        System.out.println("\n=== TESTANDO OPERAÇÕES VÁLIDAS ===");
	        conta.depositar(500.00);
	        System.out.println("Saldo após depósito de R$ 500: R$ " + conta.getSaldo());

	        boolean saqueComSucesso = conta.sacar(200.00);
	        if (saqueComSucesso) {
	            System.out.println("Saque de R$ 200 efetuado com sucesso!");
	        }
	        System.out.println("Saldo Atual: R$ " + conta.getSaldo());

	        System.out.println("\n=== TESTANDO REGRAS DE PROTEÇÃO (ENCAPSULAMENTO) ===");
	        
	        // 1. Tentativa de saque superior ao saldo disponível
	        System.out.print("Tentando sacar R$ 1000.00: ");
	        conta.sacar(1000.00);
	        System.out.println("Saldo mantido: R$ " + conta.getSaldo());

	        // 2. Tentativa de depósito inválido (valor negativo)
	        System.out.print("Tentando depositar R$ -50.00: ");
	        conta.depositar(-50.00);
	        System.out.println("Saldo mantido: R$ " + conta.getSaldo());

	        // 3. Encerrando a conta e tentando operar
	        System.out.println("\nEncerrando a conta...");
	        conta.encerrarConta();
	        System.out.println("Status da Conta: " + (conta.isAtiva() ? "Ativa" : "Inativa"));

	        System.out.print("Tentando depositar R$ 100.00 em conta inativa: ");
	        conta.depositar(100.00);
	        System.out.println("Saldo mantido: R$ " + conta.getSaldo());

	        // A linha abaixo causaria erro de compilação, pois o saldo está protegido!
	        // conta.saldo = 1000000.00; 
	    }
	}
}