
public class Executor {

	public static void main(String[] args) {
		// SET configurar(colocar) dados
		// GET obter(pegar) dados
				
		
		
		// === Dados do Cliente ===
		Cliente nomeCliente = new Cliente();
		System.out.println("--- Dados do Cliente ---");
		nomeCliente.MostrarCliente();
		
		
		
		// === Dados da Conta Corrente ===
		ContaCorrente CC0 = new ContaCorrente();
		CC0.setNumero_doc_cc(23456789);
		CC0.setAgencia_cc(100);
		CC0.setConta_cc(100);
		CC0.setValor_cc(50.0f);
		CC0.setTipo_cc(1);
		CC0.setData_ocorrencia_cc("20/10/2021");
		CC0.setSaldo_cc(100.0f);
		
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
