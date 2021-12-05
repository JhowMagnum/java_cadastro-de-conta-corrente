import java.util.Scanner;
public class Executor {

	public static void main(String[] args) {
		// SET configurar(colocar) dados
		// GET obter(pegar) dados
		
		Scanner	dados = new Scanner(System.in);	
		
		
		// === Dados do Cliente ===
		//Cliente nomeCliente = new Cliente();
		//System.out.println("--- Dados do Cliente ---");
		//nomeCliente.MostrarCliente();
		
		
		
		// === Dados da Conta Corrente ===
		ContaCorrente CC0 = new ContaCorrente();
		System.out.printf("Digite o número do documento: ");
		CC0.setNumero_doc_cc(dados.nextInt()); 
		
		System.out.printf("Digite o número da agência: ");
		CC0.setAgencia_cc(dados.nextInt());
		
		System.out.printf("Digite o número da conta: ");
		CC0.setConta_cc(dados.nextInt());
		
		System.out.printf("Digite o valor: ");
		CC0.setValor_cc(dados.nextFloat());
		
		System.out.print("Digite o tipo da conta: ");
		CC0.setTipo_cc(dados.nextInt());
		
		System.out.print("Digite a data de Ocorrência: ");
		CC0.setData_ocorrencia_cc(dados.next());
		
		System.out.print("Digite o valor do saldo: ");
		CC0.setSaldo_cc(dados.nextFloat());
		
		
		// Impressão
		System.out.println("\n--- Conta Corrente ---");
		System.out.println("Número Documento: " + CC0.getNumero_doc_cc());
		System.out.println("Agência: " + CC0.getAgencia_cc());
		System.out.println("Conta: " + CC0.getConta_cc());
		System.out.println("Valor: " + CC0.getValor_cc());
		System.out.println("Tipo: " + CC0.getTipo_cc() + " (Depósito)");
		System.out.println("Data Ocorrência: " + CC0.getData_ocorrencia_cc());
		System.out.println("Saldo anterior: " + CC0.getSaldo_cc());
		
		
		
		/*
		ContaCorrente C_C1 = new ContaCorrente();
		C_C1.setSaldo_cc(5000.0f);
		System.out.println("Saldo: "+ C_C1.getSaldo_cc());
		 */
	}

}
