
import java.util.Scanner;
public class ContaCorrente {
	
	//Número Documento da Conta
	private int numero_doc_cc;
	
	public int getNumero_doc_cc() {
		return numero_doc_cc;
	}

	public void setNumero_doc_cc(int numero_doc_cc) {
		this.numero_doc_cc = numero_doc_cc;
	}
	  
	
	
	// Agencia da Conta
	private int agencia_cc;
	
	public int getAgencia_cc() {
		return agencia_cc;
	}
	
	public void setAgencia_cc(int agencia_cc) {
		this.agencia_cc = agencia_cc;
	}
	
	
	// Conta Corrente
	private int conta_cc;

	public int getConta_cc() {
		return conta_cc;
	}
	
	public void setConta_cc (int conta_cc) {
		this.conta_cc = conta_cc;
	}
	
	
	// Valor da Conta
	private float valor_cc;
	
	public float getValor_cc() {
		return valor_cc;
	}
	
	public void setValor_cc(float valor_cc) {
		this.valor_cc = valor_cc;
	}
	
	
	// Tipo de Conta
	private int tipo_cc ;
	
	public int getTipo_cc() {
		return tipo_cc;
	}
	
	public void setTipo_cc(int tipo_cc) {
		this.tipo_cc = tipo_cc;
	}
	
	
	
	// Data da Ocorrencia da Conta
	private String data_ocorrencia_cc ;
	
	public String getData_ocorrencia_cc() {
		return data_ocorrencia_cc;
	}
	
	public void setData_ocorrencia_cc(String data_ocorrencia_cc) {
		this.data_ocorrencia_cc = data_ocorrencia_cc;
	}
	
	
	
	// Saldo Anterior Conta
	private float saldo_cc;
	
	public float getSaldo_cc () {
		return saldo_cc;
	}
	
	public void setSaldo_cc(float saldo_cc) {
		this.saldo_cc = saldo_cc;	
	}
	
	/*===========================================================================*/
	/*===========================================================================*/
	/*===========================================================================*/
	
	public void AtulizarSaldo() {
		
	}

	public void RegistrarOcorrencia() {
		
	}
}
