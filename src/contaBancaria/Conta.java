package contaBancaria;
public abstract class Conta {
	// Atributos da conta
	protected int numero;
	protected double saldo;
	protected double limite;
	protected String tipoConta;

	// Metodos da conta
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public abstract boolean sacar(double valor);

	public abstract void depositar(double valor);

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}// fim da classe Conta.
