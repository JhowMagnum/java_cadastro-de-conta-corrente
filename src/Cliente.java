
public class Cliente {
	
	private Integer agencia = 100;

	private Integer conta = 36567;
	
	private String cpf = "123.456.788-90";
	
	private String nome = "José da Silva";
	
	private String nascimento = "15/06/1995";
	
	private String endereco = "Av. dos autonomistas 234";
	
	private String telefone = "(11)9123-456 ";
	
	private Float saldo = 100.0f;
	
	private String senha = "abc#123";
	
	public void MostrarCliente() {
		
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("CPF: "+ cpf);
		System.out.println("CPF: "+ cpf);
		System.out.println("Nome: "+ nome);
		System.out.println("Nascimento: "+ nascimento);
		System.out.println("Endereço: "+ endereco);
		System.out.println("Telefone: "+ telefone);
		System.out.println("Saldo: "+ saldo);
		System.out.println("Senha: "+ senha);
		
	}

}
