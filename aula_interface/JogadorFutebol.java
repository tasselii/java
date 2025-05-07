
public class JogadorFutebol extends Pessoa implements Corredor{

	public JogadorFutebol(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo no gramado...");
		
	}

	@Override
	public void correr() {
		System.out.println("Jogando futebol...");
		
	}

	@Override
	public void cansou() {
		System.out.println("Aquecendo no gramado...");
		
	}

}
