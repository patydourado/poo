package poo.ucsal.br;

public class Circulo {
   private int centroX, centroY;
   private int raio;

   public Circulo(int centroX, int centroY, int raio) {
      this.centroX = centroX;
      this.centroY = centroY;
      this.raio = raio;
   }

   public double area() {
      return Math.PI * raio * raio;
   }

  public int getRaio() {
		return raio;
	}

   public void setRaio(int raio) {
		if(raio>0)
			this.raio = raio;
	}
}
