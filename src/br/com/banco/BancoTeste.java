package br.com.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BancoTeste {
	
	public static void main(String[] args) {
		
		Conta corrente = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		List<String> extrato = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		
		while (true) {
		
		System.out.print("##--MENU MEU BANCO--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Saldo             |\n");
        System.out.print("| Opção 2 - Depósito          |\n");
        System.out.print("| Opção 3 - Saque             |\n");
        System.out.print("| Opção 4 - Extrato           |\n");
        System.out.print("| Opção 0 - Sair              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("|Digite a opção desejada: ");
        
        int opcao = entrada.nextInt();
        
        switch(opcao) {
        	case 1:
        		while(true) {
        		System.out.print("\n|-----------SALDO-------------|\n");
                System.out.print("| Opção 1 - Corrente          |\n");
                System.out.print("| Opção 2 - Poupança          |\n");
                System.out.print("| Opção 0 - Sair              |\n");
                System.out.print("|-----------------------------|\n");
                System.out.print("|Digite a opção desejada: ");
                int numero = entrada.nextInt();
                
                if(numero == 1) {
                	System.out.println("|O saldo da conta corrente é " + corrente.getSaldo());
                } else if (numero == 2) {
                	System.out.println("|O saldo da conta poupança é " + poupanca.getSaldo());
                } else if (numero != 0) {
                    System.out.println("Operação Inválida!");
        		}
        			if(numero == 0) {
        			break;
        			}
        		}
        		break;
        	case 2:
        		while(true) {
            		System.out.print("\n|----------DEPOSITO-----------|\n");
                    System.out.print("| Opção 1 - Corrente          |\n");
                    System.out.print("| Opção 2 - Poupança          |\n");
                    System.out.print("| Opção 0 - Sair              |\n");
                    System.out.print("|-----------------------------|\n");
                    System.out.print("|Digite a opção desejada: ");
                    
                    int numero = entrada.nextInt();
                    
                    if(numero == 1) {
                    	System.out.print("|Digite o valor a ser depositado na Conta Corrente: ");
                    	double valor = entrada.nextDouble();
                    	corrente.depositar(valor);
                    	extrato.add("Depósito CC: " + valor);
                    	
                    } else if (numero == 2) {
                    	System.out.print("Digite o valor  a ser depositado Conta Poupança: ");
                    	double valor = entrada.nextDouble();
                    	poupanca.depositar(valor);
                    	extrato.add("Depósito CP: " + valor);
                    	
                    } else if (numero != 0) {
                    
                    	System.out.println("Operação Inválida!");
            		}
            			if(numero == 0) {
            			break;
            			}
            		}
            		break;
        	case 3: 
        		while(true) {
            		System.out.print("\n|-----------SAQUE-------------|\n");
                    System.out.print("| Opção 1 - Corrente          |\n");
                    System.out.print("| Opção 2 - Poupança          |\n");
                    System.out.print("| Opção 0 - Sair              |\n");
                    System.out.print("|-----------------------------|\n");
                    System.out.print("|Digite a opção desejada: ");
                    
                    int numero = entrada.nextInt();
                    
                    if(numero == 1) {
                    	System.out.print("|Digite o valor a ser sacado na Conta Corrente: ");
                    	double valor = entrada.nextDouble();
                    	corrente.sacar(valor);
                    	extrato.add("Saque CC: " + valor);
                    	
                    } else if (numero == 2) {
                    	System.out.print("Digite o valor a ser sacado na Conta Poupança: ");
                    	double valor = entrada.nextDouble();
                    	poupanca.sacar(valor);
                    	extrato.add("Saque CP: " + valor);
                    	
                    } else if (numero != 0) {
                        System.out.println("Operação Inválida!");
            		}
            			if(numero == 0) {
            			break;
            			}
            		}
            		break;
        	case 4:
        		while(true) {
        			System.out.print("\n|-----------EXTRATO-----------|\n");
                    System.out.print("| Opção 1 - Gerar extrato     |\n");
                    System.out.print("| Opção 0 - Sair              |\n");
                    System.out.print("|-----------------------------|\n");
                    System.out.print("|Digite a opção desejada: ");
                    
                    int numero = entrada.nextInt();
                    
                    if (numero == 1 ) {
                    	System.out.println("\n ##-- EXTRATO MEU BANCO--## \n");
                    	System.out.printf("Saldo atual Conta Corrente: %.2f. \n", corrente.getSaldo());
                    	System.out.printf("Saldo atual Conta Poupança: %.2f. \n", poupanca.getSaldo());
                    	System.out.println(" ");
                    	 for(String lista: extrato) {
                    		 System.out.println(lista);
                    	 }
                    } else if(numero != 0) {
                    	System.out.println("Operação Inválida!");
                    }
                     
                    if (numero == 0) {
                    	 break;
                     }
        		}
        		break;
        	}
        if(opcao == 0) {
        	System.out.println("Obrigado(a) por escolher o MEU BANCO!");
        	break;
        }
        
        
        }
		entrada.close();
		
	}

}
