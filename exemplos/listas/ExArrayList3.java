package exemplos;

import java.util.ArrayList;

/*
 * Exemplo de uso do for each e busca por nome do produto
 */
public class ExArrayList3 {

	public static void main(String[] args) {

		ArrayList<Produto> produtos = new ArrayList<Produto>();

		Produto produto1 = new Produto("café", 10.50);
		Produto produto2 = new Produto("leite", 5.50);
		Produto produto3 = new Produto("café", 1.50);

		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);

		System.out.println("Lista de nomes");
		for (Produto produto : produtos) {
			System.out.println("Produto " + produto.getNome());
		}
		
		System.out.println();
		System.out.println("Lista de busca por nomes");
		for (Produto produto : produtos) {
			if (produto.getNome().equals("café")) {
				System.out.println("O produto foi selecionado");
			}
		}

	}
}
