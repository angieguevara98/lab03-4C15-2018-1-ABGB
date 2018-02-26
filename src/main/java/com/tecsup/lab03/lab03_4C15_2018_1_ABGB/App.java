package com.tecsup.lab03.lab03_4C15_2018_1_ABGB;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Operacion2 operaciones = new Operacion2();
    	
    	JOptionPane.showMessageDialog(null, "La multiplicacion es : "+operaciones.hacermmultiplicacion());
    	JOptionPane.showMessageDialog(null, "La division es : "+operaciones.hacerdivision());
    	
    }
}
