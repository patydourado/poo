package polimorfismo;

/**
 * Exemplificar a classe abstrata que não pode ser instanciada.
 */
abstract class MeioPagamento {

    //Método abstrato não possui implementação
    public abstract void processar(double valor);
}
