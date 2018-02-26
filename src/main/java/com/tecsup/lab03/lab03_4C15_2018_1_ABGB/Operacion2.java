package com.tecsup.lab03.lab03_4C15_2018_1_ABGB;

import javax.swing.JOptionPane;


public class Operacion2 {
	
	int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese  número 1"));
	int b=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese  número 2"));
	int division;
	int multiplicacion;

	
	public int hacermmultiplicacion() {
    
				
		  multiplicacion= a *b ;
		
		
		return multiplicacion;

    }
	
	
	public int hacerdivision() {
		
		if(a>b) {
			
		
			
			division = a/b ;
			
		} else
		{
			JOptionPane.showMessageDialog(null,"Los números no son válidos para la division");
			
		}
		
		return division;
		
	}
}
