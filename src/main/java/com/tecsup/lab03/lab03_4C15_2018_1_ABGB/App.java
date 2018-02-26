package com.tecsup.lab03.lab03_4C15_2018_1_ABGB;

import javax.swing.JOptionPane;
public class App 
{
    public static void main( String[] args )
    {
        operacion1 operaciones = new operacion1();
        JOptionPane.showMessageDialog(null, "La resta es : " + operaciones.realizarresta());
        JOptionPane.showMessageDialog(null, "La suma es : " + operaciones.realizarsuma());
        
        
    }
}
