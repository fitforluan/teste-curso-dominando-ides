package br.com.dio.calculadora;

import java.util.Scanner;

import com.azul.crs.client.sysinfo.SystemInfoProvider;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;

		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();

		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao (a,b);
		float divisao = divisao(a,b);
		
		System.out.println("Soma " + soma);
		System.out.println("Sub " +subtracao);
		System.out.println("multi " + multiplicacao);
		System.out.println("div " + divisao);
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static int divisao(int a, int b) {
		return a / b;
	}

	public static int soma(int a, int b) {
		return a + b;
	}

}
