package exemplos.excecao.basico;

public class DivisaoInutil extends Exception {
	
	public DivisaoInutil() {
		super();
	}
	
	public DivisaoInutil(String message) {
		super(message);
	}
}