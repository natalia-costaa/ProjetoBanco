package br.com.banco;

import java.util.ArrayList;

public class Banco {
	
	ArrayList <Cliente> listaClientes = new ArrayList<>();
	Conta conta;
	
	public void adicionarCliente(Cliente cliente) {
		this.listaClientes.add(cliente);
	}
	
	public void adicionarCliente(String nome, String cpf) {
		this.adicionarCliente(new Cliente (nome, cpf));
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	
	
	

}
