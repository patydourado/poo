package exemplos;

//Código original: @autor Prof. André Santanchè
public class App02HerancaLista {

   public static void main(String[] args) {
      ListaUtil lu = new ListaUtil();
      lu.adicionar(10);
      lu.adicionar(5);
      lu.adicionar(20);
      lu.adicionar(5);
      lu.adicionar(35);
      lu.adicionar(35);
      lu.adicionar(15);
      lu.adicionar(10);
      lu.adicionar(35);
      lu.setDuplicatas(false);
      lu.ordena();
      System.out.println("Ordenado: " + lu);
   }

}
