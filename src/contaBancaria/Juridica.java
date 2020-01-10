package contaBancaria;

public class Juridica extends Conta{	
	@Override
	// método que saca uma determinada quantidade.
	public boolean sacar(double valor) {
		System.out.println("Juridica");
		boolean retorno = false;
		if (this.saldo < valor) {

		} else {
			this.saldo = this.saldo - valor;
			retorno = true;
		}
		return retorno;
	}// fim do método sacar.

	@Override
	public void depositar(double valor) {
		// método que deposita uma quantia.
		this.saldo += valor; // ou this.saldo = saldo + valor;
		// *soma quantidade ao valor antigo do saldo
		// e guarda no próprio saldo.
	}// fim do método deposita.
}
