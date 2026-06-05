package polimorfismo;

public class SistemaPagamentoApp {
    public static void main(String[] args) {
    	
    	/**
    	 * Não é possível instanciar MeioPagamento (Classe abstrata)
    	 * MeioPagamento cliente = new MeioPagamento();
    	 */
        Checkout caixaDoEcommerce = new Checkout();

        // Cliente 1 escolhe PIX
        MeioPagamento cliente1 = new Pix();
        caixaDoEcommerce.finalizarCompra(cliente1, 150.00);

        // Cliente 2 escolhe Cartão de Crédito
        MeioPagamento cliente2 = new CartaoCredito();
        caixaDoEcommerce.finalizarCompra(cliente2, 450.50);

	}
}
