package contaBancaria;

public class Fisica extends Conta {
	@Override
	// m�todo que saca uma determinada quantidade.
	public boolean sacar(double valor) {
		System.out.println("Fisica");
		boolean retorno = false;
		if (this.saldo < valor) {

		} else {
			this.saldo = this.saldo - valor;
			retorno = true;
		}
		return retorno;
	}// fim do m�todo sacar.

	@Override
	public void depositar(double valor) {
		// m�todo que deposita uma quantia.
		this.saldo += valor; // ou this.saldo = saldo + valor;
		// *soma quantidade ao valor antigo do saldo
		// e guarda no pr�prio saldo.
	}// fim do m�todo deposita.
}
