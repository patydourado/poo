package polimorfismo;

class CheckoutSemPolimorfismo {
    
    public void finalizarCompra(String tipoPagamento, double total) {
        System.out.println("\n--- Iniciando Fechamento do Pedido ---");
        
        if (tipoPagamento.equalsIgnoreCase("PIX")) {
            Pix pix = new Pix();
            pix.processarPix(total);
        } 
        else if (tipoPagamento.equalsIgnoreCase("CARTAO")) {
            CartaoCredito cartao = new CartaoCredito();
            cartao.processarCartao(total);
        } 
        else if (tipoPagamento.equalsIgnoreCase("BOLETO")) {
            Boleto boleto = new Boleto();
            boleto.processarBoleto(total);
        } 
        else {
            System.out.println("Erro: Meio de pagamento inválido!");
        }
        
        System.out.println("--- Pedido Finalizado com Sucesso ---");
    }
}
