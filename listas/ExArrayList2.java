package exemplos;

import java.util.ArrayList;

public class ExArrayList2 {

	public static void main(String[] args) {

		ArrayList<Produto> produtos = new ArrayList<Produto>();

		Produto produto1 = new Produto("café", 10.50);
		Produto produto2 = new Produto("leite", 5.50);

		produtos.add(produto1);
		produtos.add(produto2);

		System.out.println(produtos);

		boolean existe = produtos.contains(produto1);

		if (existe) {
			System.out.println("O item está na lista");
		} else {
			System.out.println("Não existe");
		}

		produtos.remove(0);

		System.out.println("Lista Final");
		System.out.println(produtos);

	}
}
