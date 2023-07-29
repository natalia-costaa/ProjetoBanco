package br.com.banco;


public abstract class Conta {
	
	protected double saldo;
		
	
	public void depositar(double deposito) {
		saldo += deposito;
	}
	
	public void sacar(double valor) {
		if (saldo >= valor) {
			valor += valor * 0.015;
			saldo-= valor;
		} else if (saldo < valor){
			System.out.println("Saldo insuficiente!");
		} else if (valor < 0) {
			System.out.println("Operação inválida!");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
