package br.com.banco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente() {
		super.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		saldo += deposito;
	}
	
	
	

}
