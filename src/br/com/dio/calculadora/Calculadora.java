package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a,b;
		
		
		
		
		System.out.println("digite o primeir o valor: ");
		a=scan.nextInt();
		
		System.out.println("digite o segundo o valor: ");
		b=scan.nextInt();
		
		 double soma =  soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("soma: "+ soma);
		System.out.println("sub:"+subtracao);
		System.out.println("multi: "+multiplicacao);
		System.out.println("divi"+divisao);
		
	}

	public static double soma(double a, double b) {
	return a+b;
		}
	
	public static double subtracao(double a, double b) {
		return a-b;
	}
	
	public static double divisao(double a, double b) {
		return a/b;
	}
	
	public static double multiplicacao(double a,double b) {
		return a*b;
	}
	
	
}
