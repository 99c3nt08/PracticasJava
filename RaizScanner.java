package jodenmyacevedo.entrada_salida;
import java.util.Scanner;
public class RaizScanner {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner (System.in);
		 System.out.println("Introduce un numero: ");
		 
		 int numero1=entrada.nextInt();
		
		 System.out.println("La raiz cuadrada de " +numero1 + " es = " + Math.sqrt(numero1));
		 
		 entrada.close();
	}

}
