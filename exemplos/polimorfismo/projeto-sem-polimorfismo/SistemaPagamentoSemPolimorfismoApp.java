package polimorfismo;

public class SistemaPagamentoSemPolimorfismoApp {
    public static void main(String[] args) {
        Checkout caixaDoEcommerce = new Checkout();
        
        caixaDoEcommerce.finalizarCompra("PIX", 150.00);
        caixaDoEcommerce.finalizarCompra("CARTAO", 450.50);
        caixaDoEcommerce.finalizarCompra("BOLETO", 89.90);
    }
}
