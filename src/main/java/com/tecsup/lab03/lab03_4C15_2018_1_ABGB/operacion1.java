package com.tecsup.lab03.lab03_4C15_2018_1_ABGB;
import javax.swing.JOptionPane;

public class operacion1
{
   
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar número 1"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar número 2"));
        int resta;
        int suma;
        
     int realizarresta() {
            if (a>b) {
            resta= (a - b);
    			
    		}else {
    			JOptionPane.showMessageDialog(null, "La operación no se puede realizar");
    		}
            return resta;
        }
     
     public int realizarsuma() {
    	 suma= (a+b);
    	 return suma;
     }
        }


