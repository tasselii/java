public class TestaTriatleta {

	public static void main(String[] args) {
		
		Triatleta t1 = new Triatleta("Thiago");
		
		JogadorFutebol player1 = new JogadorFutebol("Maria");
		
		t1.visualizar();
		
		t1.aquecer();
		t1.nadar();
		t1.pedalar();
		t1.correr();
		t1.cansou();
		
		System.out.println();
		
		player1.visualizar();
		player1.aquecer();
		player1.correr();
		player1.cansou();
	}
}
