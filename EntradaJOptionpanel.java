package jodenmyacevedo.entrada_salida;

import javax.swing.*;

public class EntradaJOptionpanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
				
		System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " a�os");
		
	}

}
