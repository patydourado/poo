package exercicios.encapsulamento;

/*
 * Classe criada para exemplicar o uso do padrão JavaBean
 * Conteúdo central: encapsulamento e construtores
 * obs: Código parcialmente gerado pelo Gemini
 */
public class ContaBancaria {
    // Atributos privados (Encapsulamento)
    private String titular;
    private double saldo;
    private String numeroConta;
    private boolean ativa;

    // Construtor sem argumentos (Exigência JavaBeans)
    public ContaBancaria() {
        this.ativa = true;
    }

    // Construtor parametrizado
    public ContaBancaria(String titular, String numeroConta) {
    	this.ativa = true; // ou this()
        setTitular(titular);
        this.numeroConta = numeroConta;
    }

    // Getters e Setters com regras de proteção (JavaBeans)
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do titular é obrigatório.");
        }
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Nota: Não há setSaldo público para evitar alterações arbitrárias do saldo!
    // Padrão 'is' para atributos booleanos
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    // Métodos de Negócio 
    public void depositar(double valor) {
    	if (ativa) {
            if (valor > 0) {
                this.saldo += valor;
            } else {
                System.out.println("Valor de depósito deve ser positivo.");
            }
        } else {
            System.out.println("Conta inativa. Operação cancelada.");
        }
        
        //Segunda opção de escrita
        /*if (!ativa) {
            System.out.println("Conta inativa. Operação cancelada.");
            return;  // Trata a exceção e sai imediatamente
        }
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }*/
    }

    public boolean sacar(double valor) {
        if (!ativa) {
            System.out.println("Conta inativa.");
            return false;
        }
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        System.out.println("Saldo insuficiente ou valor inválido.");
        return false;
    }

    public void encerrarConta() {
        this.ativa = false;
    }

    public void reativarConta() {
        this.ativa = true;
    }
}