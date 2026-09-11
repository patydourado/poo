package classes.circulo02;

/*
 * Classe com construtor criado pelo desenvolvedor.
 * Uso da palavra reservada this para diferenciar atributo do parâmetro.
 */
public class Circulo {
	int centroX, centroY, raio;

  public Circulo(int centroX, int centroY, int raio) {
		this.centroX = centroX;
		this.centroY = centroY;
		this.raio = raio;
	}
	
	void mostraArea() {
		System.out.println(Math.PI * raio*raio);
	}
}
