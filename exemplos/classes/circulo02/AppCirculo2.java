package classes.circulo02;

import java.util.Scanner;

/*
 * Exemplo de aplicação com o uso do contrutor
 * Circulo criado pelo desenvolvedor na classe Circulo.
 */
public class AppCirculo2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int uCentroX, uCentroY, uRaio;
		
		System.out.println("Me informe o centro do círculo");
		uCentroX = scan.nextInt();
		uCentroY = scan.nextInt();
		System.out.println("Me informe o raio do círculo");
		uRaio = scan.nextInt();
		
		//Criação do objeto com parâmetros solicitados ao usuário
		Circulo circ = new Circulo(uCentroX, uCentroY, uRaio);

		System.out.println("Circulo1:" + circ);
		System.out.println("Circulo1: centro(" + circ.centroX + ", " + circ.centroY + "), raio " + circ.raio);
		circ.mostraArea();
		
		//Criação do objeto com parâmetros aleatórios
		Circulo circ2 = new Circulo(15, 3, 7);

		System.out.println("Circulo2:" + circ2);
		System.out.println("Circulo2: centro(" + circ2.centroX + ", " + circ2.centroY + "), raio " + circ2.raio);
		circ2.mostraArea();
		
		scan.close();
	}
}
