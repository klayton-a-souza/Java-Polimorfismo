
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente funcionario = new Gerente();
		funcionario.setNome("Klayton Souza");
		funcionario.setCpf("777.777.777-77");
		funcionario.setSalario(3000);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());

	}

}
