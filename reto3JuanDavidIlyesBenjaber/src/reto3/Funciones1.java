package reto3;

import java.util.Scanner;

public class Funciones1 {
	
public static void menu1(Scanner sc) {
		System.out.println("Selecciona que haras: \n"
				+ "1. Opcion1 \n"
				+ "2. Opcion2");
		int seleccion = Integer.parseInt(sc.nextLine());
		switch (seleccion){
		
	
		case 1:

		
		String nombre = "a";
		int nombreMasPequenoNUM = Integer.MAX_VALUE;
		String nombreMasPequeno = "Z";
		int contadorNombrePequeno = 0;
		String nombre_alfabeticamente_primero = "";
		
		try {
		do
		{
			//Primera_parte
			System.out.print("Dime un nombre: ");
			nombre = sc.nextLine();
			int ultimaLetra = nombre.length();
			String primeraLetra = nombre.substring(0,1);
			System.out.println(primeraLetra.toUpperCase() + nombre.substring(1,ultimaLetra));
			System.out.println();
			
			//Segunda_parte(A)
			if(nombre.length() < nombreMasPequenoNUM && contadorNombrePequeno == 0) {
				nombreMasPequeno = nombre;
				contadorNombrePequeno++;
			}
			
			//Tercera_parte(B)
			if(nombre_alfabeticamente_primero.compareTo(nombre) > 0) {
				nombre_alfabeticamente_primero = nombre;
			}
			
			
		}while(nombre != "");
		} catch (Exception e) {
		}
		
		System.out.println();
		System.out.println("El nombre mas queño a sido: " + nombreMasPequeno);
		System.out.println("El nombre alfabeticamente primero es: " + nombre_alfabeticamente_primero);
		break;
		
		}
}
}