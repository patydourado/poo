package exercicios.encapsulamento;

public class TesteSemEncapsulamento {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Carlos";
        conta.saldo = 1000.00;
       
        // Problemas graves:
        conta.saldo = -5000.00; // Saldo negativo sem validação
        conta.saldo = conta.saldo + 1000000.00; // Alteração direta sem registro
        conta.titular = ""; // Nome inválido
    }
}
