package contaBancaria;

import java.util.Scanner;

public class Programa {
	// método principal.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// criando a conta
		// variável minha conta do tipo conta.
		Juridica fs1 = new Juridica(); // ou pode ser tbm Conta minhaConta = new Conta();
		Cliente fs = new Cliente();
//		cl.setNome("Janio");
//		System.out.println(cl.getNome());
	
		// alterando os valores de minhaConta.
//		minhaConta.dono = "Janio";
        fs.setSaldo(3000);

		// verificar saldo atual
		System.out.println("Saldo atual é: " + fs.getSaldo());

		// saca quanto quiser
		System.out.println("Deseja sacar algum valor?");
		String ps = in.next();
		if (ps.equals("s")) {
			System.out.println("Quanto deseja sacar? ");
			double s = in.nextDouble();
			if (fs.sacar(s)) {
				System.out.println(fs.getSaldo());
			} else {
				System.out.println("Saldo insuficiente");
				System.out.println("Deseja sacar outro valor?");
				String v = in.next();
				if (v.equals("s")) {
					System.out.println("Quanto deseja sacar?");
					double ns = in.nextDouble();
					fs.sacar(ns);
				}
			}
		}

		// deposita xxx reais
		System.out.println("Deseja depositar algum valor?");
		String v = in.next();
		if (v.equals("s")) {
			System.out.println("Qual valor do depósito?");
			double d = in.nextDouble();
			fs.depositar(d);
		}

		System.out.println(">>>>>>>>Saldo atual é: " + fs.getSaldo());
	}
}
