package polimorfismo;

class CartaoCredito extends MeioPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("[CARTÃO] Processando pagamento de R$ " + valor);
        System.out.println("[CARTÃO] Conectando com a operadora... Transação autorizada!");
    }
}
