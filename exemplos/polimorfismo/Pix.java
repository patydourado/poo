package polimorfismo;

class Pix extends MeioPagamento{
    
    @Override
    public void processar(double valor) {
        System.out.println("[PIX] Processando pagamento de R$ " + valor);
        System.out.println("[PIX] QR Code gerado. Chave Pix validada. Pago instantaneamente!");
    }
}
