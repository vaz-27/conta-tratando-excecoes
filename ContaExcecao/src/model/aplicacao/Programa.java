package model.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.ExcecoesDominio;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Número da conta: ");
			Integer nConta = sc.nextInt();
			System.out.print("Títular: ");
			String nome = sc.next();
			System.out.print("Saldo inicial: ");
			Double balanco = sc.nextDouble();
			System.out.print("Limite de saque: ");
			Double limite = sc.nextDouble();
			
			Conta conta = new Conta(nConta, nome, balanco, limite);
			System.out.println();
			
			System.out.print("Entre com o valor do saque: ");
			Double montante = sc.nextDouble();
			conta.saque(montante);
			
			System.out.println("Novo Saldo: "+ conta.getBalanco());
		}
		
		catch(ExcecoesDominio e) {
			System.out.println("Erro no saque: "+ e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro inesperado!");
		}

	sc.close();
	}

}
