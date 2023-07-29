package br.com.banco;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		super.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		deposito += deposito * 0.02;
		saldo += deposito;
	}
	

}
