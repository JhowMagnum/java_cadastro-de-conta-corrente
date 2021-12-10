import java.util.Scanner;
public class Cliente {
	
	// Agencia do Cliente
	private int agencia;
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	// Conta do Cliente
	private int conta;
	
	public int getConta() {
		return conta;
	}
	
	public void setConta (int conta) {
		this.conta = conta;
	}
	
	// CPF do Cliente
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// Nome do Cliente
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome  = nome;
	}
	
	// Data de Nascimento do Cliente
	private String nascimento;
	
	public String getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	// Endereço do Cliente
	private String endereco;
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	// Telefone do Cliente
	private String telefone;
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// Saldo do Cliente
	private float saldo;
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	// Senha do Cliente
	private String senha;
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
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
