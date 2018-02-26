package com.tecsup.lab03.lab03_4C15_2018_1_ABGB;

import javax.swing.JOptionPane;

public class App 
{
	
	
	int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar número 1"));
    int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar número 2")); 
     
    public static void main( String[] args )
    
    {
  
    	 
         
        operacion1 operaciones = new operacion1();
        Operacion2 operaciones1 = new Operacion2();
        
        JOptionPane.showMessageDialog(null, "La resta es : " + operaciones.realizarresta());
        JOptionPane.showMessageDialog(null, "La suma es : " + operaciones.realizarsuma());
    	
    	JOptionPane.showMessageDialog(null, "La multiplicacion es : "+operaciones1.hacermmultiplicacion());
    	JOptionPane.showMessageDialog(null, "La division es : "+operaciones1.hacerdivision());
    	
    	
    }
}
