package exemplo;

import java.util.ArrayList;

/*
 * Exemplo básico com os principais métodos do ArrayList
 * add, contains, indexOf, get, remove
 */
public class ExArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> produtos = new ArrayList<String>();

		produtos.add("café");
		produtos.add("leite");
		produtos.add(0, "açúcar");
		
		System.out.println(produtos);
		
		boolean existe = produtos.contains("pão");
		
		if(existe) {
			System.out.println("O item está na lista");
		}else {
			System.out.println("Não existe");
		}
		
		int indice = produtos.indexOf("café");
		System.out.println("O índice do café é " + indice);
	
		System.out.println("O produto de índice 2 é "+
				produtos.get(2));
		
		produtos.remove("café");
    
		System.out.println("LISTA FINAL");
		System.out.println(produtos);
	}

}
