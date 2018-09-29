package jodenmyacevedo.entrada_salida;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class EntradaSalida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		/*
		 System.out.println("Introduce el primer numero, por favor");

		 int numero1=entrada.nextInt();
		 
		 System.out.println("Introduce el segundo numero, por favor");
		 
		 int numero2=entrada.nextInt();
		 
		 System.out.println("El resultado es: " + (numero1  + numero2));
		 
		 entrada.close();
		 */
		
		System.out.println("Introduce tu edad, por favor");
		  
		  int edad=entrada.nextInt();
		
		  System.out.println("Introduce tu nombre por favor");
		  
		  entrada.nextLine();
		  
		  String nombre=entrada.nextLine();

		  System.out.println("Te llamas " + nombre + " y tienes " + edad + " años");
		  
		  entrada.close();
				   
		
	}

}
