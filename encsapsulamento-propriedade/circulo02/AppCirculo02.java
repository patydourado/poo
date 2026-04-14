package poo.ucsal.br;

public class AppCirculo02 {

	public static void main(String[] args) {
	   Circulo circ = new Circulo(5, 3, 10);
		  
     System.out.println("Circulo: raio = " + circ.getRaio());
     System.out.println("Circulo: area = " + circ.area());
     
     circ.setRaio(20);
     System.out.println("Circulo: area = " + circ.area());

	}
}
