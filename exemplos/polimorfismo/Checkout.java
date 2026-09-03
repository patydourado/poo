package polimorfismo;

class Checkout {
   
    public void finalizarCompra(MeioPagamento meioEscolhido, double total) {
        System.out.println("--- Iniciando Fechamento do Pedido ---");
        
        // Aqui acontece o Polimorfismo!
        meioEscolhido.processar(total); 
        
        System.out.println("--- Pedido Finalizado com Sucesso ---");
    }
}
