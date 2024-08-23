package principal;

import java.util.Scanner;

import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Cadastro {
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("digite o nome");
			String nome = scn.next();
			
			System.out.println("digite o numero");
			int numero = scn.nextInt();
			
			System.out.println("voce deseja cadastrar um conta poupanca ou corrente? \n1 - Para poupança \n2 - Para corrente");
			int opcao= scn.nextInt();
			
			System.out.println("digite um valor para ser depositado");
			int saldo = scn.nextInt();
			
			Conta c = new ContaCorrente(nome, numero, 0, saldo);	
			Conta p = new ContaPoupanca(nome, numero, saldo);	
			
			c.depositar(saldo);
			
			if(opcao == 1) {
				System.out.println("Conta cadastrada!:  /nTipo de conta:  poupança  /nNome: " +  nome + " " + "/nNumero da conta: " + numero + "/nSaldo depositado:" + saldo);
				System.out.println();
			}
			else if (opcao ==2) {
				System.out.println("Conta cadastrada!:  /nTipo de conta:  poupança  /nNome: " +  nome + " " + "/nNumero da conta: " + numero + "/nSaldo depositado:" + saldo);
				System.out.println();
				
			}	
		}
		}
		

	}
