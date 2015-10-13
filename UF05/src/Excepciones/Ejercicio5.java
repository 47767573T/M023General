package Excepciones;

import java.io.*;


public class Ejercicio5 {

	public static void main(String[] args) {
		
		boolean salir = false;
		
		
		while (!salir){
		
			try{
				System.out.print("Introduce un número: ");
				InputStreamReader isr = new InputStreamReader(System.in);	
				BufferedReader br = new BufferedReader (isr);
				
				String str = br.readLine();
				
				int numero = Integer.parseInt(str);
				int validarEntero = numero*numero;
				
				System.out.println("numero entero!");
				
				salir = true;				
			
			}catch (Exception e){
				e.printStackTrace();
			}
		}		
	}
}