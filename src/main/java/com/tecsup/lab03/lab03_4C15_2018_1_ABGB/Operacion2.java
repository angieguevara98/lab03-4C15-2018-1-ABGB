package com.tecsup.lab03.lab03_4C15_2018_1_ABGB;

import javax.swing.JOptionPane;


public class Operacion2 {
	
	
	int division;
	int multiplicacion;

	App ap = new App();
	
	public int hacermmultiplicacion() {
    
				
		  multiplicacion= ap.a * ap.b;
		
		
		return multiplicacion;

    }
	
	
	public int hacerdivision() {
		
		if(ap.a> ap.b) {
			
		
			
			division = ap.a/ap.b ;
			
		} else
		{
			JOptionPane.showMessageDialog(null,"Los números no son válidos para la division");
			
		}
		
		return division;
		
	}
}
