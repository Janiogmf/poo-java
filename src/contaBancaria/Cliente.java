package contaBancaria;

public class Cliente extends Fisica {
	private String nome;
//		private Double saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
//
	@Override
	// método que saca uma determinada quantidade.
	public boolean sacar(double valor) {
		System.out.println("Cliente");
		boolean retorno = false;
		if (this.saldo < valor) {

		} else {
			this.saldo = this.saldo - valor;
			retorno = true;
		}
		return retorno;
	}// fim do método sacar.
}
