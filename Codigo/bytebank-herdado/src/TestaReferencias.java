
public class TestaReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();

		g1.setNome("Klayton Souza");
		g1.setSalario(5000);

		EditorVideo e = new EditorVideo();
		e.setSalario(2500);

		Designer d = new Designer();
		d.setSalario(2000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e);
		controle.registra(d);

		System.out.println(controle.getSoma());
	}

}
