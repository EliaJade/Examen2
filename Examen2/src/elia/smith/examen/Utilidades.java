package elia.smith.examen;

import java.util.Scanner;

public class Utilidades {

	//PARTE 5
	
	public static boolean esPrimo(int numero) {
		boolean primo = true;
		if(numero>1) {
			if((numero%2==0)||(numero%3==0)||(numero%4==0)||(numero%5==0)||(numero%6==0)||(numero%7==0)||(numero%8==0)||(numero%9==0)){
				primo=false;
			}
			System.out.println("Is the number prime? " +primo);
		} else {
			System.out.println("that number is lower than 1");
		}
		
		return primo;
		
	}
	
	public static void normalizaEspacios(String s) {
		for(int i= 0; i<10; i++) {
			s = s.replace("   ", " ");
			s = s.replace("    ", " ");
			 s= s.strip();
		}
		
		 System.out.println(s);
		
	}
	
	public static void main(String[]args) {
		
		int numero=102;
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		esPrimo(numero);
		
		
		String sentance = "  Hello world          of mine ";
		normalizaEspacios(sentance);
	}
}
