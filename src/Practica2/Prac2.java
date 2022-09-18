package Practica2;

import java.util.Arrays;

public class Prac2 {
	
	public Prac2() {
		// TODO Auto-generated constructor stub
	}
	
	public int canDigitosPares(int num) {
		
		int cont = 0;											//1
			
		while(num != 0) {										//n2
			if(num % 2 == 0) 
				cont++;
				
			num = num/10;										//1 + 1
		}
		
		return cont;											//1
	}
	
	public boolean palindromo(String texto) {
		
		boolean es = true;										//1
		int letraFin = texto.length()-1;								//1
		
		for(int i = 1; i < texto.length(); i++) {							//n2 + 1
			if(texto.toUpperCase().charAt(i) != (texto.toUpperCase().charAt(letraFin - i))) 
				es = false;									//1
					
		}
		
		return es;											//1
	}
	
	public boolean numCapicua(int numero) {
		
		boolean es = true;										//1
		String numText = numero + "";									//1 + 1
		int NumFin = numText.length()-1;								//1 
		
		for(int i = 1; i < numText.length(); i++) {							//n2
			if(numText.charAt(i) != (numText.charAt(NumFin - i))) 
				es = false;									//1
					
		}
		
		return es;											//1
	}
	
	public int RepiteFlotante(float arreglo [], float busca) {	
		int repite = 0;											//1
		for(int i = 0; i < arreglo.length; i++) { 							//n2 + 1
			if (arreglo[i] == busca) 
				repite++;									
		}
		return repite;											//1		
	}
	
	public int [] ordenaChaquiras(int chaquira[]) {
		boolean usado[] = new boolean [chaquira.length];						//1 + 1
		int repite[] = new int [5];									//1 + 1
		Arrays.sort(chaquira);										//1
		
		for(int i = 0; i < chaquira.length; i++) {							//n2
			
			if (chaquira[i] == chaquira[i+1]) {
			
				
				
			}
			
		}
		
		return chaquira;										//2
	}
	
		//COMPLEJIDAD ESPACIAL 21 +  n6 + 2
		//COMPLEJIDAD TEMPORAL 1 + n2 + 1 + 1 + 1 + 1 + n2 + 7 + 1 + 1 + 1 + n2 + 1 + 6 + n2 + 2
	

}
