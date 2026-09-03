package poo;

public class Carro {
    // Atributos de instância (cada carro tem o seu)
    private String modelo;
    private String placa;

    // Atributo estático (compartilhado por todos os carros)
    private static int contadorCarros = 0;

    // Construtor
    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        
        // Sempre que um novo objeto é criado, incrementamos o contador da CLASSE
        contadorCarros++;
    }

    // Método de instância
    public void exibirDados() {
        System.out.println("Modelo: " + this.modelo + " | Placa: " + this.placa);
    }

    // Método estático (pode ser chamado sem criar um objeto)
    public static int getTotalCarros() {
        return contadorCarros;
    }
}
