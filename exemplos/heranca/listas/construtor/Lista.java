package exemplos;

//Código original: @autor Prof. André Santanchè
public class Lista {
   protected int vlista[];
   protected int ultimo = -1;
   
   public Lista(int tamanho) {
      vlista = new int[tamanho];
   }
   
   public void adicionar(int item) {
      if (ultimo+1 < vlista.length) {
         ultimo++;
         vlista[ultimo] = item;
      }
   }
   
   public String toString() {
      String str = "";
      for (int l = 0; l <= ultimo; l++)
         str += vlista[l] + ((l < ultimo) ? ", " : "");
      return str;
   }
}
