package com.tecsup.lab03.lab03_4C15_2018_1_ABGB;
import javax.swing.JOptionPane;

public class operacion1
{

	
        int resta;
        int suma;
        App ap = new App();
        
        
     public int realizarresta() {
            if (ap.a>ap.b) {
            resta= (ap.a- ap.b);
    			
    		}else {
    			JOptionPane.showMessageDialog(null, "La operación no se puede realizar");
    		}
            return resta;
        }
     
     public int realizarsuma() {
    	 suma= (ap.a+ap.b);
    	 return suma;
     }
        }


